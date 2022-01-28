public class Pig extends Animal{
    Pig(){
        System.out.println("In pig constructor");
    }

    Pig(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In pig constructor");
    }

    public void greetings(){
        System.out.print("Oink");
    }

    public void printInfo(){
        System.out.print(this.name + " is " + this.age + " years old and is of " + this.color +" color ");
    }
}
