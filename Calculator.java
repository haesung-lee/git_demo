public class Calculator  {
    public long add(String str1, String str2) {
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        if(a < b){
            System.out.println(a);
            System.out.println(b);
        }
        long longA = a;
        long longB = b;
        return longA + longB;
    }
}