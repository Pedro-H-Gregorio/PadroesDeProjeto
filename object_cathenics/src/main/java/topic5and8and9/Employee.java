package topic5and8and9;

public class Employee {

    BasicData basicdata;
    Salary salary;
    public Employee(String name, int age, int salary) {
        this.basicdata = new BasicData(name,age);
        this.salary = new Salary(salary);
    }

    public String checkSalary(){
        return salary.checkSalary();
    }
}
