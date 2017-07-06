import java.util.*;
public class LongestConsecutive {
    public static void main(String args[]){
        List<Integer> a = new ArrayList<Integer>();
        a.add(100);
        a.add(4);
        a.add(200);
        a.add(1);
        a.add(3);
        a.add(2);

        LongestConsecutive ins = new LongestConsecutive();
        int res = ins.longestConsecutive(a);
        System.out.println(res);
    }
	public int longestConsecutive(final List<Integer> a) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n : a){
            if(!map.containsKey(n)){
                int left = map.containsKey(n-1)? map.get(n-1) : 0;
                int right = map.containsKey(n+1)? map.get(n+1) : 0;

                int sum = left + right +1;
                map.put(n,sum);

                res = Math.max(res,sum);

                map.put(n-left,sum);
                map.put(n+right,sum);
            }else{
                continue;
            }
        }
        return res;
	}
}