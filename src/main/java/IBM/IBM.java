/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IBM;
import java.util.Scanner;
/**
 *
 * @author chuon
 */
public class IBM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double height, weight;
        double bmi;
        //Nhap
        System.out.println("Nhap chieu cao");
        height = input.nextDouble();
        System.out.println("Nhap can nang");
        weight = input.nextDouble();
        //Tinh
        
        height = height /100 ;
        height = height*height;
        bmi = weight / height;
        
        System.out.println("Chi so BMI la: "+bmi);
        if(bmi < 18.5){
            System.out.println("Underweight");
        }
        else{
            if(bmi >= 18.5 && bmi < 25){
                System.out.println("Normal");
            }
            else{
                if(bmi >=25 && bmi <=30){
                    System.out.println("Overweight");
                }    
                else{
                    System.out.println("Obese");
                }
            }
        }
        
        
        
    }
    
}
