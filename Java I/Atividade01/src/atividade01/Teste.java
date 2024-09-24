package atividade01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[2];

        for (int i = 0; i < 2; i++) {
            veiculos[i] = new Veiculo();

            System.out.println("Digite as informações do veículo " + (i + 1) + ":");
            
            System.out.print("Placa: ");
            veiculos[i].setPlaca(scanner.nextLine());

            System.out.print("Marca: ");
            veiculos[i].setMarca(scanner.nextLine());

            System.out.print("Modelo: ");
            veiculos[i].setModelo(scanner.nextLine());

            System.out.print("Cor: ");
            veiculos[i].setCor(scanner.nextLine());
            
            System.out.print("Veloxidade Máxima: ");
            veiculos[i].setVeloMax(scanner.nextFloat());
            
            System.out.print("Quantidade de Rodas: ");
            veiculos[i].setQtdRodas(scanner.nextInt());
            
            System.out.print("Potência do Motor (CV): ");
            int potencia = scanner.nextInt();
            veiculos[i].getMotor().setPotencia(potencia);

            System.out.print("Quantidade de Pistoes: ");
            int qtdPist = scanner.nextInt();
            veiculos[i].getMotor().setQtdPist(qtdPist);
          
            System.out.println();
        }

        
        System.out.println("Informações dos veículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirInfo();
        }

        scanner.close();
    }
}
 