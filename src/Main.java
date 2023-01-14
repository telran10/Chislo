public class Main {
    public static void main(String[] args) {
        int i = 325;
       int result = (i/100) % 100;
       int result2 = i % 100;
       int result3 = result2/10 %10;
       int result4 = result2 % 10;
        System.out.println(result+ "  " +result3+ "  "+result4);
    }
}