public class VarEx3 {
    public static void main(String[] args) {
        final int score;
        score = 200;

        System.out.println(score);

        boolean power = true;
//        byte b = 128; // Error! (-128 ~ 127)
        System.out.println(power);

        int oct = 010; // 8진수, 10진수로 8
        int hex = 0x10; // 16진수, 10진수로 16
        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);
        
//        long l = 10_000_000_000; // Error!
        long l = 10_000_000_000L;

        float f = 3.14f;
//        float f = 3.14; // Error!
        double d = 3.14;
//        double d = 3.14f; // OK!

        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        char ch = 'A';
        int i = 'A';

        String str = ""; // 빈 문자열 (OK)
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;
        System.out.println("str4 = " + str4);
    }
}
