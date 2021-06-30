import java.util.HashSet;
class Animal {
    public int i=12;
    public Animal() {
        i=13;
    }
    @Override
    public final String toString() {
        return "Animal " +i;
    }
}
public class P41 {
    public static void main(String[] args) {
        HashSet<Animal> s = new HashSet<Animal>();
        s.add(new Animal());
        s.add(new Animal());
        for(Animal a : s) {
            System.out.println(a);
            System.out.println(a.hashCode());
        }
    }
}