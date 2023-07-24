//TODO: reduce the runtime

package org.exercises.Solutions;

public class Ex151 {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(" ");
        }
        String result = sb.toString().trim();
        return result;
    }
}
