package day09.quiz;

//스마트폰은 추상적이기 때문에 abstract
public abstract class SmartPhone implements Camera, PhoneCall {

    private String model;

    public SmartPhone(String model) {
    }

    public abstract String information();
    public abstract String charge();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
