/*Você saiu com seus amigos para ir ao cinema. Depois de assistirem o filme, vocês foram para um
restaurante comemorar o aniversário de sua amiga, Alice. Na hora de pagar a conta, como sempre,
foi aquele furdunço, divide daqui, divide dali. Então, você pensou: vou fazer um programa para
calcular a conta por pessoa em um aniversário. Claro que a aniversariante não conta. Deste modo,
você faria um programa que lesse o total da conta, divide-a pelo número de pessoas na mesa,
menos o aniversariante. Depois, você só precisa exibir quanto cada um tem que pagar.*/


import  java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the total of the recipe: ");
        double recipe = scanner.nextDouble();
        System.out.println("Type the total amount of the participants: ");
        double participants = scanner.nextDouble();

        double totalrecipe = (recipe / (participants-1));

        System.out.printf("The total of the recipe for each one is: %.2f", totalrecipe);
    }
}
