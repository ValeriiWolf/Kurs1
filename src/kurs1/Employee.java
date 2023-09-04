package kurs1;

public class Employee {
    private String nameFIO;
    private String nameDepartment;
    private int salary;
    private int nameID;
    private static int counter=0;

    public Employee(String nameFIO, String nameDepartment, int salary) {
        this.nameFIO = nameFIO;
        this.nameDepartment = nameDepartment;
        this.salary = salary;
        this.nameID = counter++;

    }

    public String getNameFIO() {
        return nameFIO;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public int getSalary() {
        return salary;
    }

    public int getNameID() {
        return nameID;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return "ФИО сотрудника "+this.nameFIO+" Название отдела "+this.nameDepartment+" Зарплата "+this.salary+" ID "+this.nameID;
    }
}
