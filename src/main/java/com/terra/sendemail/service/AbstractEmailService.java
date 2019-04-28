package com.terra.sendemail.service;

import java.util.Date;

import org.springframework.mail.SimpleMailMessage;

import com.terra.sendemail.model.Email;

public abstract class AbstractEmailService implements EmailService {

	@Override
	public void sendOrderConfirmationEmail(Email obj) {
		SimpleMailMessage sm = prepareSimpleMailMessageFromPedido(obj);
		sendEmail(sm);
	}

	protected SimpleMailMessage prepareSimpleMailMessageFromPedido(Email email) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setTo("ateliebrig@gmail.com");
		sm.setFrom("ateliebrig@gmail.com");
		sm.setSubject(email.getAssunto());
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setText(email.getMensagem());
		return sm;
	}

}
