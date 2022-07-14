package capgemini.cloud.kafka;

import capgemini.cloud.client.ProductClient;
import capgemini.cloud.model.Product;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafksHandler {

    private final ProductClient productClient;

    @KafkaListener
    public void handleMessage(@Payload ProductCreatedEvent event) {
        int productId = event.getProductId();
        try {
            Product product = productClient.findById(productId);
            log.info("New product: {}", product);
        } catch (Exception ex) {
            log.error("Error when fetching product: " + ex.getMessage(), ex);
        }
    }
}
