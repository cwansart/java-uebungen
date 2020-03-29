public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, das eine von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 5
        // Felder groß sein. Das Array soll mit den Werten 1, 2, 3, 4, 5 befüllt und anschließend in einer Zeile
        // ausgegeben werden, anstatt ein Wer pro Zeile. Hierzu soll System.out.print genutzt werden.
        //
        // Ausgabe:
        // 1 2 3 4 5

        int[] zahlen = new int[5];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }
    }
}
