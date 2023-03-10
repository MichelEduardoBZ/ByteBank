package Aplications;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class ContaCPF extends ContaBanco{

	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String cpf;
	private LocalDate birthdDate;
	
	public ContaCPF() {
	}

	public ContaCPF(String accountType, Endereco endereco, String name, String cpf, LocalDate birthdDate) {
		super(accountType, endereco);
		this.name = name;
		this.cpf = cpf;
		this.birthdDate = birthdDate;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getBirthdDate() {
		return birthdDate;
	}

	public void setBirthdDate(LocalDate birthdDate) {
		this.birthdDate = birthdDate;
	}

	@Override
	public String toString() {
		return "ContaCPF: \nTipo da conta:" + getAccountType() + "Número da conta: " + getAccountNumber() + "\nNome: " + name + ", CPF: " + cpf + ", | Data de aniversário: " + fmt.format(birthdDate) 
		+ "\nEndereço: Estado: " + getEndereco().getState() + ", Cidade: " + getEndereco().getCity() + ", Bairro: " + getEndereco().getNeighborhood() + ", Rua: " +
		getEndereco().getRoad() + ", Número: " + getEndereco().getNumberHome();		
	}

		
	
}
