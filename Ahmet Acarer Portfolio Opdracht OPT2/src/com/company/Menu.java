package com.company;

import java.util.Scanner;

public class Menu {
    private static final Data data = new Data();

    public static void main(String[] args)
    {
        System.out.println("__        _______ _     ____ ___  __  __ _____\n" +
                "\\ \\      / | ____| |   / ___/ _ \\|  \\/  | ____|\n" +
                " \\ \\/\\ / /|  _| | |  | |  | | | | |\\/| |  _|\n" +
                "  \\ V  V / | |___| |__| |__| |_| | |  | | |___\n" +
                "   \\_/\\_/  |_____|_____\\____\\___/|_|  |_|_____|");
        System.out.printf(
                "\n1) add vehicle" +
                "\n2) remove vehicle" +
                "\n3) compare vehicles" +
                "\n0) stop%n");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1)
        {
            System.out.println("You choose 1");
            data.addVehicle(new Vehicle("audi r8", 5, 250000, 5, 6, "benzine"));
            System.out.println("Vehicle was added");
        }

        else if (choice == 2)
        {
            System.out.println("You chose 2");
            if (data.getVehicles().size() == 0) { System.out.println("You didn't add any vehicles");
                System.out.println("Add vehicles!");
            }
            System.out.println("Enter the name of the vehicle you want to delete");
            scanner.nextLine();
            data.deleteVehicle(scanner.nextLine());
        } else if (choice == 3) {
            System.out.println("\n\n\nYou chose 3");
            if (data.getVehicles().size() == 0) {
                System.out.println("You didn't add any vehicles");
                System.out.println("Add vehicles!");
                main(args);
            }
            if (data.getVehicles().size() < 2) {
                System.out.println("You need to add more vehicles");
            }

        } else if (choice == 0) {
            System.exit(0);
        }
        main(args);
    }

}
