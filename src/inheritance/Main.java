package inheritance;

public class Main {
    public static void main(String[] args) {
        Customer1 customer3= new Customer1();
        Employee1 employe23 = new Employee1();
        customer3.id=1;
        employe23.age=23;

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.Add();
        CustomerManager customerManager = new CustomerManager();
        customerManager.List();

    }
}
