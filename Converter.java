import java.util.*;
import java.text.DecimalFormat;
 
public class Converter
{
   public static void main(String[] args)
   {
      double amount;
      double rupee, dollar, pound, euro;
      int choice;
 
      DecimalFormat f = new DecimalFormat("##.##");
 
      Scanner sc = new Scanner(System.in);
 
      System.out.println("These are the Choices:");
      System.out.println("Enter 1: Ruppe");
      System.out.println("Enter 2: Pound");
      System.out.println("Enter 3: Dollar");
      System.out.println("Enter 4: Euros");
     
      System.out.print("\nChoose Any One Option: ");
      choice = sc.nextInt();
 
      System.out.println("Please Enter the Amount to convert ?");
      amount = sc.nextFloat();
 
      switch (choice)
      {
         case 1: 
            dollar = amount / 70;
            System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
 
            pound = amount / 88;
            System.out.println(amount + " Rupee = " + f.format(pound) + " Pound");
 
            euro = amount / 80;
            System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
	    break;	
 
           
 
         case 2:  
            rupee = amount * 70;
            System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");
 
            pound = amount *0.78;
            System.out.println(amount + " Dollar = " + f.format(pound) + " Pound");
 
            euro = amount *0.87;
            System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
            break; 
          
         case 3:  
            rupee = amount * 88;
            System.out.println(amount + " pound = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.26;
            System.out.println(amount + " pound = " + f.format(dollar) + " Dollar");
 
            euro = amount *1.10;
            System.out.println(amount + " pound = " + f.format(euro) + " Euro");
            break;
           
 
         case 4:  
            rupee = amount * 80;
            System.out.println(amount + " euro = " + f.format(rupee) + " Ruppes");
 
            dollar = amount *1.14;
            System.out.println(amount + " euro = " + f.format(dollar) + " Dollar");
 
            pound = amount *0.90;
            System.out.println(amount + " euro = " + f.format(pound) + " Pound");
            break;
           
        
 
        
         default:
            System.out.println("Invalid Input");
      }
   }
}