import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = numScanner.nextInt();
        numScanner.close();

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);

    }

}
