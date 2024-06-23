import java.util.HashSet;

/**
 * HashSet_Ex
 */
public class HashSet_Ex {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("anish");
        names.add("jesh");
        names.add("limbu");
        names.add("libang");

     names.remove("anish");
     System.out.println(names);

    }
}