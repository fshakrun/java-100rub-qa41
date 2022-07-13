public class Main {
    public static void main(String[] args) {

        int initialBalance = 2000;
        int topUp = 1100;

        int bonuses;

        if (topUp > 1000) {
            bonuses = topUp * 1 / 100;
        } else
            bonuses = 0;

        int finalBalance = initialBalance + topUp + bonuses;

        System.out.println("Итоговый баланс равен " + finalBalance);
        System.out.println("Начислено бонусных рублей " + bonuses);

    }
}