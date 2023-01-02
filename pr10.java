/*practice program ...with switch case and  discount */
package Java;
import java.util.*;
public class pr10 {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){
        int pa,ch;
        System.out.println("Press 1 for laptops ");
        System.out.println("Press 2 for Desktops");
        ch=sc.nextInt();
        double dis = 0.0;
        double fa=0.0;
        switch(ch)
        {
          case 1:
          System.out.println("Enter Marked price of the item :");
          pa=sc.nextInt();
          if(pa>=0&&pa<=25000)
          {    
            dis=0.0;
            
          }
          if(pa>25000&&pa<=57000)
          {
            dis=0.05*pa;
             
            
          }
          if(pa>57000&&pa<=100000)
          {
            
             dis =0.075*pa;
            
            
          }
         if(pa>100000)
         {
         
            dis = 0.1*pa;
            
            
         }
         fa=pa-dis;
         System.out.println("Discount is :" + dis);
         System.out.println("Final price after discount :" + fa);
         break;
          case 2:
         System.out.println("Enter Marked price of the item :");
          pa=sc.nextInt();
          if(pa>=0&&pa<=25000)
          {
           
            dis=0.05;
             
            
          }
          if(pa>25000&&pa<=57000)
          {
            
             dis=0.075*pa;
             
            
          }
          if(pa>57000&&pa<=100000)
          {
            
             dis =0.1*pa;
            
           
          }
         if(pa>100000)
         {
            
             dis = 0.15*pa;
             
            
        }
        fa=pa-dis;
        System.out.println("Discount is : " +dis);
        System.out.println("Final price after discount is : "+fa);
        break;
        default: System.out.println("Wrong choice.......");

    }
}}
}

          

        
    

