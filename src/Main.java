import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        YearsMonth [] dd = YearsMonth.values();

        ArrayList<YearsMonth> yy = new ArrayList<>();
        for (int i=0; i<12; i++){
            yy.add(dd[i]);
        }
        LinkedList <YearsMonth> ee = new LinkedList<>();
        for (int i=0; i<12; i++){
            ee.add(dd[i]);
        }

        System.out.println(Arrays.toString(dd) + "\n" + yy + "\n" + ee);
    }

}
