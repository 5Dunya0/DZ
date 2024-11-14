package ru.nikitinfo.sourceserver;

public class SourceServerResponse {
    private static long staticId = 0;
    public long id;
    public Object payload;

    public SourceServerResponse() {
    }

    public SourceServerResponse(Object payload) {
        this.payload = payload;
        this.id = ++staticId;
    }
}
