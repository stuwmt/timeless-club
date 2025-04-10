package com.timeless.subject.infra.basic.service;

import com.timeless.subject.common.entity.PageResult;
import com.timeless.subject.infra.basic.entity.SubjectInfoEs;

public interface SubjectEsService {

    boolean insert(SubjectInfoEs subjectInfoEs);

    PageResult<SubjectInfoEs> querySubjectList(SubjectInfoEs subjectInfoEs);

}
