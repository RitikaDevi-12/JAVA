package transport;

public class Motorcycle extends vehicle{
     public String handleBarStyle;
     public String suspension;

    Motorcycle(String name ,String model,int noOfTyres,String handleBar,String suspension){
        super(name,model,noOfTyres);
        this.name = name;
        this.model =  model;
        this.noOfTyres = noOfTyres;
    }
      public void wheelie(){
          System.out.println(" Motor cycle is doing wheelie!" +  name);

    }
}
