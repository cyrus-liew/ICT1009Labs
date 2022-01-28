public class Cat extends Animal{
    Cat(){
        System.out.println("In cat constructor");
    }

    Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In cat constructor");
    }

    public void greetings(){
        System.out.print("Meow");
    }

    public void printInfo(){
        System.out.print(this.name + " is " + this.age + " years old and is of " + this.color +" color ");
    }
}
