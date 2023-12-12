package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Setup any variables you need and call your methods
       * here in the main method */
        double purchaseAmount = inputPurchasePrice();
        double stateTax = calculateTax(purchaseAmount,.04);
        double countyTax = calculateTax(purchaseAmount,.03);
        double tax = stateTax + countyTax;
        double total = calculateTotal(purchaseAmount,tax);
        displayTotals( purchaseAmount,  stateTax, countyTax, tax, total);
    }

    /* Write a method called inputPurchasePrice that
    *  takes the user input for price, converts to
    *  a double, and returns the price
    * */
    public static double inputPurchasePrice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchase amount here: ");
        return scanner.nextDouble();
    }

    /* Write a method called calculateTax that
     * accepts price and tax rate as parameters and
     * calculates and returns the tax
     * */
   public static double calculateTax(double price, double taxRate){
       return taxRate * price;
   }

    /* Write a method called calculateTotal that
     * accepts two double values nd calculates and
     * returns the total
     * */
    public static double calculateTotal(double purchaseAmount,double tax){
        return purchaseAmount + tax;
    }
    /* Write a method called displayTotals that takes
    *  purchasePrice, stateTax, countyTax, totalTax and totalPrice
    *  as parameters. Output using decimal formatter amd printf */
    public static void displayTotals(double purchasePrice, double stateTax,double countyTax,double totalTax,double totalPrice){
        System.out.printf("Your purchase amount is $%.2f \n", purchasePrice);
        System.out.printf("The state tax is $%.2f \n", stateTax);
        System.out.printf("The state tax is $%.2f \n",countyTax);
        System.out.printf("The total tax is $%.2f \n", totalTax);
        System.out.printf("The total purchase with tax is $%.2f \n", totalPrice);
    }
}