// Copyright @ SanKir Technologies, 2018 - Java Programming - String Methods and Classes
package stringmethods;

import java.util.*;

public class StringMethods {

    public static void main(String[] args) {

        String input = "This city name is Bangalore";
        System.out.println(input);
        System.out.println();

        System.out.println("Enter the mathcing word to be searched ");
        Scanner userinput = new Scanner(System.in);
        String matchword = userinput.next();

        // contains
        if (input.contains(matchword)) System.out.println("User entered word matches in the String.");
        else System.out.println("Word doesn't match");
        System.out.println();

        String name1 = "SanKir";
        String name2 = "Sankir";

        //equals and equalsIgnoreCase
        System.out.println("Names are : " + name1 + ", " + name2);

        if (name1.equals(name2)) System.out.println("Both names same - case senstivie");
        else System.out.println("Both names are different - case sensitive");


        if (name1.equalsIgnoreCase(name2)) System.out.println("Both names same - case insenstive");
        else System.out.println("Both names different - case insensitive");

        System.out.println();

        // length, to lowercase, to Uppercase, charAt
        String name = "Jayanagar,Bangalore,Karnataka";
        System.out.println("String Name is  : " + name);
        System.out.println("Length of name is : " + name.length());
        System.out.println("Name is lowercase : " + name.toLowerCase());
        System.out.println("Name in Uppercase : " + name.toUpperCase());
        System.out.println("Character at index 1 of name is : " + name.charAt(1));
        String[] words = name.split(",");
        System.out.println("Split words of name are : " + words[0] + " " + words[1] + " " + words[2]);

        System.out.println();
        System.out.println("Usage of StringBuilder Class:");

        // StringBuilder Class : methods - append, reverse
        StringBuilder strbld = new StringBuilder();
        //strbld.append(name);
        System.out.println("After Append : " + strbld.append(name));
        strbld = strbld.reverse();
        System.out.println("After Reverse : " + strbld);

        // StringTokenizer Class : methods - hasMoreElements, nextToken
        System.out.println();
        System.out.println("Usage of StringTokenizer Class:");
        String expr = "Amit,BDT,Davangere";
        StringTokenizer stz = new StringTokenizer(expr, ",");

        while (stz.hasMoreElements()) {
            System.out.println(stz.nextToken());
        }
    }
}
