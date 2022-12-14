public class Bob {
    public static int enough(int cap, int on, int wait){
        int set = cap-on , stai = set - wait;
        return set >= wait ? 0  : stai;

    }
}
