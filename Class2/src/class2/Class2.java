package class2;

import java.util.Scanner;

public class Class2 {

    public static void main(String[] args) {
        
        String name="Nabhan";
        String name1="I am Mohona";
        int nabhanAge=22;
        int mohonaAge1=23;
        
        System.out.println(name+" and "+ name1);
        System.out.println("i am "+name+" and my age is "+nabhanAge);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ur name");  
        String name3=sc.nextLine();
        
        System.out.println("enter ur age");
        int age2=sc.nextInt();
        System.out.println(name3+age2);
    
    }
    
}
