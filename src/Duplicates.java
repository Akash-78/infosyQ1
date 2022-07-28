import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public static int getUniqueletter(String s){
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i=0;i<s.length();i++)
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        char u =s.charAt(0);
        boolean found = false;
        for (Map.Entry<Character,Integer> e:hashMap.entrySet()) {
            if (e.getValue() == 1){
                found=true;
                u=e.getKey();
                break;
            }


        }
        if (found)
            return s.indexOf(u)+1;
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(getUniqueletter("aabbcc"));
    }
}
