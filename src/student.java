public class student {
    // Attributes
    public int id;
    public String name;
    public int age;
    public int nos;

    // Default constructor
    public student(){
        System.out.println("Default  constructor");
    }

    //parameterised constructor
    public student(int id,String name,int age,int nos){
        System.out.println("parameterised constructor");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;

    }
    // copy cotr
    public student(student sourcej){
        System.out.println("copy condtructor");
        this.id = sourcej.id;
        this.name = sourcej.name;
        this.age = sourcej.age;
        this.nos = sourcej.nos;
    }



    // Methods/ bahaviours
    public void study() {
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " bunking");
    }



}