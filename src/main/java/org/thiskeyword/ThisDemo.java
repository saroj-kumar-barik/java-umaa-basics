package org.thiskeyword;

public class ThisDemo {
    private int firstNumber;
    private int lastNumber;
    private int middleNumber;
    private String personName;

    public ThisDemo(int firstNumber, int lastNumber, String personName) {
        this(personName);
//        this(personName); not possible this() must be the first statement inside constructor
        this.firstNumber = firstNumber;
        this.lastNumber = lastNumber;
        getCompleteNumber(this);
    }

    public ThisDemo(String personName) {
        this.personName = personName;
    }

    public void setMiddleNumber(int middleNumber) {
        if (middleNumber > 0)
            this.middleNumber = middleNumber;
        else
            this.middleNumber = 123456;
    }

    public void getCompleteNumber(ThisDemo thisDemo) {
        getCompleteNumber();
    }

    public String getCompleteNumber() {
        String completeNumber =
                "The name of the person : " + this.personName + " Having mobile number : " + this.firstNumber + "-" +
                        this.middleNumber + "-" + this.lastNumber;
        return completeNumber;
    }
}
