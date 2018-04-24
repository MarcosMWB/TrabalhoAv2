import corejava.Console;

public class Principal {
    public Principal() {
    }

    public static void main(String[] args) {
        int TAM = Console.readInt("\nInforme o tamanho da lista de empregados: ");
        ListaDeObjetos<Empregado> listaDeEmpregados = new ListaDeObjetos(TAM);
        boolean continua = true;

        while(true) {
            label53:
            while(continua) {
                System.out.println("\n==============================================================");
                System.out.println("\nO que você deseja fazer?");
                System.out.println("\n1. Cadastrar um empregado");
                System.out.println("2. Alterar um empregado");
                System.out.println("3. Remover um empregado");
                System.out.println("4. Listar relação de empregados");
                System.out.println("5. Listar apenas Número e Nome dos empregados");
                System.out.println("6. Sair");
                int opcao = Console.readInt("\nDigite um número entre 1 e 6:");
                Empregado umEmpregado;
                int resposta;
                switch(opcao) {
                case 1:
                    String nome = Console.readLine("\nDigite o nome do empregado: ");
                    double salario = Console.readDouble("Digite o salario do empregado: ");
                    umEmpregado = new Empregado(nome, salario);
                    listaDeEmpregados.adicionar(umEmpregado);
                    System.out.println("\nEmpregado cadastrado com sucesso!");
                    break;
                case 2:
                    resposta = Console.readInt("\nDigite o número do empregado que você deseja alterar: ");
                    umEmpregado = (Empregado)listaDeEmpregados.recuperar(resposta);
                    if (umEmpregado != null) {
                        System.out.println("\nO que você deseja alterar?");
                        System.out.println("\n1. Nome");
                        System.out.println("2. Salario");
                        int opcaoAlteracao = Console.readInt("\nDigite 1 ou 2:");
                        switch(opcaoAlteracao) {
                        case 1:
                            String novoNome = Console.readLine("Digite o novo nome: ");
                            umEmpregado.setNome(novoNome);
                            System.out.println("\nAlteração de nome efetuada com sucesso!");
                            break;
                        case 2:
                            double novoSalario = Console.readDouble("Digite o novo salário: ");
                            umEmpregado.setSalario(novoSalario);
                            System.out.println("\nAlteração de salário efetuada com sucesso!");
                            break;
                        default:
                            System.out.println("\nOpção inválida!");
                        }
                    } else {
                        System.out.println("\nEmpregado não encontrado!");
                    }
                    break;
                case 3:
                    resposta = Console.readInt("\nDigite o número do empregado que você deseja remover: ");
                    if (listaDeEmpregados.remover(resposta)) {
                        System.out.println("\nEmpregado removido com sucesso!");
                    } else {
                        System.out.println("\nEmpregado não encontrado!");
                    }
                    break;
                case 4:
                    if (listaDeEmpregados.vazia()) {
                        System.out.println("\nNão há empregados na lista.");
                        break;
                    } else {
                        System.out.println("");
                        umEmpregado = (Empregado)listaDeEmpregados.recuperarPrimeiro();

                        while(true) {
                            if (umEmpregado == null) {
                                continue label53;
                            }

                            umEmpregado.imprime();
                            umEmpregado = (Empregado)listaDeEmpregados.recuperarProximo();
                        }
                    }
                case 5:
                    if (listaDeEmpregados.vazia()) {
                        System.out.println("\nNão há empregados na lista.");
                        break;
                    } else {
                        System.out.println("");
                        umEmpregado = (Empregado)listaDeEmpregados.recuperarPrimeiro();

                        while(true) {
                            if (umEmpregado == null) {
                                continue label53;
                            }

                            System.out.println("Número = " + umEmpregado.getNumero() + "   Nome = " + umEmpregado.getNome());
                            umEmpregado = (Empregado)listaDeEmpregados.recuperarProximo();
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
