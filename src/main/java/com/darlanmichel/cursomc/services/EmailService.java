package com.darlanmichel.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.darlanmichel.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
