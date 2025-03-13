import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxNoOfWordsinSentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence: sentences){
            int count = 1;
            for (int i=0; i<sentence.length(); i++){
                if (sentence.charAt(i) == ' '){
                    count++;
                }
            }
            if (count > max){
                max = count;
            }
        }  
        return max;  
    }

    public static void main(String[] args) throws IOException {
        MaxNoOfWordsinSentences mws = new MaxNoOfWordsinSentences();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        // Enter the number of sentences:
        int n = Integer.parseInt(br.readLine());
        String[] sentences = new String[n];

        // Enter the sentences:
        for (int i = 0; i < n; i++) {
            sentences[i] = br.readLine();
        }

        System.out.println(mws.mostWordsFound(sentences));
    }
}
