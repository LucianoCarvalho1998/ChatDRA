package edu.ifam.dra.chat.dto;

import java.util.Date;

import edu.ifam.dra.chat.model.Mensagem;

public class DTOConteudo {

	private String mensagem;
	private Date date;
	private Long idEmissor;
	private Long idReceptor;
		
	
	public DTOConteudo() {
		super();
	}
	public DTOConteudo(String mensagem, Date date, Long idEmissor, Long idReceptor) {
		super();
		this.mensagem = mensagem;
		this.date = date;
		this.idEmissor = idEmissor;
		this.idReceptor = idReceptor;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getIdEmissor() {
		return idEmissor;
	}
	public void setIdEmissor(Long idEmissor) {
		this.idEmissor = idEmissor;
	}
	public Long getIdReceptor() {
		return idReceptor;
	}
	public void setIdReceptor(Long idReceptor) {
		this.idReceptor = idReceptor;
	}
	
	public DTOConteudo (Mensagem mensagem) {
		
		return;
	}
	
	public void getObjMensagem() {
		return ;
	}
}
