package capgemini.eureka.client;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
public class MainService {

    private final EurekaDiscoveryClient client;

    private final RestTemplate restTemplate;

    public void run() {
        List<String> services = client.getServices();
        List<org.springframework.cloud.client.ServiceInstance> instances = client.getInstances("client");
    }

    public void sendRequest() {
        restTemplate.getForEntity("http://hello:9000/hello/", String.class);
    }
}
