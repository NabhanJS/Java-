package class3dec6;

import java.util.Scanner;

public class Class3Dec6 {

    
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter ur name");
        String name=sc.next();
        
        if(name.equalsIgnoreCase("Nabhan")){
            System.out.println("Hi "+ name);
        
        }else{
            System.out.println("incorrect username");
        
        }
        

      
       
    }
    
}
