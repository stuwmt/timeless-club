package com.timeless.subject.domain.handler.subject;

import com.timeless.subject.common.enums.IsDeletedFlagEnum;
import com.timeless.subject.common.enums.SubjectInfoTypeEnum;
import com.timeless.subject.domain.convert.JudgeSubjectConverter;
import com.timeless.subject.domain.convert.MultipleSubjectConverter;
import com.timeless.subject.domain.convert.RadioSubjectConverter;
import com.timeless.subject.domain.entity.SubjectAnswerBO;
import com.timeless.subject.domain.entity.SubjectInfoBO;
import com.timeless.subject.domain.entity.SubjectOptionBO;
import com.timeless.subject.infra.basic.entity.SubjectJudge;
import com.timeless.subject.infra.basic.entity.SubjectMultiple;
import com.timeless.subject.infra.basic.entity.SubjectRadio;
import com.timeless.subject.infra.basic.service.SubjectMultipleService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * 多选题目的策略类
 */
@Component
public class MultipleTypeHandler implements SubjectTypeHandler {

    @Resource
    private SubjectMultipleService subjectMultipleService;

    @Override
    public SubjectInfoTypeEnum getHandlerType() {
        return SubjectInfoTypeEnum.MULTIPLE;
    }

    @Override
    public void add(SubjectInfoBO subjectInfoBO) {
        // 多选题目的插入
        List<SubjectMultiple> subjectMultipleList = new LinkedList<>();
        subjectInfoBO.getOptionList().forEach(option -> {
            SubjectMultiple subjectMultiple = MultipleSubjectConverter.INSTANCE.convertBoToEntity(option);
            subjectMultiple.setSubjectId(subjectInfoBO.getId());
            subjectMultiple.setIsDeleted(IsDeletedFlagEnum.UN_DELETED.getCode());
            subjectMultipleList.add(subjectMultiple);
        });
        subjectMultipleService.batchInsert(subjectMultipleList);
    }

    @Override
    public SubjectOptionBO query(int subjectId) {
        SubjectMultiple subjectMultiple = new SubjectMultiple();
        subjectMultiple.setSubjectId(Long.valueOf(subjectId));
        List<SubjectMultiple> result = subjectMultipleService.queryByCondition(subjectMultiple);
        List<SubjectAnswerBO> subjectAnswerBOList = MultipleSubjectConverter.INSTANCE.convertEntityToBoList(result);
        SubjectOptionBO subjectOptionBO = new SubjectOptionBO();
        subjectOptionBO.setOptionList(subjectAnswerBOList);
        return subjectOptionBO;
    }
}
