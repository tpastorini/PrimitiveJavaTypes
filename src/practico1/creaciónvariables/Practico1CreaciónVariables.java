/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico1.creaciónvariables;

/**
 *
 * @author Tatiana
 */
public class Practico1CreaciónVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // How can we know default value from primitive Java types?
        
        System.out.println("Type\t\tMinimum\t\t\tMaximum");
        System.out.println("byte\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);     
        
        // If we write a different value which it is not in the default range, 
        // we'll get an error. But we can define variables with one of the normal
        // values normally.
        
        byte byteValue = 127;
        short shortValue = -32768;
        int intValue = 2147483647;
        
        //Warning! All numbers in Java are default by 'ints'. Int value has range
        // -2147483648 to 2147483647 inclusive. If you want to declare a long
        // value, you must indicate it with a uppercase suffix 'L' at the end of
        //the number, like this:
        long longValue = -9223372036854775808L;
        
        // As same as long values, you must declare float and double numbers with
        // a uppercase suffix 'F' and 'D' like this:
        float floatValue = 1.4E-45F;
        double doubleValue = 1.7976931348623157E308D;
        
        System.out.println("\n\nType\t\tMy value");
        System.out.println("byte\t\t" + byteValue);
        System.out.println("short\t\t" + shortValue);
        System.out.println("int\t\t" + intValue);
        System.out.println("long\t\t" + longValue);
        System.out.println("float\t\t" + floatValue);
        System.out.println("double\t\t" + doubleValue);
    }
}
