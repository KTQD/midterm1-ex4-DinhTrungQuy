import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
        Thread maxThread = new Thread(() -> {
//            int max = numbers[0];
//            for (int number : numbers) {
//                if (number > max) {
//                    max = number;
//                }
//            }
//            System.out.println("Phần tử lớn nhất trong mảng là: " + max);
            System.out.println("Phần tử lớn nhất trong mảng là: " + Arrays.stream(numbers).max().getAsInt());
        });
        Thread sumThread = new Thread(() -> {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Tổng của các phần tử trong mảng là: " + sum);
        });


        maxThread.start();
        sumThread.start();


    }
}
