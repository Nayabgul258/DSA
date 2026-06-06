package polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    // method overloading (argument count diff)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method overloading (argument type diff)

    double add(int a, int b, double c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        // Calculator c = new Calculator();
        // System.out.println(c.add(1, 2));
        // System.out.println( c.add(1, 02, 03));
        // System.out.println( c.add(1, 2, 03.3));

        Shape s = new Shape();
        doDraw(s);

        Circle c = new Circle();
        doDraw(c);

        Reactangle r = new Reactangle();
        doDraw(r);
    }

    public static void doDraw(Shape s) {
        s.draw();
    }

}
