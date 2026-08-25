public class basic_oops {

     void main() {
//          student A = new student();
//          A.id = 1;
//          A.name = "Rahul";
//          A.age = 25;
//          A.nos = 5;
//
//          System.out.println(A.name);
//          System.out.println(A.id);
//          System.out.println(A.age);
//          System.out.println(A.nos);
//
//          A.bunk();
//          A.sleep();
//          A.study();

          // parametreised constructor
          student A =new student(2,"Ansh",25,5);
//          System.out.println(A.name);
//          System.out.println(A.id);
//          System.out.println(A.age);
//          System.out.println(A.nos);
//
//          A.bunk();
//          A.study();
//          A.sleep();


          // copy ctor
          student  B = new student(A);
          System.out.println(B.name);
          System.out.println(B.id);
          System.out.println(B.age);
          System.out.println(B.nos);

         B.study();
         B.bunk();


     }
}