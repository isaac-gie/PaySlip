
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isaac
 */
public class NetPaymentOfB {
    //int B = 700;    int allowanceB = 0;
    
    public static void paymentOfB(){
        Scanner grade = new Scanner (System.in);
            System.out.print("Enter the number of hours: ");
        int hours = grade.nextInt();
        int payment = 700 * hours;
            System.out.println("Your gross payment is: " + payment);
            
        if (payment > 36000){
            int subtract = payment - 36000;
            double cashAbove = 0.8 * subtract;
            double salary = 0.85 * 36000;
            double totalSalary = cashAbove + salary;
            double tax = payment - totalSalary;
                System.out.println("your tax: " + tax);
                System.out.println("Your net payment is: " + totalSalary);
        }
        else {
            if (payment < 12000)
                System.out.println("Your net payment is: " + payment);
            else if (payment < 24000 && payment >= 12000){
                double netpayment = 0.9 * payment; 
                double taxx = payment - netpayment;
                    System.out.println("your tax: " + taxx);
                    System.out.println("Your net payment is: " + netpayment);
            }
            else {
                if (payment < 36000 && payment >= 24000);
                double netSalary = payment * 0.85;
                double taxxx = payment - netSalary;
                    System.out.println("your tax: " + taxxx);
                    System.out.println("Your net payment is: " + netSalary);
            }
        }
    }
    
    public static void main(String[] args) {
            paymentOfB();
    }
    
}
