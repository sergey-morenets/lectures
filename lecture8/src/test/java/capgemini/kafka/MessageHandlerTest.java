package capgemini.kafka;

import capgemini.kafka.event.UserRegisteredEvent;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.util.concurrent.ListenableFuture;

@SpringBootTest(classes = KafkaApplication.class)
@DirtiesContext
@EmbeddedKafka(topics = "users")
class MessageHandlerTest {

    @Autowired
    KafkaTemplate<Integer, UserRegisteredEvent> kafkaTemplate;

    // @Autowired
    KafkaConsumer<Integer, UserRegisteredEvent> kafkaConsumer;

    @Test
    void onMessageHandle_newEventSent_success() throws Exception {
        User user = new User();
        user.setId(1);
        user.setEmail("email");
        ListenableFuture<SendResult<Integer, UserRegisteredEvent>> future =
                kafkaTemplate.send("users", user.getId(), new UserRegisteredEvent(user));
        future.get();
//        ConsumerRecords<Integer, UserRegisteredEvent> records = kafkaConsumer.poll(Duration.of(1, ChronoUnit.SECONDS));
//        int recordCount = records.count();
//        assertEquals(1, recordCount);
    }
}