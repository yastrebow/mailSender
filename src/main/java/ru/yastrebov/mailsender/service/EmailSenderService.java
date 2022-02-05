package ru.yastrebov.mailsender.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {

    SimpleMailMessage sendEmail(String message);
}
