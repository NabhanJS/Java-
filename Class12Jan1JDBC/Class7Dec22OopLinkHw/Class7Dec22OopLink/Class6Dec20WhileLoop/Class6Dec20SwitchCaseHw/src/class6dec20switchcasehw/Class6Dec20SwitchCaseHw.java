
package class6dec20switchcasehw;

import java.util.Scanner;

public class Class6Dec20SwitchCaseHw {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter ur username");
        String userName=sc.nextLine();
        
        switch(userName){
            case "Nabhan":
                System.out.println("hello "+ userName);
                break;
            case "Mohona":
                System.out.println("hello "+userName);
                break;
            default:
                System.out.println("wrong");
        
        }
        
        
    }
    
}
