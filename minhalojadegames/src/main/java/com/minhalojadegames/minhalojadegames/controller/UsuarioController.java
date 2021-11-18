package com.minhalojadegames.minhalojadegames.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PutMapping;
=======
>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.minhalojadegames.minhalojadegames.model.Usuario;
import com.minhalojadegames.minhalojadegames.model.UsuarioLogin;
import com.minhalojadegames.minhalojadegames.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "*", allowedHeaders = "*")
=======
import com.minhalojadegames.minhalojadegames.model.UserLogin;
import com.minhalojadegames.minhalojadegames.model.Usuario;
import com.minhalojadegames.minhalojadegames.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")

>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
<<<<<<< HEAD
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> Autentication(@Valid @RequestBody Optional<UsuarioLogin> user){ 
		return usuarioService.logar(user).map(resp -> ResponseEntity.ok(resp)) 
=======

	@PostMapping("/logar")
	public ResponseEntity<UserLogin> Autentication(@Valid @RequestBody Optional<UserLogin> user) {
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
<<<<<<< HEAD
	public ResponseEntity<Usuario> post(@Valid @RequestBody Usuario user){
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.cadastrarUsuario(user));
	}
=======
	public ResponseEntity<Usuario> Post(@Valid @RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.CadastrarUsuario(usuario));
	}

>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
}
