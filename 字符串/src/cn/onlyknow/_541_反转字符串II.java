package cn.onlyknow;

public class _541_反转字符串II {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += (2 * k)) {
            int start = i;
            int end = Math.min(start + k - 1, chars.length - 1);
            while (start < end) {
                chars[start] ^= chars[end];
                chars[end] ^= chars[start];
                chars[start] ^= chars[end];

                start++;
                end--;
            }
        }

        return new String(chars);
    }
}
