
package class5dec13hw;

import java.util.Scanner;

public class Class5Dec13Hw {

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter ur username");
        String userName=sc.nextLine();
        System.out.println("Please enter ur password");
        int password=sc.nextInt();
        
        if(userName.equalsIgnoreCase("Nabhan") && password==123){
            System.out.println("Welcome "+userName);
        
        }else{
            System.out.println("incorrect username");
        
        }
        
    }
    
}
