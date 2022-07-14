package Codes;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        String dateString = date.toString();
        String x=new String("Testing Strings");
        System.out.println(date);
        System.out.println(dateString);
        System.out.println(x);

        String y="AbA";
        System.out.println(y.matches("ab*"));
    }
}