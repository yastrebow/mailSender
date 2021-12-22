package ru.yastrebov.mailsender.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.yastrebov.mailsender.service.MailSenderService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sendEmail")
public class MailSenderController {

    private final MailSenderService mailSenderService;

    @GetMapping()
    public ResponseEntity<String> sendEmail() {

        return ResponseEntity.ok("Email sent!");
    }
}
