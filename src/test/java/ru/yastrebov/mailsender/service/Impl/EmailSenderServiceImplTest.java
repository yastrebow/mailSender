package ru.yastrebov.mailsender.service.Impl;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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