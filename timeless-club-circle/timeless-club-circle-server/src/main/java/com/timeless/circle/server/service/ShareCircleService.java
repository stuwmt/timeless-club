package com.timeless.circle.server.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.timeless.circle.api.req.RemoveShareCircleReq;
import com.timeless.circle.api.req.SaveShareCircleReq;
import com.timeless.circle.api.req.UpdateShareCircleReq;
import com.timeless.circle.api.vo.ShareCircleVO;
import com.timeless.circle.server.entity.po.ShareCircle;

import java.util.List;

/**
 * <p>
 * 圈子信息 服务类
 * </p>
 */
public interface ShareCircleService extends IService<ShareCircle> {

    List<ShareCircleVO> listResult();

    Boolean saveCircle(SaveShareCircleReq req);

    Boolean updateCircle(UpdateShareCircleReq req);

    Boolean removeCircle(RemoveShareCircleReq req);
}
