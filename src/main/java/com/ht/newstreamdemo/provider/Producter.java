package com.ht.newstreamdemo.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @Description: Producter
 * @Author: yjs
 * @createTime: 2022年07月01日 17:43:44
 * @version: 1.0
 */
@Component
public class Producter {
    @Autowired
    private StreamBridge streamBridge;

    public String sendMessage(String meaasge){
        System.out.println("send message: " + meaasge);
        streamBridge.send("demoChannel-out-0",
                MessageBuilder.withPayload(meaasge).build());
        return null;
    }
}
