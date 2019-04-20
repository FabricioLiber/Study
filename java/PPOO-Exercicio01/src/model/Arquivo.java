package model;

import java.time.LocalDateTime;

public class Arquivo implements Cloneable {
	private String nome, path, proprietario, email;
	private LocalDateTime dataHora;
	private boolean autorizacaoImpressao, autorizacaoCopia;
	
	public Arquivo () {}
	
	public Arquivo (String nome, String path) {
		this.nome = nome;
		this.path = path;
	}
	
	public void escrever () {
		System.out.println("Estou escrevendo!");
	}
	
	public void ler () {
		System.out.println("Estou lendo!");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public boolean isAutorizacaoImpressao() {
		return autorizacaoImpressao;
	}

	public void setAutorizacaoImpressao(boolean autorizacaoImpressao) {
		this.autorizacaoImpressao = autorizacaoImpressao;
	}

	public boolean isAutorizacaoCopia() {
		return autorizacaoCopia;
	}

	public void setAutorizacaoCopia(boolean autorizacaoCopia) {
		this.autorizacaoCopia = autorizacaoCopia;
	}

	@Override
	public Arquivo clone () throws CloneNotSupportedException {
		return (Arquivo) super.clone();		
	}
}
