public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String wynik = "";
        for ( int i = 0; i<=repeat; i++)
        {
            System.out.println(wynik =(wynik.concat(string)));
        }
        return wynik; 
    }
}
