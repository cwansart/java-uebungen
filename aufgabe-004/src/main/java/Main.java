public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, das eine von Zahlen erzeugt. Dieses Array soll vom Typ int sein und 5
        // Felder groß sein. Das Array soll mit den Werten 1, 2, 3, 4, 5 befüllt und anschließend in einer Zeile
        // ausgegeben werden, anstatt ein Wer pro Zeile. Die Zahlen sollen mittels StringBuilder vorbereitet und
        // anschließend mittels System.out.println ausgegeben werden.
        //
        // Beispiel:
        // StringBuilder builder = new StringBuilder();
        // builder.append(2).append(" "); // fügt "2 " hinzu
        // builder.append(4).append(" "); // fügt "4 " hinzu
        // builder.append(8).append(" "); // fügt "8 " hinzu
        // String ausgabe = builder.toString(); // fügt die Strings oben zusammen zu "2 4 8 "

        // Ausgabe:
        // 1 2 3 4 5

        int[] zahlen = new int[5];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < zahlen.length; i++) {
            builder.append(zahlen[i]).append(' ');
        }

        System.out.println(builder.toString());
    }
}
