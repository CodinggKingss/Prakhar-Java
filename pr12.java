/*write a menu driven program with two options print day of week and name of the month.
 * your program should than ask day number or month number then on the basis of the choice selected print either day of \
 * week or name of the month
 */
package Java;
import java.util.*;
public class pr12 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int daynumber,monthnumber,ch;
            System.out.println("MAIN MENU");
            System.out.println("Option                  key to press");
            System.out.println("Print day of week -----> 1");
            System.out.println("Print name of month-----> 2");
            System.out.println("Input option number 1 or 2 ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Input a day number 1-7: ");
                daynumber=sc.nextInt();
                switch(daynumber)
                {
                    case 1: System.out.println("The day name = Monday");   break;
                    case 2: System.out.println("The day name = Tuesday");  break;
                    case 3: System.out.println("The day name = Wednesday"); break;
                    case 4: System.out.println("The day name = Thursday"); break;
                    case 5: System.out.println("The day name = Friday");  break;
                    case 6: System.out.println("The day name = Saturday"); break;
                    case 7: System.out.println("The day name = Sunday"); break;
                    default: System.out.println("Wrong day number......");  break;
                }
                break;
                case 2:
                System.out.println("Input a month number 1-12 :");
                monthnumber=sc.nextInt();
                switch(monthnumber)
                {
                    case 1: System.out.println("The month name = January"); break;
                    case 2: System.out.println("The Month name = February"); break;
                    case 3: System.out.println("The Month name = March"); break;
                    case 4: System.out.println("The Month Name = April"); break;
                    case 5: System.out.println("The Month Name = May"); break;
                    case 6: System.out.println("The month name = June"); break;
                    case 7: System.out.println("The Month name = July"); break;
                    case 8: System.out.println("The month name = August"); break;
                    case 9: System.out.println("The month name = September"); break;
                    case 10: System.out.println("The month name = October"); break;
                    case 11: System.out.println("The month name = November"); break;
                    case 12: System.out.println("The month name = December"); break;
                    default: System.out.println("Wrong choice......");
                }
                break;
                default: System.out.println("Wrong calue of ch is entered.....");
            }
        }
                }
            }
        

                
        
        
    

