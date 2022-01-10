/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.List;

/**
 *
 * @author Pedro Henrique
 */
public class Banco {
    private String nome;
	private List<conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<conta> getContas() {
		return contas;
	}

	public void setContas(List<conta> contas) {
		this.contas = contas;
	}
}
