package builder;

import java.time.LocalDateTime;

import model.Arquivo;

public class ArquivoBuilder implements Builder<Arquivo>{
	
	private String nome, path, proprietario, email;
	private LocalDateTime dataHora;
	private boolean autorizacaoImpressao, autorizacaoCopia;
	
	public ArquivoBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	public ArquivoBuilder path(String path) {
		this.path = path;
		return this;
	}


	public ArquivoBuilder proprietario(String proprietario) {
		this.proprietario = proprietario;
		return this;
	}


	public ArquivoBuilder email(String email) {
		this.email = email;
		return this;
	}

	public ArquivoBuilder dataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
		return this;
	}

	public ArquivoBuilder autorizacaoImpressao(boolean autorizacaoImpressao) {
		this.autorizacaoImpressao = autorizacaoImpressao;
		return this;
	}
	
	public ArquivoBuilder autorizacaoCopia(boolean autorizacaoCopia) {
		this.autorizacaoCopia = autorizacaoCopia;
		return this;
	}
	
	@Override
	public Arquivo create() {
		// TODO Auto-generated method stub
		Arquivo arquivo = new Arquivo();
		arquivo.setNome(this.nome);
		arquivo.setPath(this.path);
		arquivo.setDataHora(this.dataHora);
		arquivo.setEmail(this.email);
		arquivo.setProprietario(this.proprietario);
		arquivo.setAutorizacaoCopia(this.autorizacaoCopia);
		arquivo.setAutorizacaoImpressao(this.autorizacaoImpressao);
		return arquivo;
	}

}
