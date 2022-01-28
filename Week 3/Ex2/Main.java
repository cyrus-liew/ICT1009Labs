import java.util.ArrayList;

class Animal {
    String name, color;
    int age;

    Animal(){
        System.out.println("In animal constructor");
    }

    Animal(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In animal constructor");
    }

    public void greetings(){
        System.out.print("Animal noise");
    }

    public void printInfo(){
        System.out.print(this.name + " is " + this.age + " years old and is of " + this.color +" color ");
    }

    public void printClassName(){
        System.out.print(this.getClass().getSimpleName() + " ");
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Dog("Milo", 2, "Brown"));
        animals.add(new Cat("Whiskey", 3, "Brown"));
        animals.add(new Duck("Do", 1, "White"));
        animals.add(new Pig("Po", 10, "Pink"));

        for(Animal anim: animals){
            anim.printClassName();
            anim.printInfo();
            anim.greetings();
            System.out.print("\n");
        }

    }
  }