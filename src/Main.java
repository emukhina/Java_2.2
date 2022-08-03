public class Main {
    public static void main(String[] args) {

        int score = 100;
        int adding = 1100;
        int sumScore = score + adding;
        boolean condition = sumScore >= 1000;

        int bonus;
        int balance;

        if (condition) {
            bonus = adding / 100;
            balance = sumScore + bonus;
            System.out.println("Начислен бонус: " + bonus);
            System.out.println("Итого на счете: " + balance);
        } else {
            System.out.println("Бонуса нет");
            System.out.println("Итого на счете: " + sumScore);
        }

        }

    }



