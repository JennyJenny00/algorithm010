import java.util.*;
public class AssignCookies {
   public static void main(String[] args) {
       int[] g = {1,2,3};
       int[] s = {1,2};
       System.out.println("g is : ");
       for (int i : g) {
           System.out.println(i + ",");
       }
       System.out.println("s is : ");
       for (int i : s) {
        System.out.println(i + ",");
       }
       System.out.println("The ans is : " + findContentChildren(g, s));
   } 
   public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        for (int j = 0; i < g.length && j < s.length; j++) {
            if (g[i] <= s[j])
                i++;
        }
        return i;
    }
}