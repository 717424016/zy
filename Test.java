package schoolsystem;
import java.util.ArrayList;
 
public class Test {
    public static void main(String[] args) {
//        1 1 0 1 2 3 1
        ArrayList<Integer> params = SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem(params.get(0), params.get(1), params.get(2));
        for (int i = 3; i < params.size(); i++) {
            sc.addStudent(params.get(i));
        }
        sc.print();
    }
}
 
 