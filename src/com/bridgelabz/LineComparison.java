package com.bridgelabz;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Line Comparison Practice Problems!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter co-ordinates of x : ");
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();

        System.out.println("Enter co-ordinates of y : ");
        double y1 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double lengthOfLine = sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Length of line is :"+lengthOfLine);
    }
}
