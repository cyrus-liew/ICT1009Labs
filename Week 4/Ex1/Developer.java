package Ex1;

public class Developer extends Employee{

    private int testingCodes, developingCodes;

    Developer(String name, int age, int eid, int testingCodes, int developingCodes) {
        super(name, age, eid);
        this.testingCodes = testingCodes;
        this.developingCodes = developingCodes;
        this.baseSalary = 3500;
    }

    public void printInfo(){
        System.out.println("Name of the employee:" + this.name + " is " + this.age + "years old. His employee id is: " +
        this.eid + ". " + "Testing codes: "+ this.testingCodes + "Developing codes: " + this.developingCodes
        + ". Salary: " + calculateSalary());

    }

    public double calculateSalary(){
        return baseSalary + (testingCodes * 0.25) + (developingCodes * 0.5);
        
    }
}
