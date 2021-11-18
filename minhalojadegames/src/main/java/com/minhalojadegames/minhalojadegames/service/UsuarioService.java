package com.minhalojadegames.minhalojadegames.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.minhalojadegames.minhalojadegames.model.Usuario;
import com.minhalojadegames.minhalojadegames.model.UsuarioLogin;
=======
import com.minhalojadegames.minhalojadegames.model.UserLogin;
import com.minhalojadegames.minhalojadegames.model.Usuario;
>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
import com.minhalojadegames.minhalojadegames.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
<<<<<<< HEAD
	
	public Usuario cadastrarUsuario(Usuario user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(user.getSenha());
		user.setSenha(senhaEncoder);
		
		return repository.save(user);
	}
	
	public Optional<UsuarioLogin> logar(Optional<UsuarioLogin> user) { //vai retornar para o usuario o user, nome, senha e token
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); //criar um objeto encoder
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario()); //fazer a pesquisa pelo nome do usario
		
		if(usuario.isPresent()) {//se tiver algo dentro do objeto usuario, vai comparar a senha dada pela senha que tem
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) { //se for igual uma senha com a outra, vai entrar nesse if
				
				String auth = user.get().getUsuario() + ":" + user.get().getSenha(); //variavel tipo string nome auth, vai concatenar 2 informações, usuario e senha com : entre elas
				byte[] encodeAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII"))); //array de byte, pega o encode codificado em base64 e dentro desse code ele receber a string auth e dentro da string tem o formato byte no formato USACCI
				String authHeader = "Basic " + new String(encodeAuth); //criando string de no autenticação head, e dentro dela passamos o prefixo basic e concatena com instacia de novo String recebendo (encodeAuth)
			
				user.get().setToken(authHeader); //pega o user. get e colocar a informação do authHeader
				user.get().setNome(usuario.get().getNome()); //acessa o user e colocar  que veio no usarName;;
			
				return user; //retorna o user
			}
		}
		return null; //se não entrar no if retorna um nulo
	}
=======

	public Usuario CadastrarUsuario(Usuario usuario) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String senhaEncoder = encoder.encode(usuario.getSenha());
		usuario.setSenha(senhaEncoder);

		return repository.save(usuario);
	}

	public Optional<UserLogin> Logar(Optional<UserLogin> user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());

		if (usuario.isPresent()) {
			if (encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {

				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);

				user.get().setToken(authHeader);
				user.get().setNome(usuario.get().getNome());

				return user;
			}
		}
		return null;
	}

>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
}
