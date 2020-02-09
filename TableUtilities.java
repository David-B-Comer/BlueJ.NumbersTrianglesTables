 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        int y = 5;
        String result1 = getMultiplicationTable(y); 
        return result1;
    } 

    public static String getLargeMultiplicationTable() {
        int z = 10;
        String result2 = getMultiplicationTable(z);
        return result2;
    }
    

    
    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++){
                int k = i * j;
                    if (k < 10){
                        result +="  " + k + " |";
                    }
                    else if (k < 100 && k > 9){
                        result += " " + k + " |";
                    }
                    else {
                        result += ""+ k + " |";
                    } 
                }
                result += "\n";
         
    }
    return result;
    
}
}
