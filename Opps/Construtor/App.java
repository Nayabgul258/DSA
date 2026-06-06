public class App {
    public static void main(String[] args) throws Exception{
        OopsConcept A = new OopsConcept(1, 22, 1, "ram", "riya ");// A is object of class OOpsConcept
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.roll_no);
        System.out.println(A.age);
        System.out.println(A.getName());

         A.sleep();
        //A.gfCalling();
    }
}
