public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Below are the all dta types listed below");
        //Data types declaration
        byte byteValue = 1;
        short ShortValue = 2;
        int IntValue = 4;
        long LongValue = 8L;
        float FloatValue = 4f;
        double DoubleValue = 8d;
        char CharValue = 't';
        boolean BooleanValue = true;

        System.out.println("Byte Size: " + byteValue + " & Byte Range " +
                Byte.MIN_VALUE + " TO " + Byte.MAX_VALUE);

        System.out.println("Int Size: " + IntValue + " & Int Range " +
                Integer.MIN_VALUE + " TO " + Integer.MAX_VALUE);

        System.out.println("Short Size: " + ShortValue + " & Short Range " +
                Short.MIN_VALUE + " TO " + Short.MAX_VALUE);

        System.out.println("Long Size: " + LongValue + " & Long Range " +
                Long.MIN_VALUE + " TO " + Long.MAX_VALUE);

        System.out.println("Float Size: " + FloatValue + " & Float Range " +
                Float.MIN_VALUE + " TO " + Float.MAX_VALUE);

        System.out.println("Double Size: " + DoubleValue + " & Double Range " +
                Double.MIN_VALUE + " TO " + Double.MAX_VALUE);

        System.out.println("Char Size: " + CharValue + " & Char Range " +
                (int)Character.MIN_VALUE + " TO " + (int)Character.MAX_VALUE);

        System.out.println("Boolean Size: 1bit & BooleanValue " + BooleanValue + " or False");

        System.out.println("Hare Krishna ! THank You");

    }
}