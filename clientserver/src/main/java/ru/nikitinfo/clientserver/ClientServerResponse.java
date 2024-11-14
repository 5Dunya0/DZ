package ru.nikitinfo.clientserver;

import ru.nikitinfo.sourceserver.SourceServerResponse;

import java.util.Date;

public class ClientServerResponse {
    public SourceServerResponse serverResponse;
    public String acquiredAt;

    public ClientServerResponse() {
    }

    public ClientServerResponse(SourceServerResponse serverResponse) {
        this.serverResponse = serverResponse;
        this.acquiredAt = new Date().toString();
    }
}
