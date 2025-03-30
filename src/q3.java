/*Maria trabalha para uma construtora no setor de vendas. Constantemente, ela tem que calcular a
área dos terrenos vendidos. Como Maria é sua amiga há muito tempo, você resolveu ajudá-la
criando um programa que lê o comprimento e a largura e imprime a área total do terreno em
metros quadrados.*/

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the length of the terrain");
        double length = scanner.nextDouble();

        System.out.println("Type the width of the terrain");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.printf("The total area of the terrain is %.2f m2", area );

    }
}
