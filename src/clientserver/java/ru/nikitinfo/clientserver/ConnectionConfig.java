package ru.nikitinfo.clientserver;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ConnectionConfig {
    @Value("${source-server.host}")
    private String clientHost;
    @Value("${source-server.port}")
    private int clientPort;
}
