/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thue;
import java.util.Scanner;
/**
 *
 * @author chuon
 */
public class thue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        final int Single = 1;
        final int MarriedFilingJointly = 2;
        final int MarriedFilingSeparately = 3;
        final int HeafOfHoldhouse = 4;
        
        
        double tax = 0.0;
        System.out.println("Enter status: ");
        int status = sc.nextInt();
        
        if (status == Single) {
            System.out.println("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 8.350) {
                tax = income * 0.1;
                System.out.println(tax);
            } else if (income >= 8.351 && income <= 33.950) {
                tax = income * 0.15;
                System.out.println(tax);
            } else if (income >= 33.951 && income <= 82.250) {
                tax = income * 0.2;
                System.out.println(tax);
            } else if (income >= 82.251 && income <= 171.550) {
                tax = income * 28/100;
                System.out.println(tax);
            } else if (income >= 171.551 && income <= 372.950) {
                tax = income * 0.33;
                System.out.println(tax);
            } else {
                tax = income * 0.35;
                System.out.println(tax);
            }    
        } else if (status == MarriedFilingJointly) {
            System.out.println("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 16.700) {
                tax = income * 0.1;
                System.out.println(tax);
            } else if (income >= 16.701 && income <= 67.900) {
                tax = income * 0.15;
                System.out.println(tax);
            } else if (income >= 67.901 && income <= 137.050) {
                tax = income * 0.25;
                System.out.println(tax);
            } else if (income >= 137.051 && income <= 208.850) {
                tax = income * 0.28;
                System.out.println(tax);
            } else if (income >= 208.851 && income <= 372.950) {
                tax = income * 0.33;
                System.out.println(tax);
            } else {
                tax = income * 0.35;
                System.out.println(tax);
            }
        } else if (status == MarriedFilingSeparately) {
            System.out.println("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 8.350) {
                tax = income * 0.1;
                System.out.println(tax);
            } else if (income >= 8.351 && income <= 33.950) {
                tax = income * 0.15;
                System.out.println(tax);
            } else if (income >= 33.951 && income <= 68.525) {
                tax = income * 0.25;
                System.out.println(tax);
            } else if (income >= 68.526 && income <= 104.425) {
                tax = income * 0.28;
                System.out.println(tax);
            } else if (income >= 104.426 && income <= 186.475) {
                tax = income * 0.33;
                System.out.println(tax);
            } else {
                tax = income * 0.35;
                System.out.println(tax);
            }
        } else if (status == HeafOfHoldhouse) {
            System.out.println("Enter your income ");
            double income = sc.nextDouble();
            if(income >= 0 && income <= 11.950) {
                tax = income * 0.1;
                System.out.println(tax);
            } else if (income >= 11.951 && income <= 45.500) {
                tax = income * 0.15;
                System.out.println(tax);
            } else if (income >= 45.501 && income <= 117.450) {
                tax = income * 0.25;
                System.out.println(tax);
            } else if (income >= 117.451 && income <= 190.200) {
                tax = income * 0.28;
                System.out.println(tax);
            } else if (income >= 190.201 && income <= 372.950) {
                tax = income * 0.33;
                System.out.println(tax);
            } else {
                tax = income * 0.35;
                System.out.println("tax: "+ Math.round(tax*100.0)/100.0);
            }
        }
    }
    
}
