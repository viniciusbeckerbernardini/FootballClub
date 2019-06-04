/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import model.Admin;
import model.Adress;
import model.Athletes;
import model.Date;

/**
 *
 * @author vini
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte op;

        Admin admin = new Admin();
        //Variáveis usadas na aplicação
        int id = 0;
        String name;
        String subname;
        Date birthDate = new Date();
        int RG;
        int CPF;
        Adress adress = new Adress();
        String companyName;
        int cnpj;
        Adress companyAdress = new Adress();
        String branch;
        Date dateStart = new Date();
        int contractNumber;
        double salary;

        do {
            System.out.println("Controle de colaboradores 0.1");
            System.out.println("-------------------------------------------------");
            System.out.println("                Escola sua opção                 ");
            System.out.println("--------------____________________---------------");
            System.out.println(" 0. Sair");
            System.out.println(" 1. Cadastrar funcionário ");
            System.out.println(" 2. Listar funcionar já cadastrados");
            System.out.print("   > ");
            op = scan.nextByte();
            switch (op) {
                case 1:
                    byte op1Case1;

                    System.out.println("Qual tipo de funcionário você deseja cadastrar: ");
                    System.out.println("1 - CLT");
                    System.out.println("2 - Terceirizado");
                    System.out.print(">");
                    op1Case1 = scan.nextByte();
                    if (op1Case1 == 1) {
                        byte op2Case1;
                        System.out.println("Selecione o tipo de cadastro CLT que deseja fazer");
                        System.out.println("1 - Comissão técnica");
                        System.out.println("2 - Diretoria");
                        System.out.println("3 - Jogador");
                        op2Case1 = scan.nextByte();
                        if (op2Case1 == 1) {
                            System.out.println("Digite o nome do integrante da comissão técnica: ");
                            name = scan.next();
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite o sobrenome de " + name);
                            subname = scan.nextLine();
                            System.out.println("Digite a data de nascimento de " + name + " " + subname);
                            Date d = new Date();
                            System.out.println("Digite o dia: ");
                            birthDate.setDay(scan.nextByte());
                            System.out.println("Digite o mês: ");
                            birthDate.setMonth(scan.nextByte());
                            System.out.println("Digite o ano: ");
                            birthDate.setYear(scan.nextInt());
                            System.out.println("Digite o RG: de " + name + " " + subname);
                            RG = scan.nextInt();
                            System.out.println("Digite o CPF de " + name + " " + subname);
                            CPF = scan.nextInt();
                            System.out.println("Digite o endereço de " + name + " " + subname);
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite a rua: ");
                            adress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            adress.setNumber(scan.nextInt());
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite o bairro: ");
                            adress.setNeighborhood(scan.nextLine());
                            System.out.println("Digite a cidade: ");
                            adress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            adress.setState(scan.nextLine());
                            System.out.println("Nome da companhia: ");
                            companyName = scan.nextLine();
                            System.out.println("CNPJ da companhia: ");
                            cnpj = scan.nextInt();
                            System.out.println("Digite o endereço da companhia: ");
                            scan.nextLine();
                            System.out.println("Digite a rua: ");
                            companyAdress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            companyAdress.setNumber(scan.nextInt());
                            System.out.println("Digite o bairro: ");
                            companyAdress.setNeighborhood(scan.nextLine());
                            scan.nextLine();
                            System.out.println("Digite a cidade: ");
                            companyAdress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            companyAdress.setState(scan.nextLine());
                            System.out.println("Ramo da companhia: ");
                            branch = scan.nextLine();
                            System.out.println("Data de inicio do contrato: ");
                            System.out.println("Dia");
                            dateStart.setDay(scan.nextByte());
                            System.out.println("Mês");
                            dateStart.setMonth(scan.nextByte());
                            System.out.println("Ano");
                            dateStart.setYear(scan.nextInt());
                            System.out.println("Número de contrato: ");
                            contractNumber = scan.nextInt();
                            System.out.println("Salário");
                            salary = scan.nextDouble();
                            System.out.println("Posição do jogador: ");
                            String position = scan.next();
                            System.out.println("É titular? (S/N)");
                            boolean positionOwner;
                            if (scan.next().equals("S")) {
                                positionOwner = true;
                            } else {
                                positionOwner = false;
                            }
                            System.out.println("Está lesionado? (S/N)");
                            boolean injury;
                            if (scan.next().equals("S")) {
                                injury = true;
                            } else {
                                injury = false;
                            }
                            Athletes a = new Athletes(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber, salary, position, positionOwner, injury);
                            System.out.println(a);
                            id++;
                        } else if (op2Case1 == 2) {
                            System.out.println("Digite o nome do integrante da comissão técnica: ");
                            name = scan.next();
                            System.out.println("Digite o sobrenome de " + name);
                            subname = scan.nextLine();
                            System.out.println("Digite a data de nascimento de " + name + " " + subname);
                            System.out.println("Digite o dia: ");
                            birthDate.setDay(scan.nextByte());
                            System.out.println("Digite o mês: ");
                            birthDate.setMonth(scan.nextByte());
                            System.out.println("Digite o ano: ");
                            birthDate.setYear(scan.nextInt());
                            System.out.println("Digite o RG: de " + name + " " + subname);
                            RG = scan.nextInt();
                            System.out.println("Digite o CPF de " + name + " " + subname);
                            CPF = scan.nextInt();
                            System.out.println("Digite o endereço de " + name + " " + subname);
                            System.out.println("Digite a rua: ");
                            adress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            adress.setNumber(scan.nextInt());
                            System.out.println("Digite o bairro: ");
                            adress.setNeighborhood(scan.nextLine());
                            System.out.println("Digite a cidade: ");
                            adress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            adress.setState(scan.nextLine());
                            System.out.println("Nome da companhia: ");
                            companyName = scan.nextLine();
                            System.out.println("CNPJ da companhia: ");
                            cnpj = scan.nextInt();
                            System.out.println("Digite o endereço da companhia: ");
                            System.out.println("Digite a rua: ");
                            companyAdress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            companyAdress.setNumber(scan.nextInt());
                            System.out.println("Digite o bairro: ");
                            companyAdress.setNeighborhood(scan.nextLine());
                            System.out.println("Digite a cidade: ");
                            companyAdress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            companyAdress.setState(scan.nextLine());
                            System.out.println("Ramo da companhia: ");
                            branch = scan.nextLine();
                            System.out.println("Data de inicio do contrato: ");
                            System.out.println("Dia");
                            dateStart.setDay(scan.nextByte());
                            System.out.println("Mês");
                            dateStart.setMonth(scan.nextByte());
                            System.out.println("Ano");
                            dateStart.setYear(scan.nextInt());
                            System.out.println("Número de contrato: ");
                            contractNumber = scan.nextInt();
                            System.out.println("Salário: ");
                            salary = scan.nextDouble();

                        } else if (op2Case1 == 3) {
                            System.out.println("Digite o nome do integrante da comissão técnica: ");
                            name = scan.next();
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite o sobrenome de " + name);
                            subname = scan.nextLine();
                            System.out.println("Digite a data de nascimento de " + name + " " + subname);
                            Date d = new Date();
                            System.out.println("Digite o dia: ");
                            birthDate.setDay(scan.nextByte());
                            System.out.println("Digite o mês: ");
                            birthDate.setMonth(scan.nextByte());
                            System.out.println("Digite o ano: ");
                            birthDate.setYear(scan.nextInt());
                            System.out.println("Digite o RG: de " + name + " " + subname);
                            RG = scan.nextInt();
                            System.out.println("Digite o CPF de " + name + " " + subname);
                            CPF = scan.nextInt();
                            System.out.println("Digite o endereço de " + name + " " + subname);
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite a rua: ");
                            adress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            adress.setNumber(scan.nextInt());
                            System.out.println("");
                            scan.nextLine();
                            System.out.println("Digite o bairro: ");
                            adress.setNeighborhood(scan.nextLine());
                            System.out.println("Digite a cidade: ");
                            adress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            adress.setState(scan.nextLine());
                            System.out.println("Nome da companhia: ");
                            companyName = scan.nextLine();
                            System.out.println("CNPJ da companhia: ");
                            cnpj = scan.nextInt();
                            System.out.println("Digite o endereço da companhia: ");
                            scan.nextLine();
                            System.out.println("Digite a rua: ");
                            companyAdress.setStreet(scan.nextLine());
                            System.out.println("Digite o número: ");
                            companyAdress.setNumber(scan.nextInt());
                            System.out.println("Digite o bairro: ");
                            companyAdress.setNeighborhood(scan.nextLine());
                            scan.nextLine();
                            System.out.println("Digite a cidade: ");
                            companyAdress.setCity(scan.nextLine());
                            System.out.println("Digite o estado: ");
                            companyAdress.setState(scan.nextLine());
                            System.out.println("Ramo da companhia: ");
                            branch = scan.nextLine();
                            System.out.println("Data de inicio do contrato: ");
                            System.out.println("Dia");
                            dateStart.setDay(scan.nextByte());
                            System.out.println("Mês");
                            dateStart.setMonth(scan.nextByte());
                            System.out.println("Ano");
                            dateStart.setYear(scan.nextInt());
                            System.out.println("Número de contrato: ");
                            contractNumber = scan.nextInt();
                            System.out.println("Salário");
                            salary = scan.nextDouble();
                            System.out.println("Posição do jogador: ");
                            String position = scan.next();
                            System.out.println("É titular? (S/N)");
                            boolean positionOwner;
                            if (scan.next().equals("S")) {
                                positionOwner = true;
                            } else {
                                positionOwner = false;
                            }
                            System.out.println("Está lesionado? (S/N)");
                            boolean injury;
                            if (scan.next().equals("S")) {
                                injury = true;
                            } else {
                                injury = false;
                            }
                            Athletes a = new Athletes(id, name, subname, birthDate, RG, CPF, adress, companyName, cnpj, companyAdress, branch, dateStart, contractNumber, salary, position, positionOwner, injury);
                            System.out.println(a);
                        }
                    } else if (op1Case1 == 2) {

                    }
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Desligando...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}
