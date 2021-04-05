package HW.NC73;

import java.util.*;

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if( intervals == null || intervals.size() == 0){
            return new ArrayList<Interval>();
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval o1,Interval o2){
                return o1.start-o2.start;
            }
        });

        for(int i =1 ;i < intervals.size(); i++){
            int curStart = intervals.get(i).start;
            int curEnd = intervals.get(i).end;
            int preStart = intervals.get(i-1).start;
            int preEnd = intervals.get(i-1).end;
            if(curStart <= preEnd){
                intervals.set(i,new Interval(preStart,Math.max(curEnd,preEnd)));
                intervals.set(i-1,null);
            }
        }
        while(intervals.remove(null));
        return intervals;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ArrayList<Interval> list = new ArrayList<>();
        list.add(new Interval(10,30));
        list.add(new Interval(20,60));
        list.add(new Interval(80,100));
        list.add(new Interval(150,180));
        ArrayList<Interval> merge = solution.merge(list);
        for (int i = 0; i < merge.size(); i++) {
            int start = merge.get(i).start;
            int end = merge.get(i).end;
            System.out.println(start+":"+end);
        }
    }
}
