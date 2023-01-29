public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task 1");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }

    public static void task2() {
        System.out.println("Task 2");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName.toUpperCase());

    }
    public static void task3() {
        System.out.println("Task 3");
        String firstName = "Ivёn ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich";
        String fullName = middleName + firstName + lastName;
        fullName = fullName.replace("ё", "е");
        System.out.println("Ф.И.О. сотрудника - " + fullName);
    }
}
