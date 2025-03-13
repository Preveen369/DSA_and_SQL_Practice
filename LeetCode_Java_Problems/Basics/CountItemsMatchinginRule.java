import java.util.List;

public class CountItemsMatchinginRule{
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        int index = 0;  // default index for "type"
        
        if (ruleKey.equals("color")){
            index = 1;
        }
        else if (ruleKey.equals("name")){
            index = 2;
        }
        
        for (List<String> item: items){
            if (item.get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "lenovo"),
            List.of("phone", "gold", "iphone"));
            
        String ruleKey = "color";
        String ruleValue = "silver";
        
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}