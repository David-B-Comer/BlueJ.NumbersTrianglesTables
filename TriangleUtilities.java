 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String x = "";
        for (int i = 0; i < numberOfStars; i++){
        x = x + "*"; }
        return x;

    }
    
    public static String getTriangle(int numberOfRows) {
        String y = "";
        for (int i = 0; i < numberOfRows; i++){
         y += getRow(i) + "*\n"; }
        return y;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
