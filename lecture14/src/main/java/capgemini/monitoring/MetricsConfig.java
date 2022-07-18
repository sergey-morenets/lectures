package capgemini.monitoring;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;

@Configuration
@EnableScheduling
public class MetricsConfig {

    @Autowired
    private MeterRegistry meterRegistry;

    private Counter booksCounter;

    private int userCount = 1;

    @PostConstruct
    void init() {
        meterRegistry.counter("books", "author", "Josh Long");

        booksCounter = meterRegistry.counter("books", "author", "Phill Webb");

        meterRegistry.gauge("users", userCount);
    }

    @Scheduled(fixedDelay = 1000)
    void updateMetricValues() {
        booksCounter.increment();

        meterRegistry.gauge("users", userCount++);
    }
}
