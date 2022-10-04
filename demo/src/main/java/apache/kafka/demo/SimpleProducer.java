package apache.kafka.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Log
@Service
@RequiredArgsConstructor
public class SimpleProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic, String message) {
        log.info("Producing message: " + message);
        kafkaTemplate.send(topic, message);
    }
}
