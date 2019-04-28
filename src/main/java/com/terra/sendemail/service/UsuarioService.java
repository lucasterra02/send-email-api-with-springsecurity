package com.terra.sendemail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.terra.sendemail.model.Usuario;

public class UsuarioService {

	@Autowired
	private BCryptPasswordEncoder pe;

	public Usuario autentica(Usuario usuario) {

		Usuario u = new Usuario(usuario.getId(), usuario.getNome(), usuario.getEmail(), pe.encode(usuario.getSenha()));

		return u;
	}

}
