package class5;

import java.util.Scanner;

public class Class5 {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur number");
        int number=sc.nextInt();
        
        if(number<=2){
            System.out.println("bad");
        
        }else if(number<=4){
            System.out.println("ok");
        
        }else if(number<=6){
            System.out.println("good");
        
        }else{
            System.out.println("very good");
        
        }
        
        
        
    }
    
}
