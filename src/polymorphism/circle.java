package polymorphism;

public class circle extends shape {
    @Override
    void draw() {
        System.out.println("circle drawing...");
    }


    void personal() {
        System.out.println("personal method of circle");
    }
}

