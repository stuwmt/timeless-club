package com.timeless.interview.server.service;

import com.timeless.interview.api.req.InterviewReq;
import com.timeless.interview.api.req.InterviewSubmitReq;
import com.timeless.interview.api.req.StartReq;
import com.timeless.interview.api.vo.InterviewQuestionVO;
import com.timeless.interview.api.vo.InterviewResultVO;
import com.timeless.interview.api.vo.InterviewVO;

public interface InterviewService {

    InterviewVO analyse(InterviewReq req);

    InterviewQuestionVO start(StartReq req);

    InterviewResultVO submit(InterviewSubmitReq req);
}
