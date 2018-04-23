//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import corejava.Console;
import java.util.ArrayList;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        int TAM = Console.readInt("\nInforme o tamanho da lista de empregados: ");
        ArrayList<Empregado> listaDeEmpregados = new ArrayList(TAM);
        Empregado umEmpregado = null;
        boolean continua = true;

        while(true) {
            label79:
            while(continua) {
                System.out.println("\nO que você deseja fazer?");
                System.out.println("\n1. Cadastrar um empregado");
                System.out.println("2. Alterar um empregado");
                System.out.println("3. Remover um empregado");
                System.out.println("4. Listar relação de empregados");
                System.out.println("5. Listar apenas Número e Nome dos empregados");
                System.out.println("6. Sair");
                int opcao = Console.readInt("\nDigite um número entre 1 e 6:");
                int i;
                boolean achou;
                int opcaoAlteracao;
                switch(opcao) {
                case 1:
                    String nome = Console.readLine("\nDigite o nome do empregado: ");
                    double salario = Console.readDouble("Digite o salario do empregado: ");
                    umEmpregado = new Empregado(nome, salario);
                    listaDeEmpregados.add(umEmpregado);
                    System.out.println("\nEmpregado cadastrado com sucesso!");
                    break;
                case 2:
                    i = Console.readInt("\nDigite o número do empregado que você deseja alterar: ");
                    achou = false;

                    for(opcaoAlteracao = 0; opcaoAlteracao < listaDeEmpregados.size(); ++opcaoAlteracao) {
                        umEmpregado = (Empregado)listaDeEmpregados.get(opcaoAlteracao);
                        if (umEmpregado.getNumero() == i) {
                            achou = true;
                            break;
                        }
                    }

                    if (achou) {
                        System.out.println("\nO que você deseja alterar?");
                        System.out.println("\n1. Nome");
                        System.out.println("2. Salario");
                        opcaoAlteracao = Console.readInt("\nDigite 1 ou 2:");
                        switch(opcaoAlteracao) {
                        case 1:
                            String novoNome = Console.readLine("Digite o novo nome: ");
                            umEmpregado.setNome(novoNome);
                            System.out.println("\nAlteração de nome efetuada com sucesso!");
                            continue;
                        case 2:
                            double novoSalario = Console.readDouble("Digite o novo salário: ");
                            System.out.println("\nAlteração de salário efetuada com sucesso!");
                            continue;
                        default:
                            System.out.println("\nOpção inválida!");
                        }
                    } else {
                        System.out.println("\nEmpregado não encontrado!");
                    }
                    break;
                case 3:
                    i = Console.readInt("\nDigite o número do empregado que você deseja remover: ");
                    achou = false;

                    for(opcaoAlteracao = 0; opcaoAlteracao < listaDeEmpregados.size(); ++opcaoAlteracao) {
                        umEmpregado = (Empregado)listaDeEmpregados.get(opcaoAlteracao);
                        if (i == umEmpregado.getNumero()) {
                            achou = true;
                            break;
                        }
                    }

                    if (achou) {
                        listaDeEmpregados.remove(opcaoAlteracao);
                        System.out.println("\nEmpregado removido com sucesso!");
                    } else {
                        System.out.println("\nEmpregado não encontrado!");
                    }
                    break;
                case 4:
                    if (listaDeEmpregados.isEmpty()) {
                        System.out.println("\nNão há empregados na lista.");
                        break;
                    } else {
                        System.out.println("");
                        i = 0;

                        while(true) {
                            if (i >= listaDeEmpregados.size()) {
                                continue label79;
                            }

                            umEmpregado = (Empregado)listaDeEmpregados.get(i);
                            umEmpregado.imprime();
                            ++i;
                        }
                    }
                case 5:
                    if (listaDeEmpregados.isEmpty()) {
                        System.out.println("\nNão há empregados na lista.");
                        break;
                    } else {
                        System.out.println("");
                        i = 0;

                        while(true) {
                            if (i >= listaDeEmpregados.size()) {
                                continue label79;
                            }

                            umEmpregado = (Empregado)listaDeEmpregados.get(i);
                            System.out.println("Numero = " + umEmpregado.getNumero() + "  Nome = " + umEmpregado.getNome());
                            ++i;
                        }
                    }
                case 6:
                    continua = false;
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                }
            }

            return;
        }
    }
}
