public class Main {
    public static void main(String[] args) {
        int i = 60; //101

        System.out.printf("%d %d %d\n" , i>>0, i>>1, i>>2);
        System.out.printf("%d \t %s\n", i>>0, DectoBin(i>>0));
        System.out.printf("%d \t %s\n", i>>1, DectoBin(i>>1));
        System.out.printf("%d \t %s\n", i>>2, DectoBin(i>>2));

    }

    public static String DectoBin (int i){
        String str ="", temp;
        int div = i;
        while(div != 0) {
            div = div % 2;
            temp = Integer.toString(div);
            str = str.concat(temp);
            i = i / 2;
            div = i;
        };
        StringBuilder binStr = new StringBuilder(str);
        binStr.reverse();
        return binStr.toString();
    }
}
//edit here 123
//edit here
