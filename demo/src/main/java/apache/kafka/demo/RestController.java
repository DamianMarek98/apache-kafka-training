package apache.kafka.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class RestController {
    private final SimpleProducer simpleProducer;

    @GetMapping(value = "publish/{topic}/{message}")
    public ResponseEntity sendMessageToKafkaTopic(@PathVariable String message, @PathVariable String topic) {
        this.simpleProducer.sendMessage(topic, message);
        return ResponseEntity.ok().build();
    }
}
