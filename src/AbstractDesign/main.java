package  AbstractDesign;

interface  Bird{
    void  fly();
    void  eat();

}
class Sparrow implements Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    public void eat() {
        System.out.println("Sparrow eating");
    }
}
class Crow implements Bird{
    @Override
    public void fly(){
        System.out.println("Crow flying");
    }
    public void eat(){
        System.out.println("Crow eating");
    }
}

class  main{
    void doBirdStuff(Bird b){
        b.fly();
        b.eat();
    }

    void main(){
        Bird b = new  Sparrow();
        b.fly();
        b.eat();

        b = new Crow();
        b.fly();
        b.eat();
    }
}






// package AbstractDesign;
//
//abstract class bird{
//    abstract void fly();
//    abstract void eat();
//
//}
//
// class Sparrow extends bird {
//
//    @Override
//    void fly(){
//        System.out.println("sparrow flying");
//    }
//
//     @Override
//     void eat(){
//        System.out.println("sparrow eating in diff way");
//    }
//
// }
//
//  class crow extends bird {
//      @Override
//      void fly(){
//          System.out.println("crow flying");
//      }
//      @Override
//      void eat(){
//          System.out.println("crow eating in diff way");
//      }
//  }
//
//   public class main {
//     void doBirdStuff(bird b){
//         b.fly();
//         b.eat();
//
//       }
//       void main(){
//         doBirdStuff(new Sparrow());
//         doBirdStuff(new  crow());
//       }
//


//    void main(){
//        bird b =  new Sparrow();
//        b.eat();
//        b.fly();
//
//        b = new crow();
//        b.fly();
//        b.eat();
//
//    }

//}

