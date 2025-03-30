/*Você quer viajar para fora do Brasil, mas ainda não escolheu o seu destino. Você está em dúvida
entre Europa, Canadá, Estados Unidos e Argentina. Você sabe que as moedas nessas regiões são:
euro, dólar canadense, dólar americano, peso argentino. Você queria um programa que você
desse o valor que deseja levar e as cotações do dia de cada moeda e imprimisse quanto em cada
moeda você teria. Então, resolveu que faria esse programa para você e sua mãe verem quanto de
dinheiro teriam em cada região.*/


import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brl, cusd, usd, ars, eur;
        cusd = 4.65;
        usd = 5.63;
        ars = 3.21;
        eur = 7.1;

        System.out.println("Type how much in BRL you wanna convert: ");
        brl = scanner.nextDouble();

        System.out.printf("The amount you will have in each currency will be:\n CUSD: %.2f\n USD: %.2f\n ARS: %.2f\n EUR: %.2f ", (brl * cusd), (brl * usd), (brl * ars), (brl * eur));

    }
}
