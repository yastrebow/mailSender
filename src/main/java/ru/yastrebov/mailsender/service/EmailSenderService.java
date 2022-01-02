package ru.yastrebov.mailsender.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {

    void sendEmail(String message);
}
