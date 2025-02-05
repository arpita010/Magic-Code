import java.util.*;

public class Magic2 {
  public static void main(String[] args) {
    Set<Object> set1 = new HashSet<>();
    Set<Object> set2 = new HashSet<>();
    set1.add(set2);
    set2.add(set1);
    System.out.println(set1);
    Queue<Integer> queue=new LinkedList<>();
    
  }
}
