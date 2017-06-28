import java.*;
import java.util.*;
public class KthSmallest{
    public static void main(String args[]){
        System.out.println("Hello!");
        KthSmallest ins = new KthSmallest();
        List<Integer> l = new ArrayList<Integer>();

        l.add(16);
        l.add(80);
        l.add(55);
        l.add(32);
        l.add(8);
        l.add(38);
        l.add(40);
        l.add(65);

        System.out.println(ins.findKth(l,2));

    }

    public int findKth(List<Integer> a, int k){
        return quicksort(a, k-1, 0, a.size()-1);
         
    }

    public int findKthByHeap(List<Integer> a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i =0;i<a.size();i++){
            pq.add(a.get(i));
        }
        for(int i = 1;i<k;i++){
            pq.poll();
        }
        return pq.peek();
    }
    

    public int quicksort(List<Integer> a,int k, int left, int right){
        int low = left;
        int high = right;
        int pivot = a.get((left + right)/2);

        while(left<=right){
        while(a.get(left) < pivot) left++;
        while(a.get(right) > pivot) right--;
        if(left<=right){
            swap(a, left, right);
            left++;
            right--;
        }
}

        
        if(low < right && k <= right) return quicksort(a, k, low, right);
        if(high > left && k>=left) return quicksort(a, k, left, high);
        return a.get(k);
    } 

    public void swap(List<Integer> a,int m,int n){
        int temp = a.get(m);
        a.set(m,a.get(n));
        a.set(n,temp);
    }
}