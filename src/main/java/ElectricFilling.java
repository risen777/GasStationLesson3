/**
 * Created by Sergey
 */
public class ElectricFilling extends GasStation implements  CheckBattery {

private String name;
private String car;


    public ElectricFilling(String name,String car) {
        this.name = name;
        this.car=car;
    }

    void fillUp() {
        System.out.println("Заряжается авто на заправке: "+car);

    }


    @Override
    public void batteryOn() {
        System.out.println("Зарядка доступна для: " + name);
    }

    @Override
    public void batteryOff() {
        System.out.println("Зарядка недоступна для: " + name);
    }
}
