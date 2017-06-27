import java.*;
import java.util.ArrayList;

public class PrettyPrint{

    public static void main(String args[])
    {
        System.out.println("Hellow world!");
        ArrayList<ArrayList<Integer>> res = prettyprint(4);
    }

    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
	    if(a == 0)
            return new ArrayList<ArrayList<Integer>>();
        int row = 2*a-1;
        int col = 2*a-1;
         ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<row;i++)
        {
            for(int j = 0;j<col;j++){
               if(i <a && j<a){
                   int val = Math.max(a-i,a-j);
                   list.add(val);
                   continue;
               }
               if(i <a && j >= a){
                   int val =  Math.max((a-i), a-(col-1-j));
                   list.add(val);
                   continue;
               }
               if(i >= a && j < a){
                   int val =  Math.max(a-(row-1-i), a-j);
                   list.add(val);
                   continue;
               }
               if(i >= a && j>= a){
                   int val =  Math.max(a-row+i+1,a-col+j+1);
                   list.add(val);
                   continue;
               }
            }
            res.add(new ArrayList(list));
            list.clear();
        }
        return res;
	}
}