package ru.nikitinfo.clientserver;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import ru.nikitinfo.sourceserver.SourceServerResponse;

@RestController
public class ClientServerController {

    private final ConnectionConfig config;
    private final RestTemplate restTemplate = new RestTemplate();

    public ClientServerController(ConnectionConfig config) {
        this.config = config;
    }

    @GetMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
    public Object getInformation() {
        String url = getSourceUrl();
        return getInformationFromSourceServer(url);
    }

    private Object getInformationFromSourceServer(String url) {
        try {
            ResponseEntity<SourceServerResponse> response = restTemplate.getForEntity(url, SourceServerResponse.class);
            if (response.getStatusCode() == HttpStatus.OK) {
                return new ClientServerResponse(response.getBody());
            }
        } catch (RestClientException e) {
            return "Can't connect to source server.";
        }
        return "Status code is not 200.";
    }

    private String getSourceUrl() {
        return String.format("http://%s:%d", config.getClientHost(), config.getClientPort());
    }
}
