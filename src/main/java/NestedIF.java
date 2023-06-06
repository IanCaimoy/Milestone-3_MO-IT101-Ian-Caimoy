/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ian Kent
 */
public class NestedIF 
{
    public static void main(String args[]) 
   { 
      int age = 20; 
      boolean hasVoterCard = true;
      if (age > 18)  // if age is greater than 18
      {  
         // It will be printed when "Outer IF" block condition is true. 
         // It doesn't depend on the inner if block.    
        System.out.println("The age of person is : " + age); 
        
            // "Inner IF block"
            if(hasVoterCard) // If person has voter card
            {  
               // It will be print only if outer and inner block condition both are true 
               System.out.println("The person has voter card also");  
               // inner if block is closed
            } 
          
         // It will be printed when "Outer IF" block condition is true. 
         // It doesn't depend on the "Inner IF" block.    
        System.out.println("Statement after the inner if block"); 
      }  // outer if block is closed
 
      // It will print always because it outside the both if blocks.
        System.out.println("Statement after the outer if block"); 
        
        
      
        boolean hasVoterCard1 = false;
        // Here value of age is 20 so outer if condition will be true
        if (age > 18)
        {
            // hasVoterCard variable has false value
            if (hasVoterCard1)
            {
                System.out.println("You are eligible");
            }
        System.out.println("The age of person is : " + age);
        }
        
   } 
    
    
    
}
