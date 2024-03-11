package topic5and8and9;

public class Salary {
    int salary;

    public Salary(int salary){
        this.salary = salary;
    }

    public String checkSalary(){
        return this.salary > 2000 ? "É maior que 2 mill": "É menor que 2000";
    }
}
