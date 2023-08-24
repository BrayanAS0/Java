import java.util.*;

public class Estrucutra_1_principio {
    public static void main(String[] args) {

        List<Integer> set = new ArrayList<>();
        set.add(9);
        set.add(4);
        set.add(32);
        set.add(1);
        set.add(5);
        Collections.sort(set);
        System.out.println(set);
    }
}