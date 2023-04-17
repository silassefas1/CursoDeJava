package com.silas.cursodejava.aula36a43.labs;

import java.util.Scanner;

public class ContaBancaria {
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	private double chuequeEspecial;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getChuequeEspecial() {
		return chuequeEspecial;
	}

	public void setChuequeEspecial(double chuequeEspecial) {
		this.chuequeEspecial = chuequeEspecial;
	}

	Scanner scan = new Scanner(System.in);
	
	public void sacar(double valorSaque) {

		if(this.saldo <= 0) {
			System.out.println("Seu Saldo é insulficiente para efetuar saques. \n"
					+ "Saldo Atual: " + getSaldo());
		}else if(this.saldo > 0) {
			if (getSaldo() >= valorSaque) {
				setSaldo(this.saldo - valorSaque);
				System.out.println("Aguarde contagem das notas, o valor sera entregue em seguida. \n"
						+ "Novo saldo é: " + this.saldo);
			} else if(getSaldo() < valorSaque) {
				System.out.println("Você não pussui valor em conta para efetuar esse saque. \n"
						+ "Deseja usar o cheque especial ? \n"
						+ "1 - sim \n"
						+ "2 - nao");
				int opcao = scan.nextInt();
				if(opcao == 1) {
					setChuequeEspecial(valorSaque - this.saldo);
					System.out.println("Cheque especial contratado no valor de R$ " + getChuequeEspecial());
				
				}else if(opcao == 2) {
					System.out.println("Retornamdo ao Menu");
				}else {
					System.out.println("Opcão invalida, Retornado ao Menu Principal");
				}
			
			}
			
		}
		
	}
	
	public void depositar(double valorDeposito) {
		setSaldo(getSaldo() + valorDeposito);
		System.out.println("Deposito Efetuado ");
		
	}
	
	
	
	
	
}

