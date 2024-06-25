public class Employee {
    int id;
    String name;
    int salary;
    
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    void show() {
        System.out.println(id + " " + name + " " + salary);
    }
    
    public static void main(String args[]) {
        Employee emp1 = new Employee(1, "Govind", 10000);
        emp1.show();
    }
}
