package capgemini.eureka.client;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.loadbalancer.core.DiscoveryClientServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ServiceSupplierConfiguration {

    @Bean
    public ServiceInstanceListSupplier serviceSupplier(DiscoveryClient delegate, Environment environment) {
        return new DiscoveryClientServiceInstanceListSupplier(delegate, environment);
    }
}
