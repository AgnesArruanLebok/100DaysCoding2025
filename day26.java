public class day26 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("---Operator Penugasan Aritmatika---");
        a = 20;
        System.out.println("Nilai awal a = " +a );
        a += 10;
        System.out.println("a += 10 = " + a );
        a -= 5;
        System.out.println("a -= 5 = " + a );
        a *= 2;
        System.out.println("a *= 2 = " + a );
        a /= 4;
        System.out.println("a /= 4 = " + a );
        a %= 3;
        System.out.println("a %= 3 = " + a );

        System.out.println("\n---Operator Penugasan Bitwise---");
        b = 5;
        System.out.println("Nilai awal b = " + b );
        b &= 3;
        System.out.println(" b &= 3 = " + b);
        b = 5;
        b |= 3;
        System.out.println("b |= 3 = " + b);
        b = 5;
        b ^= 3;
        System.out.println("b ^= 3 = " + b);
        b = 5;
        b <<= 2;
        System.out.println("b <<= 2 = " + b);
        b = 20;
        b >>= 2;
        System.out.println("b >>= 2 = " + b);

    }
}
