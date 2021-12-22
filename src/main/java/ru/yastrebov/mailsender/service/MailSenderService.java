package ru.yastrebov.mailsender.service;

import org.springframework.http.ResponseEntity;

public interface MailSenderService {

    ResponseEntity<String> sendEmail();
}
