package com.kamilszerlag.xmasstree;

import java.util.Scanner;

/**
 * Created by szerlag on 2018-03-18.
 */
public class ScannerValidation {
    private Scanner input = new Scanner(System.in);

    public int inputTreeHeight() {
        int number;
        boolean lessthenzero = false;
        do {
            if (lessthenzero == true)
                System.out.println("Podaj liczbe wieksza od zera! ;)");
            while (!input.hasNextInt()) {
                System.out.println("Nie podano liczby :( Sprobuj jeszcze raz!");
                input.nextLine();
            }
            number = input.nextInt();
            lessthenzero = true;
        } while (number <= 0);
        return number;
    }

    public String inputTreeName() {
        String name;
        boolean badchoice = false;
        do {
            if (badchoice == true) {
                System.out.println("Przpraszam, ale podales bledna nazwe :(\n Sprobuj jeszcze raz!");
            }
            //System.out.println("Enter on of tree Direction (UP,RIGHT,LEFT,UPSIDEDOWN) which you want to print");
            name = input.next();
            name = name.toLowerCase();
            badchoice = true;
        }
        while (!name.equals("up") && !name.equals("upsidedown") && !name.equals("left") && !name.equals("right") && !name.equals("extra") && !name.equals("koniec"));
        System.out.println("Wybrales: " + name);
        return name;
    }

    public String inputBranchesIcon() {
        String branchIcon;
        boolean badIcon = false;
        do {
            if (badIcon)
                System.out.println("Wykryto znak 'space'!");
            branchIcon = input.next();
            badIcon = true;
        } while (branchIcon.contains(" "));
        return branchIcon;
    }
}

