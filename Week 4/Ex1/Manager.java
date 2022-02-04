package Ex1;

public class Manager extends Employee{

    private int handlingProjects;

    Manager(String name, int age, int eid, int handlingProjects) {
        super(name, age, eid);
        this.handlingProjects = handlingProjects;
        this.baseSalary = 5000;
    }

    public void printInfo(){
        System.out.println("Name of the employee:" + this.name + " is " + this.age + "years old. His employee id is: " +
        this.eid + ". " + "Handling: "+ this.handlingProjects + ". Salary: " + calculateSalary());

    }

    public double calculateSalary(){
        return baseSalary + (handlingProjects * 0.75);
        
    }
    
}
