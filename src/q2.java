/*Você está começando na academia hoje e a sua instrutora fez um levantamento do seu biotipo,
além de outras informações suas. Ela para calcular o seu IMC (Índice de Massa Corporal), mediu o
seu peso e sua altura. Com essas informações em mãos, ela calculou o seu IMC usando a seguinte
fórmula: imc = peso / (altura * altura). Com o valor calculado, ela te apresentou a sua ficha de
acompanhamento. Você resolveu ajudar a sua instrutora e vai fazer um programa para calcular o
imc.*/

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your weight (in KG): ");
        double weight = scanner.nextDouble();
        System.out.println("Type your height (in meters and centimeters): ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);

        System.out.printf("Your IMC is %.2f", imc);

    }
}
