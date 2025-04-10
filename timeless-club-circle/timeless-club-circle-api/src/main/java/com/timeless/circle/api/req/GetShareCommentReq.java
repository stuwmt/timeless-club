package com.timeless.circle.api.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 鸡圈内容信息
 * </p>
 */
@Getter
@Setter
public class GetShareCommentReq implements Serializable {

    private Long id;

}
