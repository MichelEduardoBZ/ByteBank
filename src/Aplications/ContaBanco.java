package Aplications;

import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ContaBanco {

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String accountType;
	private String accountNumber;
	private Endereco endereco;
	private double saldo;

	public ContaBanco() {
	}

	public ContaBanco(String accountType, Endereco endereco) {
		super();
		this.accountType = accountType;
		this.accountNumber = RandomNumber();
		this.endereco = endereco;
		this.saldo = 0;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public double getSaldo() {
		return saldo;
	}

	public String depositar(Double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return "Valor sacado";
		} else {
			return "Valor de saque maior que o saldo";
		}
	}

	public String RandomNumber() {

		String numberAccountGenerator = "";
		Random generator = new Random();

		for (int i = 0; i <= 1; i++) {
			numberAccountGenerator += Math.abs(generator.nextInt());
		}

		return numberAccountGenerator;

	}


	
}
