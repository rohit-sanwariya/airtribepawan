
public class Car {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //attributes
    private  String color;
    private String model;
    public Car(String model,String color){
        this.color = color;
        this.model = model;
    }
    public Car(){

    }
    void start(){
        System.out.println("car is starting");
    }
    void stop(){
        System.out.println("car is stoping");
    }

}
