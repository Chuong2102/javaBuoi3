import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chuon
 */
public class Sub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b;
        int result = 0;
        int userResult;
        //Nhap
        System.out.println("Nhap a");
        a = input.nextInt();
        System.out.println("Nhap b");
        b = input.nextInt();
        
        if(a < b){
            System.out.println("a nho hon b, moi nhap lai !!");
        }
        else{
            result = a - b;
        }
        
        System.out.println(a + "-" + b +" bang bao nhieu");
        userResult = input.nextInt();
        
        if(userResult == result){
            System.out.println("Ket qua dung !!!");
        }
        else{
            System.out.println("Ket qua sai !!!");
        }
        
        
    }
    
}
