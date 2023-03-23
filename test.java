import java.util.HashMap;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        map.put("1",1);
        map.put("1", 2);
        System.out.println(map);
        set.add("ji");
        System.out.print(set.add("ji"));
        System.out.println(set);
    }
}
