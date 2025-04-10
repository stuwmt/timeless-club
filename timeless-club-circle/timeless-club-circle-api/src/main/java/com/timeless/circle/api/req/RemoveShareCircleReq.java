package com.timeless.circle.api.req;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 圈子信息
 * </p>
 */
@Getter
@Setter
public class RemoveShareCircleReq implements Serializable {

    private Long id;

}
