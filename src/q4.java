/*Maria amou o programa que você fez para ela de calcular a área dos terrenos, mas ela possui outro
grande problema: alguns terrenos não possuem lados uniformes, assim, ela precisa, muitas vezes,
informar, além da área, o perímetro do terreno. Ela confirmou a você que todos os terrenos só
possuem quatro lados. Você sabe que para calcular o perímetro do terreno basta somar todos os
lados. Dessa forma, você confirmou a ela que faria esse programa de calcular perímetro.*/

import  java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the length of the first side");
        double l1 = scanner.nextDouble();
        System.out.println("Type the length of the second side");
        double l2 = scanner.nextDouble();
        System.out.println("Type the length of the third side");
        double l3 = scanner.nextDouble();
        System.out.println("Type the length of the fourth side");
        double l4 = scanner.nextDouble();

        double perimeter = l1 + l2 + l3 + l4;

        System.out.printf("The perimeter of this terrain is %.2fm2", perimeter);
    }
}
