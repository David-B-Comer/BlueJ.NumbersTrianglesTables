


public class NumberUtilities {

    public static String getRange(int stop) {
        String s = "";
        for (int i = 0; i < stop; i++){
        s += i; }
        return s;
    }

    public static String getRange(int start, int stop) {
        String y = "";
        for (int i = start; i < stop; i ++){
        y += i; }
        return y;
    }


    public static String getRange(int start, int stop, int step) {
        String z = "";
        for (int i = start; i < stop; i+= step){
        z += i; }
        return z;
    }

    public static String getEvenNumbers(int start, int stop) {
        String e = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0) {
        e += i; }}
        return e;
    }


    public static String getOddNumbers(int start, int stop) {
        String o = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 1){
        o += i; }}
        return o;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String x = "";
        for (int i = start; i <= stop; i++){
        x += (int)(Math.pow(i, exponent)); }
        return x;
    }
}
