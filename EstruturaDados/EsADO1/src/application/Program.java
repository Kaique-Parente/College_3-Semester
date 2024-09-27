/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.entities.Cliente;
import model.utils.Biblioteca;
import model.utils.Vetor;

/**
 *
 * @author kaiqu
 */
public class Program {

    public static void main(String[] args) {
        Vetor clientesComuns = new Vetor();
        Vetor clientesPrimes = new Vetor();

        String menu
                = """
                    MENU
            ------------------
            Escolha sua Opção:
            1. Inserir Cliente
            2. Remover Cliente
            3. Pesquisar id do Cliente (índice)
            4. Pesquisar Cliente (instância)
            5. Pesquisar nome do cliente
            6. Ordenar e exibir
            7. Sair do menu
            """;

        int escolha = 0, id=0;
        char tipoCliente = ' ';
        String nomeCliente = "";
        Scanner sc = new Scanner(System.in);

        do {
            try {
                tipoCliente = Biblioteca.lerChar("Você quer gerenciar clientes comuns, primes ou sair do programa [c/p/s]? ");

                if (tipoCliente == 'c' || tipoCliente == 'p') {
                    
                    escolha = 0;
                    while (escolha != 7) {
                        System.out.println(menu);
                        escolha = Biblioteca.lerInteiro("Digite a opção: ");

                        switch (escolha) {
                            case 1:
                                nomeCliente = Biblioteca.lerString("Digite o nome do Cliente: ");
                                if (tipoCliente == 'c') {
                                    clientesComuns.inserir(new Cliente(nomeCliente));
                                } else {
                                    clientesPrimes.inserir(new Cliente(nomeCliente));
                                }
                                break;
                            case 2:
                                id = Biblioteca.lerInteiro("Para remover o Cliente digite o id: ");
                                if (tipoCliente == 'c') {
                                    if (clientesComuns.remover(id)) {
                                        System.out.println("Sucesso!");
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                } else {
                                    id = Biblioteca.lerInteiro("Para remover o Cliente digite o id: ");
                                    if (clientesPrimes.remover(id)) {
                                        System.out.println("Sucesso!");
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                }
                                break;
                            case 3:
                                if (tipoCliente == 'c') {
                                    id = clientesComuns.pesquisar(Biblioteca.lerInteiro("Pesquisar a posição do Cliente na lista, digite o id: "));
                                    if(id >= 0){
                                        System.out.println("Índice: " + id);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                } else {
                                    id = clientesPrimes.pesquisar(Biblioteca.lerInteiro("Pesquisar a posição do Cliente na lista, digite o id: "));
                                    if(id >= 0){
                                        System.out.println("Índice: " + id);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                }
                                break;
                            case 4:
                                if (tipoCliente == 'c') {
                                    id = Biblioteca.lerInteiro("Digite o id do Cliente: ");
                                    Cliente newCliente = clientesComuns.pesquisarCadastro(id);
                                    if (newCliente != null) {
                                        System.out.println(newCliente);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                } else {
                                    id = Biblioteca.lerInteiro("Digite o id do Cliente: ");
                                    Cliente newCliente = clientesPrimes.pesquisarCadastro(id);
                                    if (newCliente != null) {
                                        System.out.println(newCliente);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                }
                                break;
                            case 5:
                                if (tipoCliente == 'c') {
                                    String v = Biblioteca.lerString("Digite o nome do Cliente: ");
                                    Cliente newCliente = clientesComuns.buscaBinaria(v);
                                    if (newCliente != null) {
                                        System.out.println(newCliente);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                } else {
                                    String v = Biblioteca.lerString("Digite o nome do Cliente: ");
                                    Cliente newCliente = clientesComuns.buscaBinaria(v);
                                    if (newCliente != null) {
                                        System.out.println(newCliente);
                                    } else {
                                        System.out.println("Cliente não encontrado ou inexistente!");
                                    }
                                }
                                break;
                            case 6:
                                if (tipoCliente == 'c') {
                                    clientesComuns.ordenarArray();
                                } else {
                                    clientesPrimes.ordenarArray();
                                }
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    }
                } else if (tipoCliente == 's') {
                    break;
                } else {
                    System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException e) {
                tipoCliente = Biblioteca.lerChar("");
                System.out.println("Opção Inválida!");
            }
        } while (tipoCliente != 's');
    }
}
