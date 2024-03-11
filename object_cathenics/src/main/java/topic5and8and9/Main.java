package topic5and8and9;

public class Main {
    /**
     * @topic_five This example show the behavior for topic five that is "One dot for line",
        in other words, this rule talk about access of some information or method.
        Thus cant have more than one dot per line.
        (only exception is methods chaning pattern)

     * @topic_eight This example show the behavior for topic five that is "No classes with more than two instance variable",
        in other words, don't use coupling of more than two class. When you to enter the file "Employee" you will see that
        i merged the attributes name and age in one class that is "BasicData", because cant to use more than 2 attributes per class.
        Then, i divide the attributes of employee in BasicData and Salary, and placed name and age in BasicData class.

     * @topic_nine This example show the behavior for topic five that is "no getters/setters/properties",
        in other words, you cant use getters and setters in other files for manipulate the information.
        So, you might manipulate the values of attributes only within the class.
        Example: I should make just create one method that would have employee.getSalary() for have the salary
        and to compare with 2000 for finally have the result expected.
        But, this example is wrong because any manipulation of data, whether compare,
        add, update, etc... must be done in Salary class
     */

    public static void main(String[] args) {
        Employee employee = new Employee("Pedro",18,15800);
        System.out.println(employee.checkSalary());
    }

    /**
     * explain wrong mode of @topic_five you will perceive that can make only some like this:
     * employee.salary.checkSalary()
     * But, the rule of object calisthenics is just one dot per line
     */

}
