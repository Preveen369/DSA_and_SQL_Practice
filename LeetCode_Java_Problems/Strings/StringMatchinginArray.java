import java.util.ArrayList;
import java.util.List;

public class StringMatchinginArray {
    public static List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for (int i=0; i<words.length; i++){
            for (int j=0; j<words.length; j++){
                String word1 = words[i];
                String word2 = words[j];
                if (word1.length() >= word2.length()){
                    continue;
                }
                if (isSubString(word1, word2)){
                    list.add(word1);
                    break;
                }
            }
        }
        return list;
    }

    public static boolean isSubString(String word1, String word2){
        if (word2.contains(word1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> list = stringMatching(words);
        System.out.println("Output: " + list);
    }
}
