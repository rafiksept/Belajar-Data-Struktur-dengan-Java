package belajar.data.utils;

public class UpdateArr {
    public static String[] updateData(String[] data){
        for (var i = 0; i < data.length;i ++ ){
            if (i < data.length - 1){
                data[i] = data[i + 1];
            } else {
                data[i] = "kosong";
            }
        }
        return data;
    }
}
