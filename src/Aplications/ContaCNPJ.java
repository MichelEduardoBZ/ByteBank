package Aplications;

import java.time.LocalDate;
import java.util.Date;

public class ContaCNPJ extends ContaBanco{

	private LocalDate foundationDate;
	private String nameCorporate;
	private String cnpj;
	
	public ContaCNPJ(){
	}

	

	public ContaCNPJ(String accountType, Endereco endereco, LocalDate foundationDate, String nameCorporate, String cnpj) {
		super(accountType, endereco);
		this.foundationDate = foundationDate;
		this.nameCorporate = nameCorporate;
		this.cnpj = cnpj;
	}



	public LocalDate getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(LocalDate foundationDate) {
		this.foundationDate = foundationDate;
	}

	public String getNameCorporate() {
		return nameCorporate;
	}

	public void setNameCorporate(String nameCorporate) {
		this.nameCorporate = nameCorporate;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "ContaCNPJ: \nTipo da conta:" + getAccountType() + "Número da conta: " + getAccountNumber() + "\nRazão Social: " + nameCorporate + ", CNPJ: " + cnpj + ", | Data de aniversário: " + fmt.format(foundationDate) 
		+ "\nEndereço: Estado: " + getEndereco().getState() + ", Cidade: " + getEndereco().getCity() + ", Bairro: " + getEndereco().getNeighborhood() + ", Rua: " +
		getEndereco().getRoad() + ", Número: " + getEndereco().getNumberHome();		
	}
	
	
	
	
	
}
