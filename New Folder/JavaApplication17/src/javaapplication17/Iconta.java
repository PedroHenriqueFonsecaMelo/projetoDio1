/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author Pedro Henrique
 */
public interface Iconta {
    void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, Iconta contaDestino);
	
	void imprimirExtrato();
}
