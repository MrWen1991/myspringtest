package com.xiaovka.demo.configuration;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description:
 * @Author: wenjiajia
 * @Data: 2018/7/30 下午11:17
 */
@Configuration
public class MyConfiguration {
    @Bean
    public TransportClient client() throws UnknownHostException {
        InetSocketTransportAddress node = new InetSocketTransportAddress(
                InetAddress.getByName("localhost"),
                9300
        );

        Settings settings = Settings.builder()
                .put("cluster.name", "wali")
                .build();
        TransportClient client = new PreBuiltTransportClient(settings);
        client.addTransportAddress(node);
    }
}
