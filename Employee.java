class Employee {

    void display() {
        System.out.println("Employee Details");
        System.out.println("Name: Ramesh");
        System.out.println("ID: 101");
        System.out.println("Salary: 50000");
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.display();
    }
}