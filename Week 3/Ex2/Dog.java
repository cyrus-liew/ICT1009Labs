public class Dog extends Animal{
    Dog(){
        System.out.println("In dog constructor");
    }

    Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In dog constructor");
    }

    public void greetings(){
        System.out.print("Woof woof");
    }

    public void printInfo(){
        System.out.print(this.name + " is " + this.age + " years old and is of " + this.color +" color ");
    }

    
}
