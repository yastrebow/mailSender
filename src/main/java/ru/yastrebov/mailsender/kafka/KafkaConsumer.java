package ru.yastrebov.mailsender.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.yastrebov.mailsender.service.Impl.EmailSenderServiceImpl;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumer {

    private final EmailSenderServiceImpl emailSenderService;

    @KafkaListener(topics = "employeeDB", groupId = "${spring.kafka.consumer.group-id")
    private void listenGroupEmployee(ConsumerRecord<String, String> message) {

        log.info("Receive Message: " + message);

        emailSenderService.sendEmail(message.value());
    }

}