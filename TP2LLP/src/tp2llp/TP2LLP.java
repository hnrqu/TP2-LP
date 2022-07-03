/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2llp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class TP2LLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        Cadastro c1 = new Cadastro();
        int opcao;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("\n\n### INFOTUDO - SISTEMA DE INFORMÁTICA ###");
            System.out.println("\n Escolha uma das opções abaixo:");
            System.out.println("\n                  ======================= ");
            System.out.println("                  |     1 - Cadastro Usuário|");
            System.out.println("                  |     2 - Serviço(Ñ tem ) |");
            System.out.println("                  |     3 - Compras(Ñ tem)  |");
            System.out.println("                  |     0 - Sair            |");
            System.out.println("                  =========================\n");
            System.out.print("\n Eu escolho a opção: ");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu a opcao CADASTRO de USUÁRIOS");
                    System.out.println("=================================");
                    int opcao_cliente;
                    do {
                        System.out.println("\n\n### INFOTUDO - SISTEMA DE INFORMÁTICA ###");
                        System.out.println("\n Escolha o tipo de CLIENTE que deseja:     ");
                        System.out.println("\n                  =======================  ");
                        System.out.println("                  |     1 - Cliente         |");
                        System.out.println("                  |     2 - Administrador   |");
                        System.out.println("                  |     3 - Profissional    |");
                        System.out.println("                  |     0 - Voltar          |");
                        System.out.println("                  ===========================\n");
                        System.out.print("\n Eu escolho a opção: ");
                        opcao_cliente = in.nextInt();

                        System.out.println("=================================");

                        switch (opcao_cliente) {
                            case 1:
                                int op_cliente_cadastro;
                                do {
                                    System.out.println("\n\n### INFOTUDO - SISTEMA DE INFORMÁTICA ###");
                                    System.out.println("\n Escolha a ação de CLIENTE que deseja:     ");
                                    System.out.println("\n                  =======================  ");
                                    System.out.println("                  |     1 - Cadastro        |");
                                    System.out.println("                  |     2 - Exibir Qtd      |");
                                    System.out.println("                  |     3 - Exclusão        |");
                                    System.out.println("                  |     4 - Consulta        |");
                                    System.out.println("                  |     5 - Exibir Todos    |");
                                    System.out.println("                  |     0 - Voltar          |");
                                    System.out.println("                  ===========================\n");
                                    System.out.print("\n Eu escolho a opção: ");
                                    op_cliente_cadastro = in.nextInt();
                                    System.out.println("=================================");
                                    switch (op_cliente_cadastro) {

                                        case 1:
                                            System.out.println("Voce escolheu cadastrar um Cliente");
                                            System.out.println("=================================");
                                            int codigo;
                                            String nome;
                                            String cpf;
                                            String identidade;
                                            String logradouro;
                                            String bairro;
                                            int numero;
                                            String municipio;
                                            String estado;
                                            int cep;
                                            int telefone;
                                            System.out.println("Digite um código");
                                            codigo = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Nome");
                                            nome = input.readLine();
                                            System.out.println("Digite o CPF");
                                            cpf = input.readLine();
                                            System.out.println("Digite o Identidade");
                                            identidade = input.readLine();
                                            System.out.println("Digite o Logradouro(nome a rua)");
                                            logradouro = input.readLine();
                                            System.out.println("Digite o Bairro");
                                            bairro = input.readLine();
                                            System.out.println("Digite o numero da moradia");
                                            numero = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Municipio");
                                            municipio = input.readLine();
                                            System.out.println("Digite o estado");
                                            estado = input.readLine();
                                            System.out.println("Digite o CEP");
                                            cep = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Telefone");
                                            telefone = Integer.parseInt(input.readLine());
                                            c1.setAcessCode(0);
                                            c1.cadastroContato(codigo, nome, cpf, identidade, logradouro, bairro, numero, municipio, estado, cep, telefone);
                                            break;
                                        case 2:
                                            System.out.println("Voce escolheu exibir quantidade de cliente cadastrados:");
                                            System.out.println("=================================");
                                            c1.numerodeContatos();
                                            break;
                                        case 3:
                                            System.out.println("Voce escolheu excluir um cliente");
                                            System.out.println("=================================");
                                            break;
                                        case 4:
                                            System.out.println("Voce escolheu consultar um cliente");
                                            System.out.println("=================================");
                                            break;
                                        case 5:
                                            System.out.println("Voce escolheu mostrar os dados de um Cliente");
                                            System.out.println("=================================");
                                            c1.exibirtodosContatos();
                                            break;
                                        case 0:
                                            System.out.println("Voce voltou para o menu Cliente");
                                            System.out.println("=================================");
                                            break;
                                        default:
                                            System.out.println("opcao invalida");
                                            System.out.println("=================================");
                                    }

                                } while (op_cliente_cadastro != 0);

                                break;

                            case 2:
                                int op_administrador_cadastro;
                                do {
                                    System.out.println("\n\n### INFOTUDO - SISTEMA DE INFORMÁTICA ###");
                                    System.out.println("\n Escolha a ação de ADMINISTRADOR que deseja:");
                                    System.out.println("\n                  =======================  ");
                                    System.out.println("                  |     1 - Cadastro        |");
                                    System.out.println("                  |     2 - Exibir Qtd      |");
                                    System.out.println("                  |     3 - Exclusão        |");
                                    System.out.println("                  |     4 - Consulta        |");
                                    System.out.println("                  |     5 - Exibir Todos    |");
                                    System.out.println("                  |     0 - Voltar          |");
                                    System.out.println("                  ===========================\n");
                                    System.out.print("\n Eu escolho a opção: ");
                                    op_administrador_cadastro = in.nextInt();
                                    System.out.println("=================================");
                                    switch (op_administrador_cadastro) {
                                        case 1:
                                            System.out.println("Voce escolheu cadastrar um administrador");
                                            System.out.println("=================================");
                                            int codigo;
                                            String nome;
                                            String cpf;
                                            String identidade;
                                            String logradouro;
                                            String bairro;
                                            int numero;
                                            String municipio;
                                            String estado;
                                            int cep;
                                            int telefone;
                                            System.out.println("Digite um código");
                                            codigo = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Nome");
                                            nome = input.readLine();
                                            System.out.println("Digite o CPF");
                                            cpf = input.readLine();
                                            System.out.println("Digite o Identidade");
                                            identidade = input.readLine();
                                            System.out.println("Digite o Logradouro(nome a rua)");
                                            logradouro = input.readLine();
                                            System.out.println("Digite o Bairro");
                                            bairro = input.readLine();
                                            System.out.println("Digite o numero da moradia");
                                            numero = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Municipio");
                                            municipio = input.readLine();
                                            System.out.println("Digite o estado");
                                            estado = input.readLine();
                                            System.out.println("Digite o CEP");
                                            cep = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Telefone");
                                            telefone = Integer.parseInt(input.readLine());
                                            c1.setAcessCode(2);
                                            c1.cadastroContato(codigo, nome, cpf, identidade, logradouro, bairro, numero, municipio, estado, cep, telefone);
                                            break;
                                        case 2:
                                            System.out.println("Voce escolheu exibir quantidade de adm cadastrados:");
                                            System.out.println("=================================");
                                            c1.numerodeContatos();
                                            break;
                                        case 3:
                                            System.out.println("Voce escolheu excluir um adm");
                                            System.out.println("=================================");
                                            break;
                                        case 4:
                                            System.out.println("Voce escolheu consultar um adm");
                                            System.out.println("=================================");
                                            break;
                                        case 5:
                                            System.out.println("Voce escolheu mostrar os dados de um adm");
                                            System.out.println("=================================");
                                            c1.exibirtodosContatos();
                                            break;
                                        case 0:
                                            System.out.println("Voce voltou para o menu adm");
                                            System.out.println("=================================");
                                            break;
                                        default:
                                            System.out.println("opcao invalida");
                                            System.out.println("=================================");
                                    }

                                } while (op_administrador_cadastro != 0);

                                break;

                            case 3:
                                int op_profissional_cadastro;
                                do {
                                    System.out.println("\n\n### INFOTUDO - SISTEMA DE INFORMÁTICA ###");
                                    System.out.println("\n Escolha a ação de PROFISSIONAL que deseja:");
                                    System.out.println("\n                  =======================  ");
                                    System.out.println("                  |     1 - Cadastro        |");
                                    System.out.println("                  |     2 - Exibir Qtd      |");
                                    System.out.println("                  |     3 - Exclusão        |");
                                    System.out.println("                  |     4 - Consulta        |");
                                    System.out.println("                  |     5 - Exibir Todos    |");
                                    System.out.println("                  |     0 - Voltar          |");
                                    System.out.println("                  ===========================\n");
                                    System.out.print("\n Eu escolho a opção: ");
                                    op_profissional_cadastro = in.nextInt();
                                    System.out.println("=================================");
                                    switch (op_profissional_cadastro) {
                                        case 1:
                                            System.out.println("Voce escolheu cadastrar um Profissional");
                                            System.out.println("=================================");
                                            int codigo;
                                            String nome;
                                            String cpf;
                                            String identidade;
                                            String logradouro;
                                            String bairro;
                                            int numero;
                                            String municipio;
                                            String estado;
                                            int cep;
                                            int telefone;
                                            System.out.println("Digite um código");
                                            codigo = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Nome");
                                            nome = input.readLine();
                                            System.out.println("Digite o CPF");
                                            cpf = input.readLine();
                                            System.out.println("Digite o Identidade");
                                            identidade = input.readLine();
                                            System.out.println("Digite o Logradouro(nome a rua)");
                                            logradouro = input.readLine();
                                            System.out.println("Digite o Bairro");
                                            bairro = input.readLine();
                                            System.out.println("Digite o numero da moradia");
                                            numero = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Municipio");
                                            municipio = input.readLine();
                                            System.out.println("Digite o estado");
                                            estado = input.readLine();
                                            System.out.println("Digite o CEP");
                                            cep = Integer.parseInt(input.readLine());
                                            System.out.println("Digite o Telefone");
                                            telefone = Integer.parseInt(input.readLine());
                                            c1.setAcessCode(1);
                                            c1.cadastroContato(codigo, nome, cpf, identidade, logradouro, bairro, numero, municipio, estado, cep, telefone);
                                            break;
                                        case 2:
                                            System.out.println("Voce escolheu exibir quantidade de profissionais cadastrados:");
                                            System.out.println("=================================");
                                            c1.numerodeContatos();
                                            break;
                                        case 3:
                                            System.out.println("Voce escolheu excluir um profissional");
                                            System.out.println("=================================");
                                            break;
                                        case 4:
                                            System.out.println("Voce escolheu consultar um profissional");
                                            System.out.println("=================================");
                                            break;
                                        case 5:
                                            System.out.println("Voce escolheu mostrar os dados de um profissional");
                                            System.out.println("=================================");
                                            c1.exibirtodosContatos();
                                            break;
                                        case 0:
                                            System.out.println("Voce voltou para o menu profissional");
                                            System.out.println("=================================");
                                            break;
                                        default:
                                            System.out.println("opcao invalida");
                                            System.out.println("=================================");
                                    }

                                } while (op_profissional_cadastro != 0);

                                break;

                            case 0:
                                System.out.println("Voce voltou para o menu principal");
                                System.out.println("=================================");
                                break;
                            default:
                                System.out.println("Opcao invalida");
                                System.out.println("=================================");
                                break;
                        }

                    } while (opcao_cliente != 0);

                    break;
                case 0:
                    System.out.println("Voce saiu do sistema");
                    System.out.println("=================================");
                    break;
                default:
                    System.out.println("opcao invalida");
                    System.out.println("=================================");
                    break;

            }
        } while (opcao != 0);

    }
}
