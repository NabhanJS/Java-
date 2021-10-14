/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying;

import java.util.HashSet;

/**
 *
 * @author nabha
 */
public class Trying {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        for (int i=0; i<3; i++)
            for (int j=5; j>2*i;j--)
                sum=sum+(j-i);
        System.out.println(sum);
        

        
        
    }
    
}
