public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, das ein Array von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 10
        // Felder groß sein. Das Array soll mit den Zahlen 5, 4, 3, 2, 1, 0, 9, 8, 7, 6 gefüllt und mittels
        // System.out.println ausgeben werden. Die Ausgabe soll wie folgt aussehen:
        //
        // 5
        // 4
        // 3
        // 2
        // 1
        // 0
        // 9
        // 8
        // 7
        // 6

        // TODO: Schreibe im zweiten Teil, sofern nicht schon erfolgt, die Ausgabe mitteln for-Schleife

        int[] zahlen = new int[10];
        zahlen[0] = 5;
        zahlen[1] = 4;
        zahlen[2] = 3;
        zahlen[3] = 2;
        zahlen[4] = 1;
        zahlen[5] = 0;
        zahlen[6] = 9;
        zahlen[7] = 8;
        zahlen[8] = 7;
        zahlen[9] = 6;

//        System.out.println(zahlen[0]);
//        System.out.println(zahlen[1]);
//        System.out.println(zahlen[2]);
//        System.out.println(zahlen[3]);
//        System.out.println(zahlen[4]);
//        System.out.println(zahlen[5]);
//        System.out.println(zahlen[6]);
//        System.out.println(zahlen[7]);
//        System.out.println(zahlen[8]);
//        System.out.println(zahlen[9]);

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
