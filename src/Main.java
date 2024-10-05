public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] payouts = {34_000, 39_000, 57_000, 45_000, 31_000,};
        int amount = 0;
        for (int i = 0; i < 5; i++) {
            amount = amount + payouts[i];
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей");

        //задача 2
        System.out.println("Задача 2");
        int maxWastes = 0;
        int minWastes = 100_000;
        for (int payout : payouts) {
            if (maxWastes < payout) {
                maxWastes = payout;
            } else if (minWastes > payout) {
                minWastes = payout;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWastes + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxWastes + " рублей");

        //задание 3
        System.out.println("Задание 3");
        int average = 0;
        average = amount / payouts.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int len = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[len - i]);
            
        }

    }
}