package ru.yastrebov.mailsender.kafka;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.yastrebov.mailsender.service.Impl.EmailSenderServiceImpl;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    private final EmailSenderServiceImpl emailSenderService;

    @KafkaListener(topics = "employeeDB", groupId = "${spring.kafka.consumer.group-id")
    private void listenGroupEmployee(ConsumerRecord<String, String> message) {

        System.out.println("Receive Message: " + message);

        emailSenderService.sendEmail(message.value());
    }

}