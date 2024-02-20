
package This;

public class Employee extends Person{

    public Employee(String dian, int par, float par1) {
    }
    
    float salary = 4000f;
    String name = "Dian";
    int age = 23;
      
    public void showInfo(){
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
}
