/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testchal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Compaq
 */
public class Chal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader clavier=new BufferedReader(new InputStreamReader(System.in));
		
		String [] s=new String [4];
		for(int i=0;i<4;i++)
		{
		
				s[i]=clavier.readLine();
				
				
	}
		
		for(int i=0;i<4;i++)
		{
                   
                    
		  int n1=Integer.parseInt(s[i].split(" ")[0]);
                  int n2=Integer.parseInt(s[i].split(" ")[1]); 
                  System.out.print(n1+" "+n2+" ");
                  int max=0;
                  
                  for( int j=n1;j<=n2;j++)
                  {
                   int cycle=0;
                   int n=j;
        do
        {cycle++;
           
            if(n%2!=0){
            n=n*3+1;
            }else n=n/2;
            
        }while(n!=1);
        cycle++;
              if(cycle>max)max=cycle;  
                  }
                  System.out.print(max+"\n");
                  
                  }
							
	}
        }