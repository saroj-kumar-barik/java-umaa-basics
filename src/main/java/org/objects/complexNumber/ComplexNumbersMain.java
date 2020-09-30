package org.objects.complexNumber;

public class ComplexNumbersMain {
    public static void main(String[] args) {
        ComplexNumbers one = new ComplexNumbers(5.0,4.0);
        ComplexNumbers numbers = new ComplexNumbers(2.5,1.5);

        one.add(1.0,1.0);
        System.out.println("one.realPart = "+one.getRealPart());
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());

        numbers.add(numbers);
        System.out.println("one.realPart = "+one.getRealPart());
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());

        one.add(numbers);
        System.out.println("one.realPart = "+one.getRealPart());
        System.out.println("one.imaginaryPart = "+one.getImaginaryPart());

    }
}
