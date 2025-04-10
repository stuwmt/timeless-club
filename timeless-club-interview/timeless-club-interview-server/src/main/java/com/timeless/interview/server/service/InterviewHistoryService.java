package com.timeless.interview.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.timeless.interview.api.common.PageResult;
import com.timeless.interview.api.req.InterviewHistoryReq;
import com.timeless.interview.api.req.InterviewSubmitReq;
import com.timeless.interview.api.vo.InterviewHistoryVO;
import com.timeless.interview.api.vo.InterviewResultVO;
import com.timeless.interview.server.entity.po.InterviewHistory;

/**
 * 面试汇总记录表(InterviewHistory)表服务接口
 */
public interface InterviewHistoryService extends IService<InterviewHistory> {

    void logInterview(InterviewSubmitReq req, InterviewResultVO submit);


    PageResult<InterviewHistoryVO> getHistory(InterviewHistoryReq req);

}
