class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If the array is empty, return empty string
        if (strs.length == 0) return "";

        // Take the first string as starting prefix
        String first = strs[0];

        // Loop through each string in the array
        for (int i = 0; i < strs.length; i++) {
            // While the current string does not start with 'first' prefix
            while (strs[i].indexOf(first) != 0) {
                // Shorten 'first' by removing the last character
                first = first.substring(0, first.length() - 1);

                // If 'first' becomes empty, no common prefix exists
                if (first.isEmpty()) return "";
            }
        }

        // After loop, 'first' is the longest common prefix
        return first;
    }
}
