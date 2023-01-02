
import java.util.*;
public class calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date, sum = 0;
        int Q, d, d1;
        int choice;
        System.out.println("Press 1 To Find  Day On the Entered Date");
        System.out.println("Press 2 To Find Day After A Given Day");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                String month;
                String weekday = "";
                int year;
                int centurycode = 0;
                int monthcode = 0;
                int oddday;
                System.out.println("Date Should be Within 15th century and 33rd Century");
                System.out.println("Enter the date");
                date = sc.nextInt();
                System.out.println("Enter the month");
                month = sc.next();
                System.out.println("Enter the year");
                year = sc.nextInt();
                if (year % 4 == 0 && year % 100 != 0)
//                  leap year
                {
                    if (year <= 1600) {
                        centurycode = 6;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 1600 && year <= 1700) {
                        centurycode = 4;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 1700 && year <= 1800) {
                        centurycode = 2;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 1800 && year <= 1900) {
                        centurycode = 0;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 1900 && year <= 2000) {
                        centurycode = 6;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2000 && year <= 2100) {
                        centurycode = 4;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2100 && year <= 2200) {
                        centurycode = 2;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2200 && year <= 2300) {
                        centurycode = 0;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2300 && year <= 2400) {
                        centurycode = 6;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2400 && year <= 2500) {
                        centurycode = 4;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2500 && year <= 2600) {
                        centurycode = 2;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2600 && year <= 2800) {
                        centurycode = 0;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2800 && year <= 2900) {
                        centurycode = 6;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 2900 && year <= 3000) {
                        centurycode = 4;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 3000 && year <= 3100) {
                        centurycode = 2;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    } else if (year > 3100 && year <= 3200) {
                        centurycode = 0;
                        if (month.equalsIgnoreCase("January"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("February"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("March"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("April"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("May"))
                            monthcode = 1;
                        if (month.equalsIgnoreCase("June"))
                            monthcode = 4;
                        if (month.equalsIgnoreCase("July"))
                            monthcode = 6;
                        if (month.equalsIgnoreCase("August"))
                            monthcode = 2;
                        if (month.equalsIgnoreCase("September"))
                            monthcode = 5;
                        if (month.equalsIgnoreCase("October"))
                            monthcode = 0;
                        if (month.equalsIgnoreCase("November"))
                            monthcode = 3;
                        if (month.equalsIgnoreCase("December"))
                            monthcode = 5;
                    }
                    d = year % 100;
                    d1 = d;
                    Q = d / 4;
                    sum = +d1 + date + Q + centurycode + monthcode;
                    oddday = (sum % 7) + 2;
                    if (oddday <= 7) {
                        if (oddday == 0)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Sunday");
                        if (oddday == 1)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Monday");
                        if (oddday == 2)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Tuesday");
                        if (oddday == 3)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Wednesday");
                        if (oddday == 4)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Thursday");
                        if (oddday == 5)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Friday");
                        if (oddday == 6)
                            System.out.println("The Day On " + date + " " + month + " " + year + " is Saturday");
                    } else {
                        if (oddday > 7) {
                            if ((oddday - 7) == 0)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Sunday");
                            if ((oddday - 7) == 1)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Monday");
                            if ((oddday - 7) == 2)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Tuesday");
                            if ((oddday - 7) == 3)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Wednesday");
                            if ((oddday - 7) == 4)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Thursday");
                            if ((oddday - 7) == 5)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Friday");
                            if ((oddday - 7) == 6)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Saturday");
                        }
                    }
                    if (year % 4 != 0) {
                        if (year <= 1600) {
                            centurycode = 6;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 1600 && year <= 1700) {
                            centurycode = 4;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 1700 && year <= 1800) {
                            centurycode = 2;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 1800 && year <= 1900) {
                            centurycode = 0;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 1900 && year <= 2000) {
                            centurycode = 6;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2000 && year <= 2100) {
                            centurycode = 4;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2100 && year <= 2200) {
                            centurycode = 2;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2200 && year <= 2300) {
                            centurycode = 0;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2300 && year <= 2400) {
                            centurycode = 6;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2400 && year <= 2500) {
                            centurycode = 4;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2500 && year <= 2600) {
                            centurycode = 2;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2600 && year <= 2800) {
                            centurycode = 0;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2800 && year <= 2900) {
                            centurycode = 6;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 2900 && year <= 3000) {
                            centurycode = 4;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year > 3000 && year <= 3100) {
                            centurycode = 2;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        } else if (year >3100 && year <= 3200) {
                            centurycode = 0;
                            if (month.equalsIgnoreCase("January"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("February"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("March"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("April"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("May"))
                                monthcode = 1;
                            if (month.equalsIgnoreCase("June"))
                                monthcode = 4;
                            if (month.equalsIgnoreCase("July"))
                                monthcode = 6;
                            if (month.equalsIgnoreCase("August"))
                                monthcode = 2;
                            if (month.equalsIgnoreCase("September"))
                                monthcode = 5;
                            if (month.equalsIgnoreCase("October"))
                                monthcode = 0;
                            if (month.equalsIgnoreCase("November"))
                                monthcode = 3;
                            if (month.equalsIgnoreCase("December"))
                                monthcode = 5;
                        }
                        d = year % 100;
                        d1 = d;
                        Q = d / 4;
                        sum = +d1 + date + Q + centurycode + monthcode;
                        System.out.println(sum);
                        oddday = (sum % 7) + 2;
                        if (oddday <= 7) {
                            if (oddday == 0)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Sunday");
                            if (oddday == 1)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Monday");
                            if (oddday == 2)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Tuesday");
                            if (oddday == 3)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Wednesday");
                            if (oddday == 4)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Thursday");
                            if (oddday == 5)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Friday");
                            if (oddday == 6)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Saturday");
                        }
                        else if(oddday>7){
                            oddday=oddday-7;
                            if (oddday == 0)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Sunday");
                            if (oddday == 1)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Monday");
                            if (oddday == 2)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Tuesday");
                            if (oddday == 3)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Wednesday");
                            if (oddday == 4)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Thursday");
                            if (oddday == 5)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Friday");
                            if (oddday == 6)
                                System.out.println("The Day On " + date + " " + month + " " + year + " is Saturday");
                        }
                        else
                        {
                            if (oddday>(2*7))
                            {
                                oddday=oddday-14;
                                if (oddday == 0)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Sunday");
                                if (oddday == 1)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Monday");
                                if (oddday == 2)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Tuesday");
                                if (oddday == 3)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Wednesday");
                                if (oddday == 4)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Thursday");
                                if (oddday == 5)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Friday");
                                if (oddday == 6)
                                    System.out.println("The Day On " + date + " " + month + " " + year + " is Saturday");
                            }
                        }
                            }}
                            break;
                            case 2:
                                System.out.println("Enter Day");
                                String day = sc.next();
                                int odd = 0;
                                if (day.equalsIgnoreCase("Monday"))
                                    odd = 1;
                                if (day.equalsIgnoreCase("Tuesday"))
                                    odd = 2;
                                if (day.equalsIgnoreCase("Wednesday"))
                                    odd = 3;
                                if (day.equalsIgnoreCase("Thursday"))
                                    odd = 4;
                                if (day.equalsIgnoreCase("Friday"))
                                    odd = 5;
                                if (day.equalsIgnoreCase("Saturday"))
                                    odd = 6;
                                if (day.equalsIgnoreCase("Sunday"))
                                    odd = 0;
                                System.out.println("Enter The No Of Days After Which You Want To Calculate the day ");
                                int day1 = sc.nextInt();
                                int rem = odd + (day1 % 7);
                                if (rem == 0)
                                    System.out.println("After " + day1 + " days the day will be Sunday");
                                if (rem == 1)
                                    System.out.println("After " + day1 + " days the day will be Monday");
                                if (rem == 2)
                                    System.out.println("After " + day1 + " days the day will be Tuesday");
                                if (rem == 3)
                                    System.out.println("After " + day1 + " days the day will be Wednesday");
                                if (rem == 4)
                                    System.out.println("After " + day1 + " days the day will be Thursday");
                                if (rem == 5)
                                    System.out.println("After " + day1 + " days the day will be Friday");
                                if (rem == 6)
                                    System.out.println("After " + day1 + " days the day will be Saturday");
                                break;
                        }
                    }

                }



