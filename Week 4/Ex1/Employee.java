package Ex1;

abstract class Employee{

	protected int eid, age;
    protected String name;
    protected double baseSalary;

    Employee(String name, int age, int eid){
        this.name = name;
        this.age = age;
        this.eid = eid;
    }

    public void orientation(){

    }

    public void printInfo(){
        System.out.print("Name of the employee:" + this.name + "is " + this.age + "years old. His employee id is: " + this.eid + ".");

    }

    public abstract double calculateSalary();
}