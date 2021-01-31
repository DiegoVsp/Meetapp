package br.com.dio.controller;

import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dio.model.Evento;

@Named  //para ficar disponivel utilizar expressionLanguage no CadastrarEvento.xhtml
@SessionScoped
public class EventoBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private Evento evento;

	private List<Evento> eventos = new ArrayList<Evento>();

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	public void clean() {
		this.evento = new Evento();
	}

	public String adicionarEvento() {
		eventos.add(evento);
		System.out.println("Evento " + evento.getNome() + " Cadastrado com sucesso!");
		clean();
		return "";

	}

}
