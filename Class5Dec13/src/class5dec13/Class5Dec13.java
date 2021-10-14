package class5dec13;

import java.util.Scanner;

public class Class5Dec13 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter ur number");
        int number=sc.nextInt();
        
        if(number>=80){
            System.out.println("excellent");
        
        }else if(number>=70){
            System.out.println("very good");
        
        }else if(number>=60){
            System.out.println("good");
        
        }else if(number>=50){
            System.out.println("ok");
        
        }else{
            System.out.println("poor");
        
        }
        
        
    }
    
}
