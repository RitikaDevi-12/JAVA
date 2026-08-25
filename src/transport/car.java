package transport;

public class car extends  vehicle {

    public int noOfDoors;
    public String transmissionType;

    car(String name, String model, int noOfTyres, int noOfDoors, String transmissiontype){
        super(name,model,noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;

    }

    public void startAc(){
        System.out.println("Ac started of " + name);
    }


}