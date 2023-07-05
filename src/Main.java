public class Main {
    public static void main(String[] args) {
        Employee[] storage = new Employee[10];

        Employee ivan = new Employee("Иванов", "Иван", "Иванович", 1, 11_000);
        Employee petr = new Employee("Петров", "Петр", "Петрович", 2, 20_000);
        Employee anton = new Employee("Aнтонов", "Антон", "Антонович", 3, 30_000);
        Employee alexandr = new Employee("Александров", "Алексанндр", "Александрович", 4, 40_000);
        Employee medvedev = new Employee("Медведев", "Михаил", "Михаилович", 5, 50_000);
        Employee kozlov = new Employee("Козлов", "Козел", "Козлович", 1, 60_000);
        Employee orlov = new Employee("Орлов", "Орел", "Орлович", 2, 70_000);
        Employee batmen = new Employee("Бетменов", "Бетмен", "Бетменович", 3, 80_000);
        Employee nagiev = new Employee("Нагиев", "Дмитрий", "Владимирович", 4, 90_000);
        Employee karimov = new Employee("Каримов", "Ринат", "Римович", 5, 100_000);

        storage[0] = ivan;
        storage[1] = petr;
        storage[2] = anton;
        storage[3] = alexandr;
        storage[4] = medvedev;
        storage[5] = kozlov;
        storage[6] = orlov;
        storage[7] = batmen;
        storage[8] = nagiev;
        storage[9] = karimov;


        printListEmploee(storage);

        printSalaryCosts(storage);

        printMaxSalary(storage);


        printMinSalary(storage);

        printAverageSalaryValue(storage);

        printFullName(storage);
    }
    private static void printListEmploee(Employee[] storage) {
        System.out.println("Список всех сотрудников : ");
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }
    }

    private static void printSalaryCosts(Employee[] storage) {
        System.out.print("Затраты на зарплату в месяц : ");
        int salaryCosts = 0;
        for (Employee i : storage){
            if (i != null) {
                salaryCosts = salaryCosts + i.getSalary();
            }
        }
        System.out.println(salaryCosts);
    }

    private static void printMaxSalary(Employee[] storage) {
        System.out.print("Максимальная зарплата : ");
        int maxSalary = 0;
        for (Employee i : storage) {
            if (i != null) {
                if (i.getSalary() > maxSalary) {
                    maxSalary = i.getSalary();
                }
            }
        }
        System.out.println(maxSalary);
    }
    private static void printMinSalary(Employee[] storage) {
        System.out.print("Минимальная зарплата : ");
        int minSalary = 500_000;
        for (Employee i : storage) {
            if (i != null) {
                if (i.getSalary() < minSalary) {
                    minSalary = i.getSalary();
                }
            }
        }
        System.out.println(minSalary);
    }
    private static void printAverageSalaryValue(Employee[] storage){
        System.out.print("Средняя зп : ");
        int averageSalaryValue = 0;
        int salaryCosts = 0;
        for (Employee i : storage) {
            if (i != null) {
                salaryCosts = salaryCosts + i.getSalary();
                averageSalaryValue = salaryCosts / storage.length;
            }
        }
        System.out.println(averageSalaryValue);
    }
    private static void printFullName(Employee[] storage){
        System.out.print("ФИО сотрудников : ");
        int id = 0;
        for (Employee i : storage) {
            if (i != null) {
                System.out.print(++id + ") " + i.getSurname() + " " + i.getName() + " " + i.getPatronymic() + ". ");
            }
        }
    }
}