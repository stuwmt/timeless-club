package com.timeless.subject.domain.convert;

import com.timeless.subject.domain.entity.SubjectCategoryBO;
import com.timeless.subject.domain.entity.SubjectInfoBO;
import com.timeless.subject.domain.entity.SubjectOptionBO;
import com.timeless.subject.infra.basic.entity.SubjectCategory;
import com.timeless.subject.infra.basic.entity.SubjectInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SubjectInfoConverter {

    SubjectInfoConverter INSTANCE = Mappers.getMapper(SubjectInfoConverter.class);

    SubjectInfo convertBoToInfo(SubjectInfoBO subjectInfoBO);

    SubjectInfoBO convertOptionToBo(SubjectOptionBO subjectOptionBO);

    SubjectInfoBO convertOptionAndInfoToBo(SubjectOptionBO subjectOptionBO,SubjectInfo subjectInfo);

    List<SubjectInfoBO> convertListInfoToBO(List<SubjectInfo> subjectInfoList);

}
