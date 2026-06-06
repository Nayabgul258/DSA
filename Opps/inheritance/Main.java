//inheritance concept  

 class Vehicle {
    public String name;
    public String model;
    public String color;
    public int NoOfTiers;

    Vehicle(){
        this.name="";
        this.model="";
        this.color="";
        this.NoOfTiers =-1;
    }

    Vehicle(String name, String model, String color, int NoOfTiers) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.NoOfTiers = NoOfTiers;
    }

    void startEngine() {
        System.out.println(" Engine Start of "+name+ " " +  model);
    }

}



class car extends Vehicle {
    
    public int noOfDoors;

     car(String name , String model ,String color, int NoOfTiers, int noOfDoors){
        super(name ,model,color,NoOfTiers);
        this.noOfDoors = noOfDoors;
     }
  

}


class bike extends car {
      public int noofbike;

      bike(String name,String model , String color, int NoOfTiers ,int noOfDoors,int noofbike ){
            super(name ,model,color, NoOfTiers,noOfDoors);
            this.noofbike = noofbike;

      }
       
}

public class Main {
     public static void main(String[] args) {
        bike  c = new bike ("BMW" ,"SUV", "red",4,2 , 2);
        c.startEngine();
        System.out.println(c.noofbike);
    }
}



