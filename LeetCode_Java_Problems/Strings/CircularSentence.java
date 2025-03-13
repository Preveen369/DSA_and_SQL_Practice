import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        
        for (int i=0; i<words.length-1; i++){
            char lastChar = words[i].charAt(words[i].length()-1);
            char firstChar = words[i+1].charAt(0);

            if (lastChar != firstChar)
                return false;
        }

        if (words[0].charAt(0) == words[words.length-1].charAt(words[words.length-1].length()-1))
            return true;
        return false;
    }
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String sentence = br.readLine(); // Reading the input sentence
    
            CircularSentence cs = new CircularSentence();
            boolean result = cs.isCircularSentence(sentence);
    
            if (result) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
}