package org.objects.complexNumber;

public class ComplexNumbers {
    private double realPart, imaginaryPart ;

    public ComplexNumbers(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void add(double realPart, double imaginaryPart){
        this.realPart = this.realPart+realPart ;
        this.imaginaryPart = this.imaginaryPart + imaginaryPart ;
    }

    public void add(ComplexNumbers numbers){
        this.realPart = numbers.realPart + this.realPart;
        this.imaginaryPart = numbers.imaginaryPart + this.imaginaryPart;
    }

    public void subtract(double realPart, double imaginaryPart){
        this.realPart = this.realPart - realPart ;
        this.imaginaryPart = this.imaginaryPart - imaginaryPart ;
    }

    public void subtract(ComplexNumbers numbers){
        this.realPart = numbers.realPart - this.realPart;
        this.imaginaryPart = numbers.imaginaryPart - this.imaginaryPart;
    }

}
