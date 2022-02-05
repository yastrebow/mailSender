package ru.yastrebov.mailsender.service.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Objects;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class EmailSenderServiceImplTest {

    private static final String EMAIL_TEXT = "Email sent!";
    private static final String EMAIL_SUBJECT = "Employee DB";

    @Mock
    private JavaMailSender emailSender;

    @InjectMocks
    private EmailSenderServiceImpl emailSenderService;

    @Test
    public void sendEmail() {

        emailSenderService.sendEmail(EMAIL_TEXT);

        verify(emailSender, times(1)).send(argThat((SimpleMailMessage email) ->
                Objects.equals(email.getText(), "Receive Message from EmployeeDB: " + EMAIL_TEXT)
                        && Objects.equals(email.getSubject(), EMAIL_SUBJECT)));
    }
}