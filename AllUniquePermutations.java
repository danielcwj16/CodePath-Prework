import java.util.*;

public class AllUniquePermutations {

    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(1);
        a.add(2);
        AllUniquePermutations ins = new AllUniquePermutations();
        ArrayList<ArrayList<Integer>> res = ins.permute(a);
        for(ArrayList<Integer> p : res){
            System.out.println(p.toString());
        }
    }
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(a == null || a.size() == 0)
            return res;
        boolean[] used = new boolean[a.size()];
        Collections.sort(a);
        ArrayList<Integer> list = new ArrayList<Integer>();
        dfs(a,used,list,res);
        return res;
	}

    public void dfs(ArrayList<Integer> a,boolean[] used, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res){

        if(list.size() == a.size()){
            res.add(new ArrayList<Integer>(list));
            return;
        }
            for(int i = 0;i<a.size();i++){
                if(used[i]==true)
                    continue;
                if(i>0 && a.get(i-1)==a.get(i) && used[i-1]!= true)continue;
                used[i] = true;
                list.add(a.get(i));
                dfs(a,used,list,res);
                used[i] = false;
                list.remove(list.size()-1);
            }
        
    }
}