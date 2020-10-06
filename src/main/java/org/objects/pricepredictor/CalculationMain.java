package org.objects.pricepredictor;

public class CalculationMain {

    Floor floor;
    Carpet carpet;


    public CalculationMain(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet(5.90);
        Floor floor = new Floor(12,13);
        CalculationMain calculationMain = new CalculationMain(floor,carpet);

        System.out.println("Total cost = "+calculationMain.getTotalCost());

        int a = 10;
        int b = 10;
        System.out.println(Integer.hashCode(a));
        System.out.println(Integer.hashCode(b));

    }
}
