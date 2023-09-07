package kurs1;

public class Main {
    static Employee[] arrayEmployee = new Employee[10];

    public static void printEmployee() {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println(arrayEmployee[i]);
        }
    }

    public static void minSalary() {
        Employee min = arrayEmployee[0];
        for (int i = 1; i < arrayEmployee.length; i++) {
            if (min.getSalary() > arrayEmployee[i].getSalary()) {
                min = arrayEmployee[i];
            }
        }
        System.out.println("Cотрудник с минимальной зарплатой: " + min);
    }

    public static void maxSalary() {
        Employee max = arrayEmployee[0];
        for (int i = 1; i < arrayEmployee.length; i++) {
            if (max.getSalary() < arrayEmployee[i].getSalary()) {
                max = arrayEmployee[i];
            }
        }
        System.out.println("Cотрудник с максимальной зарплатой: " + max);
    }

    public static void printListFIO() {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println(arrayEmployee[i].getNameFIO());
        }
    }

    public static double avgSalary() {
        int len = arrayEmployee.length;
        double avg = summSalary() * 1.0 / len;
        return avg;
    }

    public static void main(String[] args) {
        arrayEmployee[0] = new Employee("Син Алексей Андреевич", "1", 186_429);
        arrayEmployee[1] = new Employee("Мельников Алексей Семенович", "2", 96_771);
        arrayEmployee[2] = new Employee("Семенов Семен Иванович", "1", 86_429);
        arrayEmployee[3] = new Employee("Иванов Алексей Андреевич", "3", 297_419);
        arrayEmployee[4] = new Employee("Иванов Семен Андреевич", "4", 156_126);
        arrayEmployee[5] = new Employee("Иванова Ирина Антоновна", "4", 56_126);
        arrayEmployee[6] = new Employee("Иванов Антон Андреевич", "3", 62_691);
        arrayEmployee[7] = new Employee("Антонов Семен Антонович", "2", 96_726);
        arrayEmployee[8] = new Employee("Иванова Светлана Петровна", "1", 98_286);
        arrayEmployee[9] = new Employee("Ива Алефтина Андреевна", "5", 215_926);
        printEmployee();
        System.out.println("Средняя зарплата " + avgSalary());
        System.out.println("Cуммa затрат на зарплаты в месяц " + summSalary());
        minSalary();
        maxSalary();
        printListFIO();
    }

    public static int summSalary() {
        int summ = 0;
        for (int i = 0; i < arrayEmployee.length; i++) {
            summ = summ + arrayEmployee[i].getSalary();
        }
        return summ;
    }
}