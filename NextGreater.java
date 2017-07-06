import java.util.*;
public class NextGreater {

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(5);
        arr.add(2);
        arr.add(10);

        NextGreater ins = new NextGreater();
        ArrayList<Integer> result = ins.nextGreater(arr);
        for(int i = 0;i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
	public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        ArrayList<Integer> r = new ArrayList<Integer>(a.size());
        Stack<Integer> s = new Stack<Integer>();

        int n = a.size();
        for(int i = 0;i< n;i++){
            r.add(-1);
            int num = a.get(i);
            while(!s.isEmpty() && a.get(s.peek()) < num){
                r.set(s.pop(),num);
            }
            if(i<n)
                s.push(i);
        }
        return r;
	}
}