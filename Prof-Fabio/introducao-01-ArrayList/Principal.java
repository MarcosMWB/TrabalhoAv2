import corejava.*;
import java.util.ArrayList;

public class Principal
{	public static void main (String[] args)
	{		

		final int TAM = Console.readInt("Informe o tamanho da lista:");
		ArrayList <Empregado> ListaDeEmpregados = new ArrayList <Empregado> (TAM);
		
		Empregado umEmpregado=null;
		String nome;
		double salario;


		boolean continua = true;
		while (continua)
		{	System.out.println('\n' + "O que você deseja fazer?");
			System.out.println('\n' + "1. Cadastrar um empregado");
			System.out.println("2. Alterar um empregado");
			System.out.println("3. Remover um empregado");
			System.out.println("4. Listar relação de empregados");
			System.out.println("5. Sair");
						
			int opcao = Console.readInt('\n' + "Digite um número entre 1 e 5:");			
					
			switch (opcao)
			{	case 1:
					nome=Console.readLine("Informe o nome:");
					salario=Console.readDouble("Informe o salario:");
					umEmpregado=new Empregado(nome,salario);



					break;
				case 2:
										
					break;
				case 3:

					break;
				case 4:

					for(int i=0;i<ListaDeEmpregados.size();i++){
						umEmpregado=ListaDeEmpregados.get(i);
						umEmpregado.imprime();
	//ou ListaDeEMpregados.get(i).imprime(); JA FAZ OS DOIS ASSIM


					}


					break;
				case 5:
					continua = false;
					break;
				default:
					System.out.println('\n' + "Opção inválida!");			
					break;
			}
		}		
	}
}
