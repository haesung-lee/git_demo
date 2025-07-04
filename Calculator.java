public class Calculator  {
    public long add(String str1, String str2) {
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        if(a < b){
            for(int i = 0; i<50; i++){
                System.out.println("!!!");
            }
        }else {
            System.out.println("!!!");
        }

        long longA = a;
        long longB = b;
        return longA + longB;
    }
}