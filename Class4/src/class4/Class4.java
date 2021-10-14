package class4;

import java.util.Scanner;

public class Class4 {
   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur username");
        String userName=sc.nextLine();
        
        if(userName.equalsIgnoreCase("Nabhan")){
            System.out.println("welcome "+ userName);
        
        }else if(userName.equalsIgnoreCase("mohona")) {
            System.out.println("elcome "+ userName);
        
        } else if(userName.equalsIgnoreCase("Malek")){
            System.out.println("welcome "+ userName);
        
        }else {
            System.out.println("incorrect username");
        
        }
       
    }
    
}
