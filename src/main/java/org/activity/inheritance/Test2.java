package org.activity.inheritance;

// Multiple inheritance
public class Test2 {
    public static void main(String[] args) {
        BaseParent baseParent = new Child("India","Odisha","Kendrapara");
        // instance of operator compare an instanceVariable with Class/Subclass/interface
        System.out.println(baseParent instanceof BaseParent);
        System.out.println(baseParent instanceof Parent);
        System.out.println(baseParent instanceof Child);

        System.out.println(baseParent.getCountryName());
        baseParent = new Parent("India","Odisha");
        System.out.println(baseParent instanceof BaseParent);
        System.out.println(baseParent instanceof Parent);
        System.out.println(baseParent instanceof Child);

        Child child = new Child("India","Odisha","Kendrapara");
        System.out.println(child.getCountryName());
        System.out.println(child.getStateName());
        System.out.println(child.getDistrictName());

    }

    public static class BaseParent{
        public String countryName;

        public BaseParent(String countryName) {
            this.countryName = countryName;
        }

        public String getCountryName() {
            return countryName;
        }
    }

    public static class Parent extends BaseParent{
        public String stateName;

        public Parent(String countryName, String stateName) {
            super(countryName);
            this.stateName = stateName;
        }

        public String getStateName() {
            return stateName;
        }
    }

    public static class Child extends Parent{
        public String districtName;

        public Child(String countryName, String stateName, String districtName) {
            super(countryName, stateName);
            this.districtName = districtName;
        }

        public String getDistrictName() {
            return districtName;
        }
    }
}
