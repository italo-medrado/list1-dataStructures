/*O Bar do Boca é um bar conhecido na sua cidade. Todas as sextas-feiras, o bar tem música ao vivo
e um novo cardápio a cada mês. O dono do bar, Boca, não sabe mais o que fazer com as contas
que são fechadas erradas, pois os garçons esquecem de adicionar a taxa de couvert ou esquecem
que a gorjeta sai de 10% para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.

Você vai fazer um programa que ler o total da conta e acrescenta 20% da gorjeta e a taxa fixa do
couvert.*/

import  java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the total price of the recipe? ");
        double recipe = scanner.nextDouble();

        double totalrecipe = recipe + (recipe * 0.05);

        System.out.printf("The total price of the recipe, adding 20%% for the tip of the waiter: $ %.2f", totalrecipe);

    }
}
