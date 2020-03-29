public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, das ein String Array besitzt. Fülle dieses Array mit 3 Elementen:
        // 0: "add"
        // 1: "3"
        // 2: "7"
        //
        // Nun prüfe in ob das erste Element des Arrays ein "add" ist. Wenn das zutrifft, sollen die Werte an der 2.
        // und 3. Stelle zusammenaddiert werden.
        // Da "3" und "7" String sind, müssen diese vorher in Integer umgewandelt werden. Dazu kann die Funktion
        // Integer.parseInt("42") genutzt werden.
        // Für die Ausgabe empfiehlt sich ein StringBuilder.
        //
        // Fülle das Array anschließend erneut mit folgenden Werten:
        // 0: "sub"
        // 1: "17"
        // 2: "7"
        //
        // Da "sub" noch nicht implementiert ist, soll die Meldung "sub ist noch nicht implementiert" ausgegeben werden.

        // Ausgabe:
        // 3 + 7 = 10
        // sub ist noch nicht implementiert

        String[] daten = new String[3];
        daten[0] = "add";
        daten[1] = "3";
        daten[2] = "7";

        if (daten[0].equals("add")) {
            int ergebnis = Integer.parseInt(daten[1]) + Integer.parseInt(daten[2]);
            StringBuilder builder = new StringBuilder();
            String ausgabe = builder.append(daten[1]).append(" + ").append(daten[2]).append(" = ").append(ergebnis).toString();
            System.out.println(ausgabe);
        }

        daten[0] = "sub";
        daten[1] = "17";
        daten[2] = "7";

        if (daten[0].equals("sub")) {
            System.out.println("sub ist noch nicht implementiert");
        }
    }
}
