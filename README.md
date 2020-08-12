# Primitive Java Data Types

When we are programming it is necessary to declare variables to store information temporarily. The objective of the declaration of variables within a code is to reserve memory according to it. These variables allow you to develop dynamic programs, because their values change during interaction and execution. The primitive data types of Java can be seen in the following image:

![Primitives_Java_Datatypes](/JavaDataTypes.png)


### Usage

These types of data have their minimum and maximum values which you can know it with something like this:

```Java
System.out.println("Type\t\tMinimum\t\t\tMaximum");
System.out.println("byte\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
System.out.println("short\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
System.out.println("int\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
System.out.println("long\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
System.out.println("float\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
System.out.println("double\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE); 
```

This code prints this:

```print
Type		Minimum			Maximum
byte		-128			127
short		-32768			32767
int		-2147483648		2147483647
long		-9223372036854775808	9223372036854775807
float		1.4E-45			3.4028235E38
double		4.9E-324		1.7976931348623157E308
```

If we write a different value which it is not in the default range, we'll get an error. But we can define variables with one of the normal values.

```Java
byte byteValue = 132;     // It's an error! :(
```

Warning! All numbers in Java are default by 'ints'. Int value has range -2147483648 to 2147483647 inclusive. If you want to declare a long value, you must indicate it with a uppercase suffix 'L' at the end of the number, like this:

```Java
long longValue = -9223372036854775808L;
```

As same as long values, you must declare float and double numbers with a uppercase suffix 'F' and 'D' like this:

```Java   
float floatValue = 1.4E-45F;
double doubleValue = 1.7976931348623157E308D;
``` 

### Warning
