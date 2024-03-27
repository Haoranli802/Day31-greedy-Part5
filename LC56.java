class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int left = intervals[0][0];
        int right = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] > right){
                result.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
            else{
                right = Math.max(right, intervals[i][1]);
            }
        }
        result.add(new int[]{left, right});
        int[][] res = new int[result.size()][];
        for(int i = 0; i < result.size(); i++){
            res[i] = result.get(i);
        }
        return res;
    }
}

//O(NlogN), O(logN)
