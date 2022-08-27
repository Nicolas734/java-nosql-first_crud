package com.nosql.crud.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Usuarios {
	
	@Id
	private String id;

	private String nome;
	private String email;
	private List<Enderecos> enderecos;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Enderecos> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Enderecos> enderecos) {
		this.enderecos = enderecos;
	}
	
}
