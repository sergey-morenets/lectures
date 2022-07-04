package capgemini.eureka.client;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;

import java.util.List;

@RequiredArgsConstructor
public class MainService {

    private final EurekaDiscoveryClient client;

    public void run() {
        List<String> services = client.getServices();
        List<org.springframework.cloud.client.ServiceInstance> instances = client.getInstances("client");
    }
}
