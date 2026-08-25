package transport;

public class vehicle {

     public String name;

     public String model;

     public int noOfTyres;

     // default constructor
       vehicle(){
           this.name = name;
           this.model = model;;
           this.noOfTyres = noOfTyres;


       }

     vehicle(String name, String model , int noOfTyres){
         this.name = name;
         this.model = model;
         this.noOfTyres = noOfTyres;
     }
      void startEngine(){
          System.out.println("Engine is starting of : " + name + ":" + model);
      }

      void stopEngine(){
          System.out.println("Engine is stopping of ;" + name  +":" +  model);
      }
}
