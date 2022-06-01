package belajar.data.utils;

public class MergingUtil {

    public static String merging(String[] inputan){
        String output = "";
        for(var i:inputan){
            i += ",";
            output += i;

        }
        return output;
    };
}
