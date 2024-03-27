class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int noneOverlap = 1;
        int right = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= right){
                noneOverlap ++;
                right = intervals[i][1];
            }
            else{
                right = Math.min(right, intervals[i][1]);
            }
        }
        return intervals.length - noneOverlap;
    }
}
//O(NlogN), O(logN)
