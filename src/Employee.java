public class Employee {

    private final String name;

    private final String surname;
    private final String patronymic;
    private int department;
    private int salary;

    public int id;

    public Employee(String surname, String name, String patronymic, int department, int salary) {
        this.department = department;
        this.salary = salary;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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


    @Override
    public String toString() {
        return "Работник :" +
                " Имя - " + name + "."+
                " Фамилия - " + surname +"."+
                " Отчество - " + patronymic +"."+
                " Отдел - " + department +"."+
                " Зарплата - " + salary;
    }
}