public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int allSumma = 0;
        for (int i = 0; i < arr.length; i++) {
            allSumma = allSumma + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + allSumma + " рублей.");
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int maxSumma = -1;
        int minSumma = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumma) {
                maxSumma = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumma) {
                minSumma = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей. Максимальная сумма трат за день составила " + maxSumma + " рублей.");
    }
    public static void task3() {
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        int averageValue = 0;
        float allSumma = 0;
        for (int i = 0; i < arr.length; i++) {
           allSumma = allSumma + arr[i];
        }
        allSumma = allSumma / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + allSumma + " рублей.");
    }
    public static void task4() {
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i = i - 1) {
            System.out.print(reverseFullName[i]);
        }
    }
}
