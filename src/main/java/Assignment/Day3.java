package Assignment;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Day3 {
    public static void main(String args[]){
        Stack<String> sr = new Stack<String>();
        boolean result = sr.empty();
        Scanner sc=new Scanner(System.in);
        boolean n=true;
        while(n){
            System.out.println("enter the names");
            String name = sc.nextLine();
            sr.push(name);
            if(sr.size()==7){
                n=false;
            }
        }
        System.out.println("most resent visited data");
        System.out.println(sr.pop());
    }
}