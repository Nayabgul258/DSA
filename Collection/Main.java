package Collection;

import java.util.*;


class Student {
    public int id;
    public String name;
    int age;

    Student(int id, String name,int age ) {
        this.id = id;
        this.name = name;
        this.age = age;
        

    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();

        st.add(new Student(1, "ram",34));
        st.add(new Student(2, "syam",23));
        st.add(new Student(5, "ramu",55));
        st.add(new Student(3, "karan",22));

        Collections.sort(st, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        System.out.println(st);
    }

}