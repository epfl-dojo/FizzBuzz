/*
multiple de 5 => Fiz
multiple de 7 ou fini par 7 => Buzzle
 */
package fizbuzz;

/**
 *
 * @author Nicolas Rymond
 */
public class Fizbuzz {

    public static void main(String[] args) {
        for(int i = 1;i < 100; i++) {
            if (multipleDe(i, 5) && multipleDe(i, 7)) {
                System.out.println("FizBuzz");
            } else if (multipleDe(i, 7)) {
                System.out.println("Buzz");
            } else if (finitParSept(i)) {
                System.out.println("Buzz");
            } else if (multipleDe(i, 5)) {
                System.out.println("Fiz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static boolean finitParSept(int i) {
        return (i % 10 == 7);
    }

    private static boolean multipleDe(int i, int multiple) {
        return i % multiple == 0;
    }

}
