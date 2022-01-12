/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lehman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Lehman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
		//float p=37,b,a=3;
                Scanner scanner=new Scanner(System.in);
                System.out.print("Enter Prime Number To Test : ");
                int p = scanner.nextInt();
                
		int a = p,mm;
		int cp = 0,cpp = 0, cnp = 0;
		int m,z;
		Random r=new Random();
                
                System.out.print("Enter Iteration Number : ");
                int iteration = scanner.nextInt();
		
		for(int i=0; i<iteration ;i++)
                {
			a = a - 1;
                        
                        if(a<=0)
                            continue;
                        
                        
			System.out.println(a+"\n");
			m=((int)Math.pow(a,(p-1)/2))%p;
			
			System.out.println(m);
			
			if(m==1)
                        {
				cp++;
			}
                        
                        if(m==-1)
                        {
                            cpp++;
                        }
			
			else 
                        {	
				cnp++;
			}		
			
		}
                
                if(cp == 0 && cpp == 0)
                {
                    System.out.println("Not Prime.");
                }
                
                else if(cp>0 || cpp>0)
                {
                    System.out.println("Likelihood of P is not Prime 50%!");
                        
                    if(cp>0 && cpp>0)
                    {
                        System.out.println("Probably Prime with an error rate 1 in 2^t");
                    }
		}
                
                /*
		if(cp>=cnp){
			System.out.println(" Prime 50%!");
		}
                */
                if(cp !=0 && cpp !=0){
			System.out.println(" Not Prime");
		}
                
                
                
		//*/

	}

}
