package ru.yastrebov.mailsender.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import ru.yastrebov.mailsender.service.MailSenderService;

@Service
@RequiredArgsConstructor
public class MailSenderServiceImpl implements MailSenderService {

    private final JavaMailSender emailSender;

    @Override
    public String sendEmail() {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("yastrebow@gmail.com");
        message.setSubject("Test Simple Email");
        message.setText("Hello, I'm testing Simple Email");

        emailSender.send(message);

        return "Email sent!";
    }
}
