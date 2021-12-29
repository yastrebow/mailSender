package ru.yastrebov.mailsender.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailSenderServiceImpl {

    private final JavaMailSender emailSender;

    public void sendEmail(String message) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("yastrebow@gmail.com");
        email.setSubject("Employee DB");
        email.setText("Receive Message from EmployeeDB: " + message);

        System.out.println("Email is ready to send");

        emailSender.send(email);
    }
}
