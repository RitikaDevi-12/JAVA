package polymorphism;

public class main {
    void main(){
//        calculator c = new calculator();
//        System.out.println(c.add(2,8));
//        System.out.println(c.add(10,20,30));
//        System.out.println(c.add(100,   200,200,400));

        //  Run time polymorphism
        circle c = new circle();
        doDrawingStuff(c);

        rectangle r = new rectangle();
        doDrawingStuff(r);

        shape s = new shape();
        doDrawingStuff(s);

        // downcasting
        // circle c = new circle();
       //  doDrawingStuff(c);

//         rectangle r = new rectangle();
//         doDrawingStuff(r);

    }


    void doDrawingStuff(shape  s){
        s.draw();
      circle c =  (circle)s;
        c.personal();
   }
}
