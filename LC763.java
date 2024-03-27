class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] dict = new int[26];
        for(int i = 0; i < s.length(); i++){
            dict[s.charAt(i) - 'a'] = i;
        }
        int max = 0;
        int start = 0;
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            max = Math.max(max, dict[s.charAt(i) - 'a']);
            if(i == max){
                result.add(i - start + 1);
                start = i + 1;
            }
        }
        return result;
    }
}
// O(N), O(1)
