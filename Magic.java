import java.util.Objects;

public class Magic {
  public static void main(String[] args) {
    Integer a = 1;
    Integer b = 1;
    Integer c = 128;
    Integer d = 128;
    int hs = Objects.hashCode(a);
    System.out.println(a == b);
    System.out.println("Hashcode of a : " + System.identityHashCode(a));
    System.out.println("Hashcode of b : " + System.identityHashCode(b));

    System.out.println(c.equals(d));
    System.out.println("Hashcode of c : " + System.identityHashCode(c));
    System.out.println("Hashcode of d : " + System.identityHashCode(d));
  }
}


