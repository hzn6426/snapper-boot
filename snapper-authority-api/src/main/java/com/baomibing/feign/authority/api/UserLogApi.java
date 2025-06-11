package com.baomibing.feign.authority.api;

import com.baomibing.feign.authority.dto.UserLogWrapDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户日志远程调用
 *
 * @author zening
 * @since  1.0.0
 */
@FeignClient(name = "snapper-gateway", path = "/feign/authority/userLog", url = "${feign.client.url}")
public interface UserLogApi {

	/**
     * 保存用户业务日志
     *
     * @param userLogWrap 日志
     */
	@PostMapping
    void saveUserLog(@RequestBody UserLogWrapDto userLogWrap);
}
