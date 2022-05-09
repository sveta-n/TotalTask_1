import java.util.Scanner;

public class TotalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущий курс доллара: ");
        float curExch = scanner.nextFloat();
        System.out.println("Кол-во рублей: ");
        float amount = scanner.nextFloat();

        float total = amount / curExch;
        System.out.println(String.format("%.2f", total));
    }
}