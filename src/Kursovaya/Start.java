package Kursovaya;

import java.util.Random;

public class Start {
    private static int counterEmployee = 1;
    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Matvei", "Kremen", "Antonovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[1] = new Employee("Petr", "Petrov", "Olegovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[2] = new Employee("Evgenii", "Boev", "Romanovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[3] = new Employee("Semen", "Kustov", "Vladimirovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[4] = new Employee("Anton", "Pticin", "Aleksandrovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[5] = new Employee("Vladimir", "Popov", "Petrovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[6] = new Employee("Roman", "Isaev", "Matveevich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[7] = new Employee("Oleg", "Kamenev", "Semenovich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[8] = new Employee("Aleksandr", "Osadov", "Evgenevich", generateRandomId(), generateRandomSalary());
        EMPLOYEES[9] = new Employee("Ivan", "Ivanov", "Ivanovich", generateRandomId(), generateRandomSalary());
        printFullInfo();
        System.out.println("Сумма ЗП всех сотрудников - " + totalSalaries());
        System.out.println("Сотрудник с максимальной ЗП - " + findEmployeeWithMaxSalary());
        System.out.println("Сотрудник с минимальной ЗП - " + findEmployeeWithMinSalary());
        System.out.println("Средняя ЗП - " + findAverageSalaries());
        printFullNameInfo();
    }

    private static int generateRandomSalary() {
        Random random = new Random();
        return random.nextInt(50001) + 50000;
    }
    private static int generateRandomId() {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }


    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }
    private static double findAverageSalaries() {
        int sum = totalSalaries();
        return totalSalaries() / (double) EMPLOYEES.length;
    }

    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println("ФИО сотрудника " +
                    counterEmployee++ + " - " +
                    employee.getFirstName() + " " +
                    employee.getLastname() + " " +
                    employee.getPatronymic()
            );
        }
    }

}
