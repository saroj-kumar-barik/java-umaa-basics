package org.objects.complexNumber;

public class ComplexNumbersMain {
    public static void main(String[] args) {
        ComplexNumbers one = new ComplexNumbers(5.0,4.0);
        ComplexNumbers numbers = new ComplexNumbers(2.5,1.5);

        one.add(1.0,1.0);
        System.out.println("one.realPart = "+one.getRealPart());           // 6.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart()); // 5.0

        numbers.add(numbers);
        System.out.println("one.realPart = "+one.getRealPart());            // 6.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());  // 5.0

        one.add(numbers);
        System.out.println("one.realPart = "+one.getRealPart());            // 11.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());  //  8.0

        numbers.add(numbers);
        System.out.println("Numbers.realPart = "+numbers.getRealPart());          //10.0
        System.out.println("Numbers.imaginaryPart = "+numbers.getImaginaryPart());// 6.0

        one.subtract(4.0,7.0);
        System.out.println("one.realPart = "+one.getRealPart());             // 7.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());   // 1.0

        numbers.subtract(numbers); // 0 0
        System.out.println("one.realPart = "+one.getRealPart());             // 7.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());   // 1.0

        one.subtract(numbers);
        System.out.println("one.realPart = "+one.getRealPart());             // -7.0
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());   // -1.0

        numbers.subtract(numbers);
        System.out.println("Numbers.realPart = "+numbers.getRealPart());           // 0.0
        System.out.println("Numbers.imaginaryPart = "+numbers.getImaginaryPart()); // 0.0
    }
}
