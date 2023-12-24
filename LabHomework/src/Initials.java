/*QUESTION -1: Write a program whose class name "Initials" that reads two names and prints First Letter of First Name & First Letter of Second Name */

import java.util.Scanner;

public class Initials

{

    public static void main(String[] args){
        
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your first name: ");

            String first = in.next();

            System.out.print("Enter your significant other's first name: ");

            String second = in.next();

            String initials = first.substring(0, 1) + "&" + second.substring(0, 1);

            System.out.println(initials);
        }

    }

}