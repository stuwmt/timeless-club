package com.timeless.interview.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.timeless.interview.api.vo.InterviewQuestionHistoryVO;
import com.timeless.interview.server.entity.po.InterviewQuestionHistory;

import java.util.List;

/**
 * 面试题目记录表(InterviewQuestionHistory)表服务接口

 */
public interface InterviewQuestionHistoryService extends IService<InterviewQuestionHistory> {

    List<InterviewQuestionHistoryVO> detail(Long id);

}
