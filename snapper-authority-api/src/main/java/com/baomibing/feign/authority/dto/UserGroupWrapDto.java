package com.baomibing.feign.authority.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * UserGroupWrapDto
 *
 * @author zening
 * @version 1.0.0
 **/
@Data
@Accessors(chain = true)
public class UserGroupWrapDto {

    private  String id;
    private String userNo;
    private String userId;
    private String groupId;
}
