package ru.nikitinfo.sourceserver;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SourceServerController {

    @GetMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
    public SourceServerResponse getInformation(HttpServletRequest request) {
        log.info("Request from {}", request.getRequestURL());
        return new SourceServerResponse("Information from SourceServer");
    }
}
