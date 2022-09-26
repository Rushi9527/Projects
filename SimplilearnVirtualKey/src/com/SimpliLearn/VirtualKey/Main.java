package com.SimpliLearn.VirtualKey;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("**************** Welcome to Lockedme.com ***********************\n\n" +
                "************Application Name: Virtual Key Repository************\n\n" +
                "***********************Developer Details************************\n\n" +
                "\t\tName: Rushikesh Shivaji Nikam \n" +
                "\t\tDesignation: JAVA Developer\n" +
                "\t\tDate: 26/09/2022\n");

        while (true) {
            System.out.println("Enter 1 : Get file names in ascending order\n" +
                    "Enter 2:  For Business Level Operation\n" +
                    "Enter 3: Close the Application");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            if (option == 1) {
                File file = new File("D:\\Java 1st Project" );
                String[] employee = file.list();
                Arrays.sort(employee);
                for (int i = 0; i< employee.length; i++) {
                    String filename = employee[i];
                    System.out.println(filename);
                }
            } else if (option == 2) {
                System.out.println("Enter 1 : add file\n" +
                        "enter 2:  Delete file\n" +
                        "enter 3:  Search file\n" +
                        "enter 4:  Go back");
                int input = sc.nextInt();
                switch (input) {
                    case 1:
                        System.out.println("Enter your file name");
                        Scanner sc1 = new Scanner(System.in);
                        String name = sc1.nextLine();
                        File file = new File("D:\\Java 1st Project\\" + name);
                        if (file.createNewFile()) {
                            System.out.println("File is created");
                        } else {
                            System.out.println("File is already exist");
                        }
                        break;
                    case 2:
                        System.out.println("Enter file name for delete");
                        Scanner sc2 = new Scanner(System.in);
                        String name1 = sc2.nextLine();
                        File file1 = new File("D:\\Java 1st Project\\" + name1);
                        if(file1.delete())
                            System.out.println("File is deleted");
                        else
                            System.out.println("File is not deleted or file is not found");
                        break;
                    case 3:
                        System.out.println("Enter your file name to search");
                        Scanner sc3 = new Scanner(System.in);
                        String fileName = sc3.nextLine();
                        File file2 = new File("D:\\Java 1st Project\\" + fileName);
                        if( file2.exists())
                        {
                            System.out.println("File is available");
                        }
                        else {
                            System.out.println("File is not available");
                        }
                    case 4:
                        System.out.println("Going to back menu");
                        break;
                    default:
                        System.out.println("Please enter a valid one");
                }
            }
            if (option == 3){
                System.exit(option);
                System.out.println("Exited successfully");
            }
        }
    }
}
