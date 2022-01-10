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
public class conta implements Iconta {
    private boolean ContaCorrente = false;
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

   
    public conta(Cliente cliente, boolean Conta) {
		this.agencia = conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
                ContaCorrente =  Conta;
	}
    
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void imprimirExtrato() {
        if(this.ContaCorrente){
        System.out.println("=== Extrato Conta Corrente ===");
        }
        else{System.out.println("=== Extrato Conta Poupança ===");}
        
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
	System.out.println(String.format("Agencia: %d", this.agencia));
	System.out.println(String.format("Numero: %d", this.numero));
	System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
