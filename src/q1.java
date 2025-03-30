/*Você trabalha em um supermercado e no caixa que você trabalha o consumidor só pode comprar
um único produto, mesmo que várias unidades repetidas. Você deseja otimizar o seu trabalho e
criar um programa que leia o preço do produto e a quantidade de itens comprados e informe o
total da compra para o usuário.*/

import  java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the product price: ");
        double price = scanner.nextDouble();

        System.out.println("Type the quantity of items: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("The total amount of your grossness is $" + total);

    }
}
