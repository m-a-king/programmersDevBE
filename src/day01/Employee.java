package day01;

public class Employee {
    String name;
    double salary;
    int yearsOfWork;
    double hoursWork;
    boolean hasBonus;

    Employee(String name, double salary, int yearsOfWork, double hoursWork, boolean hasBonus) {
        this.name = name;
        this.salary = salary;
        this.yearsOfWork = yearsOfWork;
        this.hoursWork = hoursWork;
        this.hasBonus = hasBonus;
    }

    // 급여를 계산하는 메서드
    public double calculateSalary() {
        double overWorkPay = 0;
        if (hoursWork > 160) {
            overWorkPay = (hoursWork - 160) * 25; // Assuming $25 per hour for overtime
        }
        double bonus = 0;
        if (yearsOfWork > 5) {
            bonus = salary * 0.05;
        } else if (yearsOfWork > 2) {
            bonus = salary * 0.02;
        }
        if (hasBonus) {
            bonus += 500;
        }
        return salary + overWorkPay + bonus;
    }

    public class SalaryCalc {
        Employee[] emps;

        public SalaryCalc() {
            emps = new Employee[5];
            emps[0] = new Employee("홍길동", 3000, 3, 160, true);
            emps[1] = new Employee("김길동", 3500, 5, 170, true);
            emps[2] = new Employee("이길동", 3200, 2, 150, false);
            emps[3] = new Employee("박길동", 4000, 6, 180, true);
            emps[4] = new Employee("최길동", 3800, 4, 165, false);
        }

        public Employee[] getEmployees() {
            return emps;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("사용하지 않음", 0, 0, 0, false);
        SalaryCalc salaryCalc = emp.new SalaryCalc();
        Employee[] emps = salaryCalc.getEmployees();

        for (Employee e : emps) {
            System.out.println(e.name + "의 급여: " + e.calculateSalary());
        }
    }
}