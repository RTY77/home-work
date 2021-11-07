package com.sbrf.reboot;

public class Calculator {
    public static int getAddition(int x, int y){
        return Math.addExact(x,y);
    }

    public static int getSubtraction (int x, int y){
        return Math.subtractExact(x,y);
    }

    public static int getMultiplication(int x, int y){
        return Math.multiplyExact(x,y);
    }

    public static double getDivision(double x, double y){
        if(y == 0.0) {
            return Double.NaN;
        }
        return x/y;

    }

    public static double getPow(double x, double y){
        if(x == 0.0) {
            return 0.0;
        }
        double result =  Math.pow(x,y);
        if(result == Double.POSITIVE_INFINITY ) {
            throw new ArithmeticException("Double overflow resulting in POSITIVE_INFINITY");
        } else if(result == Double.NEGATIVE_INFINITY) {
            throw new ArithmeticException("Double overflow resulting in NEGATIVE_INFINITY");
        } else if(Double.compare(-0.0f, result) == 0) {
            throw new ArithmeticException("Double overflow resulting in negative zero");
        } else if(Double.compare(+0.0f, result) == 0) {
            throw new ArithmeticException("Double overflow resulting in positive zero");
        }
        return result;
    }

    public static double getMin(double x, double y){
        return Math.min(x,y);
    }

    public static double getMax(double x, double y){
        return Math.max(x,y);
    }
}
