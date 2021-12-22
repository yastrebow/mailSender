package ru.yastrebov.mailsender.controller;


import lombok.AllArgsConstructor;
import org.springframework.mail.MailMessage;
import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@AllArgsConstructor
public class MailSenderController {

    public JavaMailSender emailSender;

    @ResponseBody
    @RequestMapping("/sendEmail")
    public String sendEmail() {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo("yastrebow@gmail.com");
        message.setSubject("Test Simple Email");
        message.setText("Hello, I'm testing Simple Email");

        this.emailSender.send(message);

        return "Email Sent!!!";
    }
}
