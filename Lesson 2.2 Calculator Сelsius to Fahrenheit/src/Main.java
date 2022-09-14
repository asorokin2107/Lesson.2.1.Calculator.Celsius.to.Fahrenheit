import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Градус Цельсия: ");
        double celsius = scanner.nextDouble();
        double meaningone = 1.8;
        int meaningtwo = 32;

        System.out.println( "Градус Фаренгейта: " + (celsius * meaningone + meaningtwo));

        System.out.println("Формула" + "\tF = C * 1.8 + 32");




    }
}
