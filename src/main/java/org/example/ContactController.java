package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private JavaMailSender mailSender;

    @PostMapping("/contact")
    public String sendContactEmail(@RequestParam String name,
                                   @RequestParam String email,
                                   @RequestParam String message) {

        // Create a simple mail message
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("your_email@gmail.com"); // Replace with your email
        mail.setSubject("New Message from " + name);
        mail.setText("Sender: " + name + "\nEmail: " + email + "\n\nMessage:\n" + message);

        // Send the email
        mailSender.send(mail);

        return "Message sent successfully!";
    }
}
