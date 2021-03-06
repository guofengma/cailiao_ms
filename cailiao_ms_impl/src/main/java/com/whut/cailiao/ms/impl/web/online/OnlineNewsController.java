package com.whut.cailiao.ms.impl.web.online;

import com.whut.cailiao.ms.api.commons.ApiResponse;
import com.whut.cailiao.ms.api.service.news.NewsService;
import com.whut.cailiao.ms.impl.web.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gammaniu on 16/4/22.
 */
@Controller
@RequestMapping("/online/news")
public class OnlineNewsController extends BaseController {

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/getList.html", method = RequestMethod.GET)
    @ResponseBody
    public String getNewsFrontEndList() {
        ApiResponse response = this.newsService.getNewsFrontEndList(20);
        return convertApiResponseToJSONString(response);
    }
}
