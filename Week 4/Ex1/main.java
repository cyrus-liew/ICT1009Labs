package Ex1;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
      Employee empRef;

      ArrayList<Employee> employees = new ArrayList<Employee>();

      employees.add(new Manager("Jasmine", 45, 123, 5));
      employees.add(new Developer("Aldo", 30, 345, 5, 2));
      employees.add(new Designer("Chris", 25, 780, 4));

      for (Employee e: employees){
        e.printInfo();
      }
  
    }
  }