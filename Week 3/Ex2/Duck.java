public class Duck extends Animal{
    Duck(){
        System.out.println("In duck constructor");
    }

    Duck(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In duck constructor");
    }

    public void greetings(){
        System.out.print("Quack");
    }

    public void printInfo(){
        System.out.print(this.name + " is " + this.age + " years old and is of " + this.color +" color ");
    }
}
