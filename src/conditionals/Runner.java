package conditionals;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int x = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Enter a number: ");
//        int y = scan.nextInt();
//        if (x > y) {
//            System.out.println(x + " is bigger than " + y);
//        } else {
//            System.out.println(y + " is bigger than " + x);
//        }
//
//        scan.nextLine();
//        System.out.println("Enter a num:");
//        int num3 = scan.nextInt();
//
//        if (num3 % 2 == 0) System.out.println("That number is even");
//        else System.out.println("That number is 0dd");
//
//        scan.nextLine();
//        System.out.println("Enter a traffic light colour:");
//        String colourChoice = scan.nextLine();
//
//        if (colourChoice.equals("green")) {
//            System.out.println("GO!");
//        } else if (colourChoice.equals("amber")) {
//            System.out.println("Prep");
//        } else if (colourChoice.equals("red")) {
//            System.out.println("Wait");
//        }

        System.out.println("Enter a number between 1-12: ");
        int month = scan.nextInt();
        switch (month) {
             case 1:
             case 2:
             case 3:
                 System.out.println("It's Winter");
                 break;
             case 4:
             case 5:
             case 6:
                 System.out.println("It's Spring");
                 break;
             case 7:
             case 8:
             case 9:
                 System.out.println("It's Summer");
                 break;
             case 10:
             case 11:
             case 12:
                 System.out.println("It's Autumn");
                 break;
             default:
                System.out.println("Invalid number");
         }



    }
}
