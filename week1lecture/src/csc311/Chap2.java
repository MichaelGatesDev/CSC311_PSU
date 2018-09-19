// Michael Gates


package csc311; // logical organization of your program, but it also follows the directory structure of the file
// package a.b.c; ->will be a directory 'a', with a sub-directory 'b' and a sub-directory 'c'

/* it looks like, C++ (almost java without the memory management), C# (a cousin) .....
 *
 * java -> javac -> bytecode -> jvm (java)
 *
 * the jvm interprets bytecode, it does not know it was written in Java
 *
 * 3 principles of OO: encapsulation (black box), inheritance (generalization <-> specialization), polymorphism
 *
 *  Java : javac vs java (JVM)
 *
 *  A source file: <myclassname.java>
 *  A compiled file: <myclassname.class>
 *
 *  Other file extension: .jar (zipped file of multiple .class), .war, .ear
 *
 *  Not executable, the jvm interprets the compiled java code (.class)
 *
 *  classpath: where to look for referred classes
 *
 *  On the command line:
 *
 *  will compile
 *  javac  Chap2.java
 *
 *  will execute
 *   java Chap2
 */

//single line comments

/*
 *   one class per file, the filename must be the same as the class (case sensitive on Linux)
 */
public class Chap2
{
    
    // void -> return type, void means no return value
    //public -> access modifier (public, protected, private, package protected)
    //main -> any class
    //
    // a literal is an object 'String'
    //
    public static void main(String args[])
    {
        //block of code are within { }
        //like indentation in Python
        //
        //identifier are case sensitive,
        //
        // Object name: 1st letter is uppercase, then CamelCase
        //
        // variable: 1st letter is lowercase
        //
        // 1st character cannot be a number
        //
        // literal are within ""
        // character are within ''
        //
        // is for single line comment
        /*
         *  is for multi lines comment
         *
         *  ; to end a statement
         */
        
        
    }
    
    //
    // Java supports the same primitive data types than C/C++ : byte, short, int, long, float, double, boolean, and char
    // and also an object variant (full name, starting with an uppercase int -> Integer)
    //
    // primitive types are all signed
    //
    // int,long,float,... are always the same number of bit (unlike C/C++ depending on the cpu architecture)
    //
    // byte: 8 bits
    // short: 16 bits
    // int: 32 bits
    // long: 64 bits
    //
    // float: 32 bits, single precision
    // double: 64 bits, double precision
    //
    // char <- unicode, not like C/C++ a single byte
    //
    // boolean (true, false)
    // 		boolean aa = 1;  <- does not compile, cannot convert an int to a boolean, not like C/C++
    //
    //
    
    
    public static int addOdd(int values[])
    {
        int sum = 0;
        
        //for all structure, the 1st element is always at index 0
        //like C,C++ -> 0 is false, anything else is true
        //
        System.out.println(values.length);
        for (int x = 0; x < values.length; x++)
        {
            int value = values[x]; //how we access variable in an array
            
            //
            // +, -, *, / <- standard mathematical operator
            // % is for modulo
            //
            // <, <=, >, >=,
            // == (single = is assignment, like C,C++)
            // ! negation
            
            if (value % 2 != 0)
            {
                sum += value;
            }
        }
        
        return sum;
    }
    
    
    public static int add(int values[])
    {
        int sum = 0;
        
        for (int x = 0; x < values.length; x++)
        {
            int value = values[x];
            sum += value;
        }
        
        return sum;
    }
    
    
}
