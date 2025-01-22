import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSortRunner {
    public static <T> void main(String[] args){

        List<StudentData> data  = List.of(new StudentData(742,"shanu", 95),
        new StudentData(233, "madhu", 75),
        new StudentData(289, "mario", 87));


        ArrayList<StudentData> dataAl = new ArrayList<>(data);
        System.out.println(dataAl);
        Collections.sort(dataAl);
        System.err.println(dataAl);
        
    
    }    
}
