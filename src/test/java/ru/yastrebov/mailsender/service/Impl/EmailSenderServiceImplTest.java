package ru.yastrebov.mailsender.service.Impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class EmailSenderServiceImplTest {

    @Test
    void sendEmailTest() {
        SimpleMailMessage mockerEmail = mock(SimpleMailMessage.class);

        mockerEmail.setTo("yastrebow@gmail.com");
        mockerEmail.setSubject("Employee DB");
        mockerEmail.setText("Receive Message from EmployeeDB: " + "Email sent!");

        verify(mockerEmail, times(1)).setText("Receive Message from EmployeeDB: " + "Email sent!");
    }

}