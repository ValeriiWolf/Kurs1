package kurs1;
public class Main {
    public static void printEmployee(Employee[] arrayEmployee){
        for (int i=0;i<arrayEmployee.length;i++){
            System.out.println(arrayEmployee[i]);
        }
    }
    public static void minSalary(Employee[] arrayEmployee){
        int min=arrayEmployee[0].getSalary();
        int counter=0;
        for (int i=0;i<arrayEmployee.length;i++){
            if(min>arrayEmployee[i].getSalary()){
                min=arrayEmployee[i].getSalary();
                counter=i;
            }
        }
        System.out.println("Cотрудник с минимальной зарплатой: "+arrayEmployee[counter]);
    }
    public static void maxSalary(Employee[] arrayEmployee){
        int max=0;
        int counter=0;
        for (int i=0;i<arrayEmployee.length;i++){
            if(max<arrayEmployee[i].getSalary()){
                max=arrayEmployee[i].getSalary();
                counter=i;
            }
        }
        System.out.println("Cотрудник с максимальной зарплатой: "+arrayEmployee[counter]);
    }
    public static void printListFIO(Employee[] arrayEmployee){
        for(int i=0;i<arrayEmployee.length;i++){
            System.out.println(arrayEmployee[i].getNameFIO());
        }
    }
    public static double avgSalary(Employee[] arrayEmployee){
        int len=arrayEmployee.length;
        double avg=summSalary(arrayEmployee)*1.0/len;
        return avg;
    }
    public static void main(String[] args) {
        Employee[] arrayEmployee=new Employee[10];
        arrayEmployee[0]=new Employee("Син Алексей Андреевич","1",186_429);
        arrayEmployee[1]=new Employee("Мельников Алексей Семенович","2",96_771);
        arrayEmployee[2]=new Employee("Семенов Семен Иванович","1",86_429);
        arrayEmployee[3]=new Employee("Иванов Алексей Андреевич","3",297_419);
        arrayEmployee[4]=new Employee("Иванов Семен Андреевич","4",156_126);
        arrayEmployee[5]=new Employee("Иванова Ирина Антоновна","4",56_126);
        arrayEmployee[6]=new Employee("Иванов Антон Андреевич","3",62_691);
        arrayEmployee[7]=new Employee("Антонов Семен Антонович","2",96_726);
        arrayEmployee[8]=new Employee("Иванова Светлана Петровна","1",98_286);
        arrayEmployee[9]=new Employee("Ива Алефтина Андреевна","5",215_926);
        printEmployee(arrayEmployee);
        System.out.println("Средняя зарплата "+avgSalary(arrayEmployee));
        System.out.println("Cуммa затрат на зарплаты в месяц "+summSalary(arrayEmployee));
        minSalary(arrayEmployee);
        maxSalary(arrayEmployee);
        printListFIO(arrayEmployee);
    }
    public static int summSalary(Employee[] arrayEmployee){
        int summ=0;
        for (int i=0;i<arrayEmployee.length;i++){
           summ= summ+arrayEmployee[i].getSalary();
        }
        return summ;
    }
}