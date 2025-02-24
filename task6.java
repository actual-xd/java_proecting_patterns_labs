public class task6 {
    public static class Employee {
        private String name;
        private String job_title;
        private double MonthSalary;

        public Employee(String name, String job_title, double MounthSalary) {
            this.name = name;
            this.job_title = job_title;
            this.MonthSalary = MounthSalary;
        }

        public void updateSalary(double newSalary) {
            this.MonthSalary = newSalary;
        }

        public double calculateYearSalary() {
            return this.MonthSalary * 12;
        }

    }

    public static void main(String[] args) {
        Employee employee_1 = new Employee("Bob", "Worker", 150000);
    }
}
