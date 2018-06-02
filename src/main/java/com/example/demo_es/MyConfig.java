package com.example.demo_es;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by zhouli on 18/6/2
 * Email 2565510046@qq.com
 * wechat qianchaoshushui
 */
@Configuration
public class MyConfig {
    @Bean
    public TransportClient client() throws UnknownHostException {
        Settings settings = Settings.builder()
                .put("cluster.name", "json")
                .build();
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
        return client;

    }

}
