/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty()) return true;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[1],b[1])
        );
        for(int i=0;i<intervals.size();i++){
            Interval interval = intervals.get(i);
            pq.offer(new int[]{interval.start,interval.end});
        }
        int[] pro = pq.poll();
        int end = pro[1];
        while(!pq.isEmpty()){
            int[] newPro = pq.poll();
            int start = newPro[0];
            if(start<end) return false;
            end = newPro[1];
        }
        return true;
    }
}
