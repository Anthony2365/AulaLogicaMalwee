package br.com.Anthony;
import java.util.Scanner;


public class Atividade {

	public static void main(String[] args) {
		
		
		
		Scanner tec = new Scanner(System.in);
		String opcao = "S";
		int opcaoDoMenu;
		
		do {
			System.out.println("--- MENU ---");
			System.out.println("1)VerificarSexoEIdade");
			System.out.println("2)ContagemDeValores");
			System.out.println("3)Tabuada");
			System.out.println("4)CadastrarCursos");
			System.out.println("5)Sair");
			System.out.println("----------");
			System.out.println("Informe o opcão desejada: ");
			opcaoDoMenu = tec.nextInt();
			
			switch (opcaoDoMenu) {
			case 1:
				System.out.println("--- Verificar sexo e idade ---");
				
				System.out.println("Informe o nome: ");
				
				String nome = tec.next();
				System.out.println("Informe ano de nascimento: ");
				int anoDeNascimento = tec.nextInt();
				int idade = 2021 - anoDeNascimento;
				System.out.println("Informe o sexo: ");
				String sexo = tec.next();
				 
				 if (sexo.equals ("M")) {
					System.out.println("Você é do sexo Masculino");
					
				}else if (sexo.equals ("F")) {
					System.out.println("Você é do sexo Feminino");
					
				}else {
					System.out.println("Opção invalida");
				}
				 
				if(idade < 12 ) {
					System.out.println("Criança");
				}else if (idade > 12 && idade < 18) {
					System.out.println("Jovem");
				}else if (idade > 18 && idade < 65) {
					System.out.println("Adulto");
				}else if (idade > 65) {
					System.out.println("Idoso");
				}
				 
				if(idade < 16 ) {
					System.out.println("Não pode votar");
				}else if(idade > 16 && idade < 17 | idade > 70 ) {
					System.out.println("Voto opcional");
				}else if (idade > 18 && idade < 70) {
					System.out.println("Voto obrigatório");
				}
				
				if(idade < 18) {
					System.out.println("Não pode tirar habilitação");
				}else if(idade >= 18) {
					System.out.println("Pode tirar a habilitação");
				}
				
				
				break;
			
			case 2:
				System.out.println("--- Contagem de valores ---");
				
				System.out.println("Informe o primeiro valor: ");
				int valor1 = tec.nextInt();
				System.out.println("Informe o segundo valor: ");
				int valor2 = tec.nextInt();
					if(valor1 < valor2) {
						while (valor1 <= valor2 ) {
							System.out.println(valor1);
						valor1 += 1; 	
					}
					
				} else if (valor1 > valor2) {
					while (valor1 >= valor2) {
						System.out.println(valor2);
						valor2 += 1;
					}
				}else if (valor1 == valor2) {
					System.out.println("Valor igual ao primeiro, impossível imprimir a sequência");
				}
			
				
				
				break;
				
			case 3:
				System.out.println("--- Tabuada --- ");
				
				System.out.println("Informe um numero: ");
				 int valor3 = tec.nextInt();
				 int multiplicador = 0;
				 while (multiplicador <= 10) {
					System.out.println(valor3 + "x" + multiplicador + "=" + (valor3 * multiplicador ) ); 
					multiplicador += 1;
				 }
				 
				 
				break;
				 
			case 4:
				System.out.println("--- Cadastrar cursos ---");
				
				String cursos[]= new String[5];
				String inserircursos = "S";
				int aux = 0;
				
				while(inserircursos.equalsIgnoreCase("s")) {
					System.out.println("Informe um curso: ");
					cursos[aux] = tec.next();
					aux +=1;
					if(aux == 5) {
					System.out.println("Limite maximo de pessoas cadastradas: ");
					break;	
				}
				System.out.println("Deseja realizar outra operaçao [S/N]");	
				inserircursos = tec.next();
			}
				for(String cursos1 : cursos) {
					System.out.println(cursos1);
					
				}
				 break;
				 
				 default:
					 System.out.println("Opção invalida");
			}
			System.out.println("Deseja realixar outra operação? [S/N]");
			opcao = tec.next();
			
		}while(opcao.equalsIgnoreCase("S")); 
	}
}
				
			
				
					
			
