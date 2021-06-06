/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {

        String actualPassword="Abc123";

        Scanner in = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password=in.nextLine();

        if(password.equals(actualPassword)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
}
