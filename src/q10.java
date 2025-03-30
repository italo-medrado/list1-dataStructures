/*Considere que a cobertura da tinta é de 1 litro para cada 6metros quadrados
e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
a. comprar apenas latas de 18 litros;
b. comprar apenas galões de 3,6 litros;
c. misturar latas e galões, de forma que o desperdício de tinta seja menor.
Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias*/


import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;
        double cobertura = 1.0 / 6.0;
        double gallonPrice = 80.00;
        double canPrice = 25.00;

        System.out.println("What is the length on the area to be painted? (in m2): ");
        double meters = scanner.nextDouble();
        double necessaryLiters = meters * cobertura;
        double amountCans = necessaryLiters / 18;
        double amountGallons = necessaryLiters / 3.6;

        if (amountCans % 1 > 0) {
            amountCans = (int) amountCans + 1;
        } else {
            amountCans = (int) amountCans;
        }

        if (amountGallons % 1 > 0) {
            amountGallons = (int) amountGallons + 1;
        } else {
            amountGallons = (int) amountGallons;
        }

        System.out.println("You want to:\n a. Buy just 18L cans\n b. Buy just 3.6L gallons\n c. Mix cans and gallons, in a way that the waste is less");
        option = scanner.next().toLowerCase().charAt(0);


        if (option == 'a') {
            double totalCansCost = amountCans * canPrice;
            System.out.printf("You will need %.0f can(s) to paint it\n", amountCans);
            System.out.printf("The total cost is: $%.2f\n", canPrice);
        } else if (option == 'b') {
            double totalCansCost = amountGallons * gallonPrice;
            System.out.printf("You will need %.0f gallon(s) to paint it\n", amountGallons);
            System.out.printf("The total cost is: $ %.2f\n", totalCansCost);
        } else if (option == 'c') {

            double usedCans = (int) (necessaryLiters / 18);
            double RemainingLiters = necessaryLiters - (usedCans * 18);
            double usedGallons = RemainingLiters / 3.6;

            if (usedGallons % 1 > 0) {
                usedGallons = (int) usedGallons + 1;
            } else {
                usedGallons = (int) usedGallons;
            }

            double totalMixedCost = (usedCans * canPrice) + (usedGallons * gallonPrice);
            System.out.printf("You will need %.0f cans(s) and %.0f gallon(s) to paint it\n", usedCans, usedGallons);
            System.out.printf("The total cost is: $ %.2f\n", totalMixedCost);
        } else {
            System.out.println("This isn't a valid option");
        }


    }
}
