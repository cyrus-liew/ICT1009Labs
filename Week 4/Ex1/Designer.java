package Ex1;

public class Designer extends Employee{

    private int noOfDesigns;

    Designer(String name, int age, int eid, int noOfDesigns) {
        super(name, age, eid);
        this.noOfDesigns = noOfDesigns;
        this.baseSalary = 2500;
    }

    public void printInfo(){
        System.out.println("Name of the employee:" + this.name + " is " + this.age + "years old. His employee id is: " +
        this.eid + ". " + "No of designs done: "+ this.noOfDesigns + ". Salary: " + calculateSalary());

    }

    public double calculateSalary(){
        return baseSalary + (noOfDesigns * 0.50);
        
    }
}
