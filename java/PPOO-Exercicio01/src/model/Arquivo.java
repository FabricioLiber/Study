package model;

import java.time.LocalDateTime;

/*
 *  nome do arquivo, path, data, hora, proprietário, e-mail, autorização
para impressão e autorização para cópia. Sendo obritatório apenas o nome e o path do
arquivo. Um arquivo deve conter os serviços “escrever” e “ler”.
 * */
public class Arquivo implements Cloneable {
	private String nome, path, proprietario, email;
	private LocalDateTime dataHora;
	private boolean autorizacaoImpressao, autorizacaoCopia;
	
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
	
	@Override
	public Arquivo clone () throws CloneNotSupportedException {
		return (Arquivo) super.clone();		
	}
}
