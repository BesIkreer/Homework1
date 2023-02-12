package Kursovaya;

import java.util.stream.IntStream;

public class Employee {
    private static int counterId = 1; //static позволяет перезаписывать следующее значение следующему сотруднику
    private final String firstName;
    private final String lastname;
    private final String patronymic;
    private int department;
    private int salary;
    private final int id;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String lastname, String patronymic, int department, int salary) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = counterId++; //Начинается с 1 и увеличивается с каждым следующим сотрудником (++counterId то вначале прибавит единицу к значению)
    }

    @Override
    public String toString() {
       /* return String.format(
                "Имя - %s, Фамилия - %s, Отчество - %s, Отдел - %d, ЗП - %d, id - %d",
                firstName,
                lastname,
                patronymic,
                department,
                salary,
                salary,
                id
        ); */
        return "Сотрудник: " +
                "Имя - " + firstName +
                ", Фамилия - " + lastname +
                ", Отчество - " + patronymic +
                ", Отдел - " + department +
                ", ЗП - " + salary +
                ", id - " + id;
    }

}