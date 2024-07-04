//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Test Model","red");
        car.start();
        car.stop();
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}