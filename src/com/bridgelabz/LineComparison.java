package com.bridgelabz;

import java.util.Comparator;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Practice Problems!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter co-ordinates of line 1 : ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Enter co-ordinates of line 2 : ");
        double x3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double lengthOfLine1 = sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double lengthOfLine2 = sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));

        System.out.println("Length of line is 1 :"+lengthOfLine1);
        System.out.println("Length of line is 2 :"+lengthOfLine2);

        int result = Double.compare(lengthOfLine1,lengthOfLine2);
        if (result==0){
            System.out.println("Two lines are equal");
        }
        else if (result >0){
            System.out.println("Line 1 is greater than Line 2");
        }
        else{
            System.out.println("Line 2 is greater");
        }
    }
}
