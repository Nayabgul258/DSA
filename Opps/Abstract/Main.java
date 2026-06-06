package Abstract;


//using abstact 
// abstract class Bird{

//    abstract void sound();
//     abstract void eat();
// }

// class Crow extends Bird{
//       void sound(){
//         System.out.println("crow  sound");
//       }

//       void eat(){
//         System.out.println("crow eat");
//       }
//     }

// class piggen extends Bird{
//       void sound(){
//         System.out.println("piggen  sound");
//       }

//       void eat(){
//         System.out.println("piggen eat");
//       }
//     }


// interface 
 interface Bird {
   void sound();
   void eat();
    
 }

class Crow implements Bird{
   public void sound(){
        System.out.println("crow  sound");
      }

    public  void eat(){
        System.out.println("crow eat");
      }
    }

class piggen implements Bird{
   public   void sound(){
        System.out.println("piggen  sound");
      }

     public void eat(){
        System.out.println("piggen eat");
      }
    }




    public class Main {


        public static void doBird(Bird b){
            b.eat();
            b.sound();
        }
       public static void main(String[] args) {
        doBird(new Crow());
        doBird(new piggen());
        //  Bird b = new Crow();
        //  b.sound();
        //  b.eat();
        //  b= new piggen();
        //  b.eat();;
        //  b.sound();

    
       } 
}
