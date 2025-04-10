package com.timeless.circle.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.timeless.circle.api.req.GetShareCommentReq;
import com.timeless.circle.api.req.RemoveShareCommentReq;
import com.timeless.circle.api.req.SaveShareCommentReplyReq;
import com.timeless.circle.api.vo.ShareCommentReplyVO;
import com.timeless.circle.server.entity.po.ShareCommentReply;

import java.util.List;

/**
 * <p>
 * 评论及回复信息 服务类
 * </p>
 */
public interface ShareCommentReplyService extends IService<ShareCommentReply> {

    Boolean saveComment(SaveShareCommentReplyReq req);

    Boolean removeComment(RemoveShareCommentReq req);

    List<ShareCommentReplyVO> listComment(GetShareCommentReq req);

}
