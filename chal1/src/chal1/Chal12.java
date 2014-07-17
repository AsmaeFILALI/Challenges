/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chal1;

/**
 *
 * @author info
 */
public class Chal12 {
    public static void main(String [] args){
    
        int n=3;
        int max=0;
        do
        {max++;
            System.out.println(n);
            if(n%2!=0){
            n=n*3+1;
            }else n=n/2;
            
        }while(n!=1);
        max++;
        System.out.println("max="+max);
    }
    
}
