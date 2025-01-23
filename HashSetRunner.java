import java.util.HashSet;
import java.util.Set;

public class HashSetRunner {
    static public void main(String[] ars){

        Set<Number> hasSet = new HashSet<Number>(){
            {
            this.add(3.23f); // we can add the elements through anonymous class, for this we need include generics like Number, String, char
            this.add(0);
            this.add(2);   
            }   
        };
        hasSet.add(32);
        hasSet.add(302);
        hasSet.add(92);
        hasSet.add(342);
        hasSet.add(4.50f);
        hasSet.add(12);
        System.err.println(hasSet);

    }
}
