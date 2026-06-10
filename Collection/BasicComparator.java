package Collection;
import java.util.*;

public class BasicComparator implements Comparator<student> {

    public int compare(student  o1 , student o2){
        return o1.weight - o2.weight ;
     }
}