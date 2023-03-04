import java.util.Scanner;

// Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task01{
    public static void main(String[] args){
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = numScanner.nextInt();
        numScanner.close();

        int result = n*(n+1)/2;
        System.out.println(result);
    
    }

}
