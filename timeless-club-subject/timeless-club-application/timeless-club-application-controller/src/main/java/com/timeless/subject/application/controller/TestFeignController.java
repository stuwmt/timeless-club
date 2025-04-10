package com.timeless.subject.application.controller;

import com.alibaba.fastjson.JSON;
import com.timeless.subject.common.entity.PageResult;
import com.timeless.subject.infra.basic.entity.SubjectInfoEs;
import com.timeless.subject.infra.basic.service.SubjectEsService;
import com.timeless.subject.infra.entity.UserInfo;
import com.timeless.subject.infra.rpc.UserRpc;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;

/**
 * 刷题分类controller
 */
@RestController
@RequestMapping("/subject/category")
@Slf4j
public class TestFeignController {

    @Resource
    private UserRpc userRpc;

    @GetMapping("testFeign")
    public void testFeign() {
        UserInfo userInfo = userRpc.getUserInfo("timeless");
        log.info("testFeign.userInfo:{}", userInfo);
    }

}
