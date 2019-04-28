package com.terra.sendemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.terra.sendemail.model.Usuario;
import com.terra.sendemail.repository.UsuarioRepository;

@SpringBootApplication
public class SendEmailApiApplication implements CommandLineRunner {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private BCryptPasswordEncoder pe;

	public static void main(String[] args) {
		SpringApplication.run(SendEmailApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Usuario usuario = new Usuario(null, "aaa", "lucas@lucas.com", pe.encode("12345678"));

		usuarioRepository.save(usuario);
	}
}
