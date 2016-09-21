package com.patrick;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);
    public static void main(String[] args) {

        int data[] = new int[3];
        data[0] = 10 ;
        data[1] = 15 ;
        data[2] = 8 ;
        System.out.println("First element= "+data[0]);
        int secondElement = data[1];
        int finalElement = data[2];
        String[] classrooms = {"First", "Second", "Third"};
        int numberOfRooms = classrooms.length;
        System.out.println("Total rooms "+numberOfRooms);
        for (int x =0; x<classrooms.length; x++){
            System.out.println(Arrays.toString(classrooms));
        }
        for (int x=0; x<classrooms.length;x++){
            System.out.println(classrooms[x]);
        }



/*        double numbersEntered = 0;
        double sumOfNumbers = 0;

        while (numbersEntered <2){
            System.out.println("Enter a number between 0 and 100.");
            double number = numberScanner.nextInt();
            if (number <0 || number >100){
                System.out.println("Number must be between 0 and 100.");
                continue;
            }
            numbersEntered++;
            System.out.println("You have entered "+numbersEntered+" numbers.  The last valid number you entered was "+number);
            sumOfNumbers = sumOfNumbers + number;
        }
        System.out.println("The total was "+sumOfNumbers);
        System.out.println("The average was "+sumOfNumbers/numbersEntered);*/

/*        Random randomNumberGenerator = new Random();
        while (true){
            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number or Q to quit.");
            String userInput = stringScanner.nextLine();
            if (userInput.equalsIgnoreCase("Q")){
                break;
            }
            int randomNumber = randomNumberGenerator.nextInt();
            System.out.println("Your random number is "+ randomNumber);
        }
        System.out.println("Goodbye.");*/

/*        String moreCalculations = "y";
        double price;
        double salesTax = 1.07;

        while (moreCalculations.equals("y")){
            System.out.println("Type in a price.");
            price = numberScanner.nextDouble();
            double priceInclTax = price * salesTax;

            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            String formattedPrice = currencyFormatter.format(priceInclTax);
            System.out.println("The price plus sales tax is "+formattedPrice);
            System.out.println("Do you want to continue?  Type y to continue.");
            moreCalculations=(numberScanner.next());
        }
        System.out.println("Thanks.  Goodbye.");*/




/*        Random randomNumberGenerator = new Random();
        while (true) {
            System.out.println("Want a random number? ");
            System.out.println("Enter any key for a random number or Q to quit.");
            String userInput = stringScanner.nextLine();
            if (userInput.equalsIgnoreCase("Q")) {
                break;

            }
        }int randomNumber = randomNumberGenerator.nextInt();
        System.out.println("Your random number is " + randomNumber);
        System.out.println("Thanks");*/






/*        String moreCalculations = "y";
        double price;
        double salesTax = 1.07;
        while (moreCalculations.equals("y")){
            System.out.println("Type in a price");
            price = numberScanner.nextDouble();
            double priceIncTax = price * salesTax;
            System.out.println("The price with tax is "+ priceIncTax);
            System.out.println("Do you want to continue?  Type y to continue.");
            moreCalculations = numberScanner.next();
        }
        System.out.println("good bye");*/

/*        String secretPassword = "kittens";
        System.out.println("Enter the password");
        String userPassword = stringScanner.nextLine();
        while (!userPassword.equals(secretPassword)){
            System.out.println("Password wrong.");
            System.out.println("Try again.");
            userPassword = stringScanner.nextLine();
        }
        System.out.println("Correct.");*/


/*        int size;
        System.out.println("How many stars per line? ");
        size = numberScanner.nextInt();

        for (int x =0; x<5; x++){
            for (int y=0; y<size; y++){
                System.out.print("*");
            }
            System.out.println();
        }*/

/*        int numberOfTests = 5;
        double testScore;
        double testScoreSum=0;
        double testScoreAverage;
        Scanner numberScanner = new Scanner(System.in);

        for (int test=1; test<=numberOfTests; test++){
            System.out.println("Enter test score #"+test);
            testScore = numberScanner.nextDouble();
            testScoreSum = testScoreSum + testScore;
        }
        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = "+testScoreAverage);

        stringScanner.close();
        numberScanner.close();*/

/*        for (int x = 50000; x <= 75000; x=x+3000){
            System.out.println(x);
        }*/
/*        for (int x = 10; x>=1; x--){
            System.out.println(x);
        }*/
/*        for (int x=5; x>=0; x--){
            System.out.println(x);
        }*/

/*        for (int x=5; x>=0; x=x-1){
            System.out.println(x);
        }*/
/*        for (int x =10; x<100; x=x+5){
            System.out.println(x);
        }*/
/*        for (int x =0; x<10; x=x+2){
            System.out.println(x);
        }*/

/*        System.out.println("Here are all the dates in January.");
        for (int day = 1; day <=31; day++){
            System.out.println("January "+day);
        }*/

        /*        for (int x = 0 ; x < 10 ; x++) {
            System.out.println(x);
        }*/
    }
}
