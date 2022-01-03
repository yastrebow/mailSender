package ru.yastrebov.mailsender.service.Impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import ru.yastrebov.mailsender.service.EmailSenderService;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender emailSender;

    public void sendEmail(String message) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("yastrebow@gmail.com");
        email.setSubject("Employee DB");
        email.setText("Receive Message from EmployeeDB: " + message);

        log.info("Email is ready to send");

        emailSender.send(email);
    }
}
