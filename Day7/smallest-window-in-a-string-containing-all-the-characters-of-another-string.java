class Solution
{
    //Function to find the smallest window in the string s consisting
    //of all the characters of string p.
    public static String smallestWindow(String s, String p)
    {
        final int no_of_chars = 256;
        int len1 = s.length();
        int len2 = p.length();

        // Check if string's length is 
        // less than pattern's
        // length. If yes then no such 
        // window can exist
        if (len1 < len2) {
            return "-1";
        }

        int hash_pat[] = new int[no_of_chars];
        int hash_str[] = new int[no_of_chars];

        // Store occurrence ofs 
        // characters of pattern
        for (int i = 0; i < len2; i++)
            hash_pat[p.charAt(i)]++;

        int start = 0, start_index = -1,
            min_len = Integer.MAX_VALUE;

        // Start traversing the string
        // Count of characters
        int count = 0; 
        for (int j = 0; j < len1; j++) {
          
            // Count occurrence of characters 
            // of string
            hash_str[s.charAt(j)]++;

            // If string's char matches 
            // with pattern's char
            // then increment count
            if (hash_str[s.charAt(j)]
                <= hash_pat[s.charAt(j)])
                count++;

            // If all the characters are matched
            if (count == len2) {
              
                // Try to minimize the window
                while (hash_str[s.charAt(start)]
                           > hash_pat[s.charAt(start)]
                       || hash_pat[s.charAt(start)]
                              == 0) {

                    if (hash_str[s.charAt(start)]
                        > hash_pat[s.charAt(start)])
                        hash_str[s.charAt(start)]--;
                    start++;
                }

                // update window size
                int len_window = j - start + 1;
                if (min_len > len_window) {
                    min_len = len_window;
                    start_index = start;
                }
            }
        }

        // If no window found
        if (start_index == -1) {
            return "-1";
        }

        // Return substring starting 
        // from start_index
        // and length min_len
        return s.substring(start_index,
                             start_index + min_len);
    }

}
