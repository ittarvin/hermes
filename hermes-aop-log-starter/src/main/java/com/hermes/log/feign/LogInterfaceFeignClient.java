package com.hermes.log.feign;


import com.hermes.log.msg.UserOperationLogVO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("serverId")
public interface LogInterfaceFeignClient {

    @PostMapping("/bxcxlog/insertLog")
    String insertLog(@RequestBody UserOperationLogVO content);

}
