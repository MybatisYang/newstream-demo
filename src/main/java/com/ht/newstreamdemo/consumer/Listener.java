package com.ht.newstreamdemo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

/**
 * @Description: Listener
 * @Author: yjs
 * @createTime: 2022年07月01日 17:45:19
 * @version: 1.0
 */
@Service
@Slf4j
public class Listener {
    /**
     * demoChannel 是管道的名字
     * @return
     */
    @Bean
    public Consumer<String> demoChannel() {
        return message -> {
            System.out.println("receive message: " + message);
            log.info("接收消息为：{}", message);
        };
    }
}
