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
        double BMI;
        //Nhap
        System.out.println("Nhap chieu cao");
        height = input.nextDouble();
        System.out.println("Nhap can nang");
        weight = input.nextDouble();
        //Tinh
        height = height*2;
        BMI = weight / height;
        
        System.out.println("Chi so BMI la: "+BMI);
        if(BMI < 18.5){
            System.out.println("Underweight");
        }
        else{
            if(BMI >= 18.5 && BMI < 25){
                System.out.println("Normal");
            }
            else{
                if(BMI >=25 && BMI <=30){
                    System.out.println("Overweight");
                }    
                else{
                    System.out.println("Obese");
                }
            }
        }
        
        
        
    }
    
}
