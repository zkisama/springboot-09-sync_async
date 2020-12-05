package red.zki;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Springboot09SyncAsyncApplicationTests {


    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject("你好啊");
        message.setText("OK OK OK");

        message.setTo("727447170@qq.com");
        message.setFrom("2849213279@qq.com");


        mailSender.send(message);
    }

}
