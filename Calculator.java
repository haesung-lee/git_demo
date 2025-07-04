public class Calculator  {
    public int add(short a, short b) {
        if(a + b > Integer.MAX_VALUE){
            return -1;
        }
        return a + b;
    }
}