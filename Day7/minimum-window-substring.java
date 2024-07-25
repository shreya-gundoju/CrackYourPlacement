class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0) return "";
        HashMap<Character, Integer> mpt = new HashMap<>();
        HashMap<Character, Integer> mps = new HashMap<>();
        for (int i=0;i<t.length();i++) {
            mpt.put(t.charAt(i), mpt.getOrDefault(t.charAt(i), 0) + 1);
        }
        int cur=0, total=mpt.size();
        int i=0,j=0;
        int res=Integer.MAX_VALUE;
        int[] indices = new int[2];
        while (j < s.length()) {
            if(mpt.containsKey(s.charAt(j))) mps.put(s.charAt(j), mps.getOrDefault(s.charAt(j), 0) + 1);
            if(mpt.containsKey(s.charAt(j)) && mps.get(s.charAt(j)).equals(mpt.get(s.charAt(j)))) cur++;

            while (cur == total) {
                if (j - i + 1 < res) {
                    res = j - i + 1;
                    indices[0] = i;
                    indices[1] = j;
                }
                if (mps.containsKey(s.charAt(i))) {
                    mps.put(s.charAt(i), mps.get(s.charAt(i)) - 1);
            if(mps.containsKey(s.charAt(i))&&mps.get(s.charAt(i))<mpt.get(s.charAt(i))) 
                    cur--;
                }
                i++;
            }
            j++;
        }
        if (res == Integer.MAX_VALUE) return "";
        StringBuilder str = new StringBuilder();
        for (int k = indices[0]; k <= indices[1]; k++) {
            str.append(s.charAt(k));
        }
        return str.toString();
    }
}
