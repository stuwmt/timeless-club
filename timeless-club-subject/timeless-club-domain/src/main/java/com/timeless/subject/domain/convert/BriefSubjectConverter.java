package com.timeless.subject.domain.convert;

import com.timeless.subject.domain.entity.SubjectAnswerBO;
import com.timeless.subject.domain.entity.SubjectInfoBO;
import com.timeless.subject.infra.basic.entity.SubjectBrief;
import com.timeless.subject.infra.basic.entity.SubjectMultiple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BriefSubjectConverter {

    BriefSubjectConverter INSTANCE = Mappers.getMapper(BriefSubjectConverter.class);

    SubjectBrief convertBoToEntity(SubjectInfoBO subjectInfoBO);

}
