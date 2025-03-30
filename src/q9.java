/*A sua professora de Física passou uma questão sobre velocidade média. Ela explicou que a
velocidade média de um corpo, por exemplo, um carro, é calculada dividindo a distância
percorrido (em metros) pela quantidade de tempo (em segundos).
Desse modo, a velocidade = distancia / tempo. Você que não é besta foi logo fazendo um
programa que calculasse a velocidade média, apenas lendo a distância percorrida e o tempo
gastado para percorrê-lo*/

import  java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the distance traveled by the car (in meters): ");
        double distance = scanner.nextDouble();
        System.out.println("Type the time traveled (in seconds): ");
        double time = scanner.nextDouble();

        double averageSpeed = distance / time;

        System.out.printf("The average speed of this car is %.2f m/s", averageSpeed);
    }
}
