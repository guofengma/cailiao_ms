package com.whut.cailiao.api.service.questionnaire;

import com.whut.cailiao.api.commons.ApiResponse;
import com.whut.cailiao.api.model.questionnaire.QuestionnaireContent;

/**
 * Created by niuyang on 16/3/5.
 */
public interface QuestionnaireService {

    /**
     * using
     * 临时保存已经填写的问卷
     * @param questionnaireContent
     * @return
     */
    ApiResponse saveQuestionnaireContentTemp(QuestionnaireContent questionnaireContent);

    /**
     * using
     * 提交填写的问卷
     * @param questionnaireContent
     * @return
     */
    ApiResponse commitQuestionnaireContent(QuestionnaireContent questionnaireContent);

    /**
     * 获取某用户填写的问卷列表(某一问卷模板下)
     * @Param questionnaireTemplateId
     * @Param accountId
     * @return
     */
    ApiResponse getQuestionnaireContentListByAccountId(int questionnaireTemplateId, String accountId);

    /**
     * 正在使用中的问卷模板列表
     * 从问卷模板的发布表中读取(正式表)
     */
    ApiResponse getUsingQuestionnaireTemplateList();

    /**
     * 查看问卷填写详情
     * @param questionnaireContentId
     * @return
     */
    ApiResponse getQuestionnaireContent(int questionnaireContentId);

    /**
     * 删除填写的某条问卷
     * @param questionnaireContentId
     * @return
     */
    ApiResponse deleteQuestionnaireContent(int questionnaireContentId);


    /**
     * 分页获取某模板下提交的问卷
     * @param questionnaireTemplateId
     * @param currentPage
     * @param pageSize
     * @return
     */
    ApiResponse getQuestionnaireContentCommitList(int questionnaireTemplateId, int currentPage, int pageSize);

    /**
     * 审核提交的问卷
     * @param questionnaireContentId
     * @param isPass
     * @param rejectReason
     * @return
     */
    ApiResponse examineCommittedQuestionnaireContent(int questionnaireContentId, boolean isPass, String rejectReason);
    
    /**
     * 获取某一问卷模板下的问卷总数量
     * @param questionnaireTemplateId
     * @return
     */
    ApiResponse getQuestionnaireContentCount(int questionnaireTemplateId);

}
