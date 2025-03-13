public class DataType{
    static int dataTypeSize(String str) {
        if (str.equalsIgnoreCase("Character")) 
            return 1;
        else if(str.equalsIgnoreCase("Integer") || str.equalsIgnoreCase("Float"))
            return 4;
        else if(str.equalsIgnoreCase("Double") || str.equalsIgnoreCase("Long"))
            return 8;
        else return -1;
    }
    public static void main(String[] args) {
        System.out.println(dataTypeSize("Integer"));
    }
}