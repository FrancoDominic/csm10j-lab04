/*
Programmer: Franco Lavares
Title:      Lab 4
Date:       September 22, 2015
Filename:   Lab04.java
 */

//package Lab04;

import java.util.Scanner;
import java.io.*;

public class Lab04 
{

    public static void main(String[] args) throws FileNotFoundException
    {
        int n1, n2, n3, n4, n5;
        
        double mean = computeMean();
        double stdDev = computeStandardDeviation();
       
        Scanner inFile = new Scanner(new File("input.txt"));
       
        n1 = inFile.nextInt();
        n2 = inFile.nextInt();
        n3 = inFile.nextInt();
        n4 = inFile.nextInt();
        n5 = inFile.nextInt();
        
        System.out.println("Input: " + n1 + " " + n2 + " " + n3 + " " + n4
        + " " + n5);
        System.out.printf ("Mean: " + "%.2f%n", mean);
        System.out.printf ("StdDev: " + "%.2f%n", stdDev );
        
    }
    
    public static double computeMean() throws FileNotFoundException
    {
        int n1, n2, n3, n4, n5;
        double mean;
       
        Scanner inFile = new Scanner(new File("input.txt"));
       
        n1 = inFile.nextInt();
        n2 = inFile.nextInt();
        n3 = inFile.nextInt();
        n4 = inFile.nextInt();
        n5 = inFile.nextInt();
        
        mean = ((n1 + n2 + n3 + n4 + n5) / 5);
        
        return mean;
    }
    
    public static double computeStandardDeviation()
                throws FileNotFoundException
    {
        int n1, n2, n3, n4, n5;
        double stdDev, x1, x2, x3, x4, x5, numerator;
        double mean = computeMean();
       
        Scanner inFile = new Scanner(new File("input.txt"));
       
        n1 = inFile.nextInt();
        n2 = inFile.nextInt();
        n3 = inFile.nextInt();
        n4 = inFile.nextInt();
        n5 = inFile.nextInt();
        
        x1 = n1 - mean;
        x2 = n2 - mean;
        x3 = n3 - mean;
        x4 = n4 - mean;
        x5 = n5 - mean;
        
        numerator = Math.pow(x1, 2) + Math.pow(x2, 2) + Math.pow(x3, 2) + 
                Math.pow(x4, 2) + Math.pow(x5, 2);
        
        stdDev = Math.sqrt(numerator / 5);
               
        return stdDev;
    }
        
}
