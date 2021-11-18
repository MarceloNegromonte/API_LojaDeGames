package com.minhalojadegames.minhalojadegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
import org.springframework.stereotype.Repository;

import com.minhalojadegames.minhalojadegames.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Optional<Usuario> findByUsuario(String usuario);
=======

import com.minhalojadegames.minhalojadegames.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);

>>>>>>> d49394bdc20ea03f45c6da668a21510a22f5159b
}
