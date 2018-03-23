package com.kamilszerlag.xmasstree;

import java.util.Scanner;

/**
 * Created by szerlag on 2018-03-18.
 */
public class ScannerValidation {
    private Scanner input = new Scanner(System.in);

    public int inputTreeHeight() {
        int number;
        do {
          //  System.out.println("Enter a positive number, more then 0");
            while (!input.hasNextInt()) {
                System.out.println("Your number isn't higher then 0");
                input.nextLine();
            }
            number = input.nextInt();
        } while (number <= 0);
        return number;
    }

    public String inputTreeName() {
        String name;
        do {
           // System.out.println("Enter on of tree Direction (UP,RIGHT,LEFT,UPSIDEDOWN) which you want to print");
            name = input.next();
            name = name.toLowerCase();
            System.out.println("Wybrales: "+ name);
        } while (!name.equals("up") && !name.equals("upsidedown")&&!name.equals("left")&&!name.equals("right")&&!name.equals("koniec"));
    return name;
    }
}


