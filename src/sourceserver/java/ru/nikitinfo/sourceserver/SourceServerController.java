package ru.nikitinfo.sourceserver;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SourceServerController {

    @GetMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
    public SourceServerResponse getInformation() {
        return new SourceServerResponse("Information from SourceServer");
    }
}
