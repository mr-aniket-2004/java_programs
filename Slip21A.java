import java.util.Hashtable;
import java.util.*;;

public class Slip21A {
    public static void main(String[] args) {
        Hashtable <String,Integer> mytable = new Hashtable<>();
        mytable.put("Pune", 020);
        mytable.put("Mumbai", 022);
        mytable.put("Chennai", 044);
        mytable.put("Kolkata", 033);
        

        System.out.println(mytable);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the City name to search --");
        String str = sc.nextLine();
        System.out.println(mytable.get(str));
    }
}
