package com.whut.cailiao.impl.interceptor;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.whut.cailiao.api.constant.UserConstant;
import com.whut.cailiao.api.model.user.Privilege;
import com.whut.cailiao.api.model.user.User;

import org.apache.commons.collections4.MapUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gammaniu on 16/4/19.
 */
public class PrivilegeIntercepter implements HandlerInterceptor {

    private static Map<Privilege, Integer> map = new HashMap<>();

    static {
        map.put(new Privilege("/main/home.html", "GET"), 101);
        map.put(new Privilege("/main/dashboard.html", "GET"), 102);

        map.put(new Privilege("/user/info.html", "GET"), 201);

        map.put(new Privilege("/news/list.html", "GET"), 301);
        map.put(new Privilege("/news/getNewsList.html", "GET"), 302);
        map.put(new Privilege("/news/create.html", "GET"), 303);
        map.put(new Privilege("/news/publish.html", "POST"), 304);
        map.put(new Privilege("/news/delete/[1-9][0-9]*.html", "DELETE"), 305);
        map.put(new Privilege("/news/detail/[1-9][0-9]*.html", "GET"), 306);
        map.put(new Privilege("/news/pause/[1-9][0-9]*/[1,2].html", "PUT"), 307);

        map.put(new Privilege("/wjt/create.html", "GET"), 401);
        map.put(new Privilege("/wjt/list.html", "GET"), 402);
        map.put(new Privilege("/wjt/saveTemp.html", "POST"), 403);
        map.put(new Privilege("/wjt/saveTemp.html", "PUT"), 404);
        map.put(new Privilege("/wjt/getWJList/[1-9][0-9]*.html", "GET"), 405);
        map.put(new Privilege("/wjt/deleteWJ/[1-9][0-9]*.html", "DELETE"), 406);
        map.put(new Privilege("/wjt/publishWJT/[1-9][0-9]*.html", "PUT"), 407);
        map.put(new Privilege("/wjt/getWJT/[1-9][0-9]*.html", "GET"), 408);
        
        map.put(new Privilege("/user/create.html", "GET"), 501);
    }

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null || user.getStatus() != UserConstant.Status.ACTIVE.value()) {
            return false;
        }

        Privilege privilege = new Privilege(httpServletRequest.getRequestURI(), httpServletRequest.getMethod());
        System.out.println("privilege = " + privilege);

        if (CollectionUtils.isEmpty(user.getPrivilegeIds())) {
        	return false;
        }
        
        if (MapUtils.isNotEmpty(map) && map.containsKey(privilege) && !user.getPrivilegeIds().contains(map.get(privilege))) {
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
