package Programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Aplications.ContaBanco;
import Aplications.ContaCNPJ;
import Aplications.ContaCPF;
import Aplications.Endereco;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Olá, seja bem-vindo ao ByteBank");

		//Decretanto o tipo da conta
		
		System.out.print("Você gostaria de criar uma conta CPF ou CNPJ? ");
		String accountType = sc.nextLine();

		if (accountType.equalsIgnoreCase("CPF")) {

			//Adicionando conta na coleção
			
			List<ContaCPF> list = new ArrayList<>();

			System.out.print("Nome completo: ");
			String nameAccount = sc.nextLine();

			System.out.print("Qual seu CPF? ");
			String cpf = sc.nextLine();

			//Inicializando a data, não ficando fora do escopo
			LocalDate birthdDate = null;

			try {
				System.out.print("Data de fundação: dd/MM/yyyyy ");
				birthdDate = LocalDate.parse(sc.nextLine(), fmt);

			} finally {
				System.out.println("Data inválida, coloque apenas dígitos validos");
			} 

			System.out.print("Estado em qual você mora: ");
			String state = sc.nextLine();

			System.out.print("Cidade em qual você mora: ");
			String city = sc.nextLine();

			System.out.print("Bairro em qual você vive: ");
			String neighborhood = sc.nextLine();

			System.out.print("Nome da rua: ");
			String road = sc.nextLine();

			System.out.print("Número da sua moradia: ");
			String numberHome = sc.nextLine();
			int numberHomeValidated = Integer.parseInt(numberHome);
			
			//Fazendo a referência

			list.add(new ContaCPF(accountType, new Endereco(state, city, neighborhood, road, numberHomeValidated),
					nameAccount, cpf, birthdDate));

			//Apresentando
			System.out.println();
			System.out.println(list.toString());

		} else if (accountType.equalsIgnoreCase("CNPJ")) {

			//Adicionando conta na coleção

			List<ContaCNPJ> listCNPJ = new ArrayList<>();

			System.out.print("Razão Social: ");
			String nameCorporate = sc.nextLine();

			System.out.print("Qual o CNPJ? ");
			String cnpj = sc.nextLine();

			//Inicializando a data, não ficando fora do escopo
			LocalDate foundationDate = null;

			try {
				System.out.print("Data de fundação: dd/MM/yyyyy ");
				foundationDate = LocalDate.parse(sc.nextLine(), fmt);

			} finally {
				System.out.println("Data inválida, coloque apenas dígitos validos");
			} 

			System.out.println("--- Endereço da Empresa(Matriz) ---");

			System.out.print("Estado da localidade da Matriz: ");
			String state = sc.nextLine();

			System.out.print("Cidade: ");
			String city = sc.nextLine();

			System.out.print("Bairro: ");
			String neighborhood = sc.nextLine();

			System.out.print("Nome da rua: ");
			String road = sc.nextLine();

			System.out.print("Número da empresa: ");
			String number = sc.nextLine();
			int numberValidated = Integer.parseInt(number);

			//Fazendo a referência
			
			listCNPJ.add(new ContaCNPJ(accountType, new Endereco(state, city, neighborhood, road, numberValidated),
					foundationDate, nameCorporate, cnpj));

			//Apresentando
			System.out.println();
			System.out.println(listCNPJ.toString());

		} else {
			System.out.println("Ops! Algo aconteceu de errado, valide se colocou a opção correta");
		}
	}

}
