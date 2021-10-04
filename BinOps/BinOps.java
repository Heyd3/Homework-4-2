package Fassad;

public class BinOps {
    public String sum(String a, String b) {

        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int e = c + d;
        return Integer.toBinaryString(e);
    }

    public String mult(String a, String b) {
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int e = c * d;
        return Integer.toBinaryString(e);
    }
}
