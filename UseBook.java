package ir.maktab;

import ir.maktab.Book;
import ir.maktab.Fiction;
import ir.maktab.NonFiction;

import java.util.Scanner;

public class UseBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1)fiction book \n2)non fiction book");
        int type = input.nextInt();
        switch (type) {
            case (1):
                System.out.println("enter title");
                String title1 = input.next();
                Book fBook = new Fiction(title1);
                System.out.println(fBook);
                break;
            case (2):
                System.out.println("enter title");
                String title2 = input.next();
                Book nBook = new NonFiction(title2);
                System.out.println(nBook);
                break;
        }
    }
}
