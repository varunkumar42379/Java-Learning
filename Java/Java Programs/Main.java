abstract class Animal {

    abstract void sound();  // Abstract method

    void eat() {            // Concrete method
        System.out.println("Animals eat food");
    }

}

class Dog extends Animal{


    @Override
    void sound() {
        System.out.println("Sound....");
    }
}

public class Main {
    public static void main(String[] args) {

//        Dog d=new Dog();
//        d.sound();

        Animal a = new Dog(); // ✅ Allowed — object of subclass
        a.sound();            // Calls Dog's implementation
        a.eat();              // Calls Animal's concrete method
    }
}