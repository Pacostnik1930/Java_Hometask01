// Вывести все простые числа от 1 до 1000

public class Task03 {
    public static void main(String[] args) {
        int number;
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i && count < 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            System.out.println(i);
        }
    }
}
