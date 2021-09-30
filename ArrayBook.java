package ir.maktab;

import java.util.Scanner;

public class ArrayBook {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("1)fiction book \n2)non fiction book");
            int type = input.nextInt();
            switch (type) {
                case (1):
                    System.out.println("enter title");
                    String title1 = input.next();
                    books[i] = new Fiction(title1);
                    break;
                case (2):
                    System.out.println("enter title");
                    String title2 = input.next();
                    books[i] = new NonFiction(title2);
                    break;
            }
        }
        for (Book item : books) {
            System.out.println(item);
        }
    }
}
