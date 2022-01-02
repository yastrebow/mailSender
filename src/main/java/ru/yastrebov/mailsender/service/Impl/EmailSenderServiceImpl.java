package ru.yastrebov.mailsender.service.Impl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import ru.yastrebov.mailsender.service.EmailSenderService;

@Service
@RequiredArgsConstructor
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender emailSender;

    public void sendEmail(String message) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("yastrebow@gmail.com");
        email.setSubject("Employee DB");
        email.setText("Receive Message from EmployeeDB: " + message);

        Logger LOG = LoggerFactory.getLogger(EmailSenderServiceImpl.class);
        LOG.info("Email is ready to send");

        emailSender.send(email);
    }
}
