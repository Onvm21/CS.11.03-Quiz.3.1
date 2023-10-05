import java.util.Locale;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int a){
        char grade = 'A';
        if (a>=90){
            return grade;
        }
        if (a<=89 && a>=80){
            grade = 'B';
            return grade;
        }
        if (a<=79 && a>=70){
            grade = 'C';
            return grade;
        }
        if (a<=69 && a>= 60){
            grade = 'D';
            return grade;
        }
        if (a<=59 && a>=50){
            grade = 'E';
            return grade;
        }
        if (a <=49){
            grade = 'F';
            return grade;
        }
        return 0;
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a){
        if ((a%3 == 0) && (a%5 == 0)){
            return "fizzbuzz";
        }
        if (a%3 == 0){
            return "fizz";
        }
        if (a%5 ==0){
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String a){
        if (a.length() < 2){
            return a;
        }
        String front2 = a.substring(0,2);
        return front2+a+front2;
    }

    // Question 4 - twoAsOne

    public static boolean twoAsOne(int a, int b, int c){
        if (a + b == c){
            return true;
        }
        if (a + c == b){
            return true;
        }
        if (b + c== a){
            return true;
        }
        return false;
    }
    // Question 5 - endUp
    public static String endUp(String a){
        if (a.length() <=3){
            return a.toUpperCase();
        }
        String back3 = a.substring(a.length()-3);
        back3 = back3.toUpperCase();
        return a.substring(0,a.length()-3) + back3;
    }

}
