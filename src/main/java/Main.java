import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Sergey
 */
public class Main {
    public static void main(String[] args) {


        ElectricFilling[] electricFillings = new ElectricFilling[]{
                new ElectricFilling("Зарядка для Теслы", "Tesla"), new ElectricFilling("Зарядка для Мазды", "Свободна")};

        for (ElectricFilling electricFilling : electricFillings) {
            electricFilling.batteryOn();
            electricFilling.fillUp();
        }


        System.out.println("Вы готовы выключить электрическую заправку?");
        Scanner scanner = new Scanner(System.in);
        String cache = scanner.nextLine();


        if (Objects.equals(cache, "Y")) {
            System.out.println("Заправка будет недоступна");
            for (ElectricFilling electricFilling : electricFillings) {
                electricFilling.batteryOff();
            }


        } else if (Objects.equals(cache, "N")) {
            System.out.println("Заправка будет доступна");

        } else {
            System.out.println("Введите Y или N");
        }

    }
}