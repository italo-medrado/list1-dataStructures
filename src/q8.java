/*O IBGE (Instituto Brasileiro de Geografia e Estatística) para definir um preço médio de um produto
alimentar, por exemplo: o feijão, faz consulta a pelo menos 5 mercados de tamanhos variados.
Após ler os valores dos 5 mercados, o instituto calcula o valor médio do produto. Diferente do que
era praticado antes, atualmente, o IBGE utiliza um pequeno sistema para computar o preço
médio. Você está trabalhando na equipe de TI do IBGE para calcular o preço médio dos produtos.
Lembre-se de ler os cinco preços, calcular a média e exibir o resultado*/

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("What is the name of the product?");
        String prodname = scanner.next();
        System.out.printf("Type the price of the %s in the store 1: ", prodname);
        double store1 = scanner.nextDouble();
        System.out.printf("Type the price of the %s in the store 2: ", prodname);
        double store2 = scanner.nextDouble();
        System.out.printf("Type the price of the %s in the store 3: ", prodname);
        double store3 = scanner.nextDouble();
        System.out.printf("Type the price of the %s in the store 4: ", prodname);
        double store4 = scanner.nextDouble();
        System.out.printf("Type the price of the %s in the store 5: ", prodname);
        double store5 = scanner.nextDouble();

        double mediaprice = (store1 + store2 + store3 + store4 + store5) / 5;

        System.out.printf("The average price of the product is $%.2f", mediaprice);
    }
}
