package ru.yastrebov.mailsender.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yastrebov.mailsender.service.MailSenderService;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class MailSenderController {

    private final MailSenderService emailSender;

    @GetMapping("/sendEmail")
    public ResponseEntity<String> sendEmail() {

        return emailSender.sendEmail();
    }
}
