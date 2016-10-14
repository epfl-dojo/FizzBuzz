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
        int i = 1;
        while (i < 100) {
            if (multipleDeCinq(i) && multipleDeSept(i)) {
                System.out.println("FizBuzz");
            } else if (multipleDeSept(i)) {
                System.out.println("Buzz");
            } else if (finitParSept(i)) {
                System.out.println("Buzz");
            } else if (multipleDeCinq(i)) {
                System.out.println("fiz");
            } else {
                System.out.println(i);
            }
            i++;
        }

    }

    private static boolean multipleDeCinq(int i) {
        return i % 5 == 0;
    }

    private static boolean multipleDeSept(int i) {
        return i % 7 == 0;
    }

    public static boolean finitParSept(int i) {
        return (i % 10 == 7);
    }

}
