import java.util.*;

public class NumRange {

    public static void main(String args[]) {
        System.out.println("Hellow world!");
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(5);
        l.add(1);
        l.add(0);
        l.add(2);
        l.add(4);
        l.add(1);
        NumRange ins = new NumRange();
        int ans = ins.numRange(l, 6, 8);
        System.out.println(ans);
    }

    public int numRange(ArrayList<Integer> a, int b, int c) {
        int count = 0;
        int sz = a.size();
        for (int i = 0; i < sz; i++) {
            int j = i;
            int sum = 0;
            while (j < sz) {
                sum = sum + a.get(j);
                if (sum >= b && sum <= c) {
                    count++;
                }
                if (sum >c) {
                    break;
                }
                j++;
            }
        }
        return count;

    }
}