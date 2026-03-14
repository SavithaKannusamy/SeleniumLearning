package org.testleaf.week2.day1;

public class Calculator {

    public void add(int a, int b)
    {
        System.out.println("The addition of two numbers is: " + (a+b));
    }
    public void sub(int a, int b)
    {
        System.out.println("The subtraction of two numbers is: " + (a-b));
    }
    public void mul(int a, int b)
    {
        System.out.println("The multiplication of two numbers is: " + (a*b));
    }
    public void div(int a, int b)
    {
        System.out.println("The division of two numbers is: " + (a/b));
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();  
        calc.add(10,20);  
        calc.sub(50,40);  
        calc.mul(10,20);
        calc.div(100,20);
    }   

}
