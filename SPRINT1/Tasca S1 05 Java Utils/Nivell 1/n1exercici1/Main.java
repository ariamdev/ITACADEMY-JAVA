package n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

           System.out.println("Please, introduce the directory path to order: ");
           File directory = new File(sc.next());
           sc.close();


           if (directory.exists() && directory.isDirectory() && directory.canRead()) {
               System.out.println("Valid directory path. ");
               File[] order = directory.listFiles();
               if (order == null) {
                   System.err.println("Error directory not found or not accesible.");
               } else {
                   Arrays.stream(order).sorted().forEach(file -> System.out.println(file.getName()));
               }
           } else {
               System.err.println("Error directory not found or not accesible.");
           }

    }
}
