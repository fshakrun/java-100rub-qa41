public class Main {
    public static void main(String[] args) {

        int initial_balance = 2000;
        int top_up = 1100;

        int bonuses;

            if (top_up > 1000)
            {bonuses = top_up*1/100;}
            else
                bonuses = 0;

            int final_balance = initial_balance + top_up + bonuses;

            System.out.println("Итоговый баланс равен " + final_balance);
            System.out.println("Начислено бонусных рублей "+ bonuses);

    }
}