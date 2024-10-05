               /*check input year is leap year or not*/
                          
                          /*Leap year program*/

                        //   for knowing the leap year we have two conditions or methods - 

/*  1.  century    ------>     in this, between two leap year it means from one leap year to second leap year difference is 400 years
                            it means in century , in between two leap year we have difference of      400 years. 
            in this we have condition which is that -  (100%=0 and 400%=0)  amd then this year will be leap year.
               like example we have        first leap year - 2000    and then second leap year -  2400        and in this 
               between we have not any other leap year and here 2000 and 2400 also leap year because they are giving remainder zero(0)
               after diving with 100 and 400 both.
               
               
               in this if we have 1700 or 1800 or 1900 then these all years are not leap year because they are giving remainder zero (0) with only 100 and they 
               are not giving remainder zero(0)  with diving by 400.
*/







/*  2.  Yearly  ------->    in this continous leap year difference is 4 years.it means in this from one leap year to 
          second leap difference is four (4)  years.
          in this we have condition that ---->   (100% != 0 and 4% = 0 )  then that year will be the leap year , it means that in condition 
          we have given that if any year don't give remainder zero(0)  by dividing 100  and but that year give remainder zero(0) by dividing 4 then
          that year will be the leap year. 

        like this          2020 and 2024 are leap year  but     2021 2022  2023  is not the leap because they are not satisfing the condition.   


*/


/* 
import java.util.Scanner;               
class Leapyear{
    public static void main(String[] args) {
        int y;
        System.out.print("Enter any year:- ");
        Scanner r = new Scanner(System.in);              
        y = r.nextInt();                                              // here % sign is modulus sign which we use to find the remainder.
        if(y%100 == 0 && y%400 == 0 || y%100 != 0 && y%4 == 0){       // here we have used logical-and and logical-or operator.
            System.out.print("Leap year");
        }
        else{
            System.out.println("Not Leap year");
        } 
    r.close();
    }
}
*/






import java.util.Scanner;
class Leapyear{
    public static void main(String[] args) {
        int year;
        Scanner ref = new Scanner(System.in);
        System.out.print("Enter any year: ");
        year = ref.nextInt();
        if((year%400==0) && (year%100==0) || (year % 100 == 0) && ( year%4 == 0))
            System.out.println("Leap year "); 
        
        else 
            System.out.println(" not leap year ");
        
        ref.close();
    }
}



