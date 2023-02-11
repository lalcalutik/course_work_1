public class Employee {
    private String name;
    private String surname;
    private String middleName;
    private int department;
    private int salary;

    static int count = 1;

    private int id;


    public Employee(String surname, String name, String middleName, int department, int salary) {

        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment() {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "_________" + "\n" + "Отдел: " + this.department + "\n" +
                "Фамилия: " + this.surname + "\n" + "Имя: " + this.name
                + "\n" + "Отчество: " + this.middleName + "\n" + "Заработная плата: "
                + this.salary + "\n" + "id: " + this.id + "\n" + "_________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return this.id == employee.getId()
                && this.surname.equals(employee.getSurname())
                && this.name.equals(employee.getName())
                && this.middleName.equals(employee.getMiddleName())
                && this.department == employee.getDepartment()
                && this.salary == employee.getSalary();

    }

        @Override

        public int hashCode() {

        String s = this.surname + this.name + this.middleName + this.id + "1231asdasd"; //добавил "соль" для уменьшения шансов колизии
        return s.hashCode();
        }

}


