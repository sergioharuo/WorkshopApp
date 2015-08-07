package teamtreehouse.com.calculator.Controler;

/**
 * Created by Haruo on 8/5/15.
 */
public class calcAge {

    private int ageToMonths;
    private int ageToDays;
    private int age;

    public int calculateAge(int age) {

    ageToMonths = age*12;

   return ageToMonths;
   }

    public int ageToDays(int age) {

        ageToMonths = age*12*30;

        return ageToMonths;
    }


}

