package rikkei.academy;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Điền số sv muốn tạo:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Số sv ko quá 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("điểm sv thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n Số sv đỗ kỳ kt là " + count);
    }
}
