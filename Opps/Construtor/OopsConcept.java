public class OopsConcept {
    public int id;
    public int age;
    public int roll_no;
    public String name;
    private String gf;

    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping ");
    }

    private void gfCalling() {
        System.out.println(name + " calling with gf ");
    }

    public String getName(){
        return this.gf;
    }

    // default constructor
    public OopsConcept() {
        System.out.println("default constructor called ");
    }

    // Parametrized constructor
    public OopsConcept(int id, int age, int roll_no, String name, String gf) {
        this.id = id;
        this.age = age;
        this.roll_no = roll_no;
        this.name = name;
        this.gf = gf;

    }

    // copy constructor
    public OopsConcept(OopsConcept obj) {
        this.id = obj.id;
        this.age = obj.age;
        this.roll_no = obj.roll_no;
        this.name = obj.name;
    }


    public static void main(String[] args) {
        OopsConcept A = new OopsConcept(1, 22, 1, "ram", "riya ");// A is object of class OOpsConcept
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.roll_no);
        System.out.println(A.age);
        System.out.println(A.gf);

        A.sleep();
        A.gfCalling();

        // OopsConcept C = new OopsConcept(A);
        // System.out.println(C.id + " " + C.age + " " + C.roll_no + " " + C.name);

    }

}
