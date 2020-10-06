package org.objects.pricepredictor;

public class Floor {
    double width, length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length;
    }
}
