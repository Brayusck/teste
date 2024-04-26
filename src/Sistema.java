import java.sql.SQLOutput;

public class Sistema {
    private static void menuExibir(){
        System.out.println("\nMenu Exibição Empresa Brasylsck Global Logistic LTDA");
        System.out.println(" * * * Seja Bem-Vindo a nosso sistema de Cadastramento, Busca, Exclusão de Funcionários * * *");
        System.out.println("1-) Conheça nossa Missão,Visão e Valores ");
        System.out.println("2-) Conheça nossos Setores de Produção ");
        System.out.println("3-) Cadastrar Colaboradores");
        System.out.println("4-) Registrar Encarregado de Setor");
        System.out.println("5-) Procurar Colaboradores");
        System.out.println("6-) Listar Colaboradores");
        System.out.println("7-) Apagar lista de Colaboradores");
        System.out.println("0-) Sair!");
        System.out.print("\nSelecione uma Opção: ");

    }
    private static void analisarOp(int op){
        int cpf;
        String nome;
        String setorSupervisionado;
        String nomeSetor;
        String cargo;

            switch (op){
                case 1:
                    System.out.println("\n\n Missão, Visão e Valores da Brasylsck Global Logistic LTDA");
                    System.out.println("Missão:\n" +
                            "\"Produzir produtos de alta qualidade que atendam às necessidades e superem as expectativas dos nossos clientes, " +
                            "mantendo um compromisso constante com a inovação, sustentabilidade e excelência operacional.\"");

                    System.out.println("Visão:\n" +
                            "Ser reconhecida como líder no setor de produção, sendo referência em qualidade, eficiência e responsabilidade social e ambiental.");

                    System.out.println("Valores:\n" +
                            "\"Excelência em qualidade e compromisso com a sustentabilidade guiam cada ação nossa.\"");
                    break;

                case 2:
                    System.out.println(" * * * Lista de Setor na Empresa * * * \n ");
                    System.out.println( "Galvanica \n " + "Router \n " + "Espessamento \n " +
                                        "Metalização \n " + "Ponto-a-Ponto \n " + "Engenharia \n " +
                                        "Rh - Recursos Humanos \n " + "Hall \n " +
                                        "Corrosão \n " + "Serigrafica \n " + "Furação ");
                    break;

                case 3:
                    System.out.println("REGISTRO DE COLABORADORES \n");
                    System.out.println("Informe Cpf: ");
                    cpf = Console.lerInt();

                    System.out.println("Nome: ");
                    nome = Console.lerString();

                    System.out.println("Nome do Setor: que exerce/exercera uma função: ");
                    nomeSetor = Console.lerString();

                    System.out.println("Cargo que exerce/exercera na empresa: (ex: Aux.Produção) ");
                    cargo = Console.lerString();

                Setor s = new Setor(nome, cpf, nomeSetor, cargo);
                Registro.registrar(s);

                    System.out.println("\nColaborador Registrado com sucesso :) ");

                    break;

            case 4:
                System.out.println(" *** Registrando novo Encarregado *** \n");
                System.out.println("Informe Cpf: ");
                cpf = Console.lerInt();

                System.out.println("Nome: ");
                nome = Console.lerString();

                System.out.println("Setor que ira supervisionar: ");
                setorSupervisionado = Console.lerString();

                Encarregado e = new Encarregado(nome, cpf, setorSupervisionado);
                Registro.registrar(e);

                System.out.println("\nEncarregado Registrado com sucesso :) ");

                    break;

            case 5:
                System.out.println(" *** Procurar Colaborador *** \n");
                System.out.println("Informe Cpf: ");
                cpf = Console.lerInt();
                Funcionario f = Registro.buscarFuncionario(cpf);
                if (f != null){
                    System.out.println("Colaborador encontrado com sucesso :) ");
                    System.out.println(f.toString());
                    return;
                }
                System.out.println("\nColaborador " + cpf + "não encontrado com sucesso :( ");

                    break;

                case 6:
                    System.out.println("\nTodos os colaboradores Cadastrados:");
                        if (Registro.getListaFuncionarios().size() == 0){
                            System.out.println("\n Colaboradores sem cadastros ");
                            return;
                        }
                            for (Funcionario funci : Registro.getListaFuncionarios()){
                                System.out.println(funci.toString());
                            }
                    break;

                case 7:
                    System.out.println(" *** Apagar Lista de Colaborador *** \n");
                    Registro.getListaFuncionarios().clear();
                    System.out.println("Lista de colaboradores apagada com sucesso.");

                    break;
                case 0:
                    System.out.println("Programa Finalizado, Volte sempre!\n");
                    System.out.println("developer Brayusck");

                    break;

                default:
                    System.out.println("Opção invalida, tente novamente! ");
            }
    }
    public static void execut(){
        int op;
        do {
            menuExibir();
            op = Console.lerInt();
            analisarOp(op);
        }while (op !=0);

    }


}
