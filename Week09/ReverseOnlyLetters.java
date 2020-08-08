public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S) {
        if (S == null || S.length() == 0);
        int left = 0;
        int right = S.length() - 1;
        char[] arr = S.toCharArray();
        while (left < right) {
            if (Character.isLetter(arr[left]) && Character.isLetter(arr[right])) {
                char tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            }
            if (!Character.isLetter(arr[left])) left++;
            if (!Character.isLetter(arr[right])) right--;
        }
        return new String(arr);
    }
}