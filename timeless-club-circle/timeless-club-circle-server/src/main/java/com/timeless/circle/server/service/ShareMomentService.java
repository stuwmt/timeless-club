package com.timeless.circle.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.timeless.circle.api.common.PageResult;
import com.timeless.circle.api.req.GetShareMomentReq;
import com.timeless.circle.api.req.RemoveShareMomentReq;
import com.timeless.circle.api.req.SaveMomentCircleReq;
import com.timeless.circle.api.vo.ShareMomentVO;
import com.timeless.circle.server.entity.po.ShareMoment;

/**
 * <p>
 * 动态信息 服务类
 * </p>
 */
public interface ShareMomentService extends IService<ShareMoment> {

    Boolean saveMoment(SaveMomentCircleReq req);

    PageResult<ShareMomentVO> getMoments(GetShareMomentReq req);

    Boolean removeMoment(RemoveShareMomentReq req);

    void incrReplyCount(Long id, int count);

}
