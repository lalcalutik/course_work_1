public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Lebedev", "Igor", "Anatolievich", 1, 60_000);
        employees[1] = new Employee("Pankov", "Mark", "Dmitrievich", 2, 170_000);
        employees[2] = new Employee("Safonov", "Denis", "Vitalievich", 3, 70_000);
        employees[3] = new Employee("Belimov", "Andrei", "Andreevich", 4, 80_000);
        employees[4] = new Employee("Popov", "Daniil", "Valerievich", 5, 90_000);


        System.out.println("Сумма затрат на зарплаты в месяц = " + countSalarySumPerMonth());
        System.out.println("\n");
        System.out.println("Сотрудник с минимальной заработной платой" + "\n" + findEmployeeWithMinSalary());
        System.out.println("\n");
        System.out.println("Сотрудник с максимальной заработной платой:" + "\n" + findEmployeeWithMaxSalary());
        System.out.println("\n");
        System.out.println("Среднее значение зарплаты = " + countAverageSalary());
        System.out.println("\n");
        System.out.println("_______________");
        System.out.println("Список сотрудников: ");
        printNameBook(createFullNameOfEmployees());
        System.out.println("_______________");

    }

    public static int countSalarySumPerMonth () {
        int salarySumPerMonth = 0;
        for (int i = 0; ((i < employees.length) && employees[i] !=null) ; i++) {
            salarySumPerMonth = salarySumPerMonth + employees[i].getSalary();
        }
        return salarySumPerMonth;
    }

    public static Employee findEmployeeWithMinSalary(){
        int employeeWithMinSalary = employees[0].getSalary();
        int min = 0;
        for (int i = 0; ((i <= employees.length - 1) && employees[i] != null); i++) {
          if (employees[i].getSalary() < employeeWithMinSalary) {
              employeeWithMinSalary = employees[i].getSalary();
              min = i;
          }
        }
        return employees[min];
    }

    public static Employee findEmployeeWithMaxSalary(){
        int employeeWithMaxSalary = employees[0].getSalary();
        int max = 0;
        for (int i = 0; ((i <= employees.length - 1) && employees[i] != null); i++) {
            if (employees[i].getSalary() > employeeWithMaxSalary) {
                employeeWithMaxSalary = employees[i].getSalary();
                max = i;
            }
        }
        return employees[max];
    }

    public static int countAverageSalary() {
        return  countSalarySumPerMonth() / Employee.count;
    }

    public static String[] createFullNameOfEmployees() {
        String[] fullNameOfEmployees = new String[Employee.count];
        for (int i = 0; ((i <= employees.length - 1) && employees[i] != null ); i++){

            fullNameOfEmployees[i] = employees[i].getSurname() + " " + employees[i].getName() + " "
                    + " " + employees[i].getMiddleName();

        }
        return fullNameOfEmployees;
    }

    public static void printNameBook(String[] arr) {


        for (int i = 0; i <= arr.length -1 && arr[i] != null ; i++) {
            System.out.println(arr[i]);
            
        }
    }


}