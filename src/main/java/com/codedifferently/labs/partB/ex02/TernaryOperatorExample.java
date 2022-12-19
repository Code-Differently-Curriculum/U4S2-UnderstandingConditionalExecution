package com.codedifferently.labs.partB.ex02;

public class TernaryOperatorExample {

    public static String tern(){
        String response = "";

        String s1 = "Hello";
        String s2 = "Goodbye";
        String answer = s1.equals(s2) ? "Yes" : "No";
        response += (answer);

        return response;

    }
    public static void main(String args[]) {
        String output = tern();
        System.out.println(output);

    }
}
