package apache.kafka.demo;

import lombok.extern.java.Log;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log
@Component
public class SimpleListener {

    @KafkaListener(topics = "test-1", groupId = "myGroup")
    void listener(String data) {
        log.info("Listener 1 received: " + data);
    }
}
