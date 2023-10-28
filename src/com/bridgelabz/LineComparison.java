package com.bridgelabz;

import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.getX(), 2) + Math.pow(this.y - other.getY(), 2));
    }
}

class Line implements Comparable<Line> {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        return startPoint.distance(endPoint);
    }

    @Override
    public int compareTo(Line other) {
        double thisLength = this.length();
        double otherLength = other.length();
        return Double.compare(thisLength, otherLength);
    }
}

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Practice Problems!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of line 1:");
        Point point1 = new Point(sc.nextDouble(), sc.nextDouble());
        Point point2 = new Point(sc.nextDouble(), sc.nextDouble());
        Line line1 = new Line(point1, point2);

        System.out.println("Enter coordinates of line 2:");
        Point point3 = new Point(sc.nextDouble(), sc.nextDouble());
        Point point4 = new Point(sc.nextDouble(), sc.nextDouble());
        Line line2 = new Line(point3, point4);

        System.out.println("Length of line 1: " + line1.length());
        System.out.println("Length of line 2: " + line2.length());

        int result = line1.compareTo(line2);
        if (result == 0) {
            System.out.println("Two lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 2 is greater");
        }
    }
}

