package com.projet.BackendPfe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.projet.BackendPfe.EmailSenderService;
import com.projet.BackendPfe.repository.GeneralisteRepository;
@Service
public class MailSenderGen {
@Autowired
 EmailSenderService senderService;
public void sendMail() {
	
	senderService.sendEmail("chellymariem01@gmail.com","Inscription Validée","Bienvsqssdsenu dans notre Application Retina ");
}
}

