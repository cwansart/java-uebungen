public class Main {

    public static void main(String[] args) {

        // TODO: Schreibe ein Programm, welches ein Array mit 3 Werten vom Typ String erzeugt. Das Array soll mit
        // folgenden Werten befüllt werden:
        // 0: "Hallo"
        // 1: "Hello"
        // 2: "Hallo"
        // Anschließend sollen die String jeweils vergleichen werden. Erst 0 mit 1, dann 0 mit 2, dann 1 mit 2.
        // Das soll mit if realisiert werden. Hier muss "equals" anstatt "==" zum Vergleich genutzt werden.
        // Stimmen die Grußtexte überein soll dies entsprechend mittels System.out.println ausgegeben werden, etwa:
        // "Hallo (0) und Hallo (2) sind gleich". In den Klammern sollen die Array-Indizes des jeweils Grußes
        // angezeigt werden.
        // Jedes if soll einen else-Block erhalten, der eine Fehlerausgabe macht in der Form:
        // "Hallo (0) und Hello (2) sind ungleich". Natürlich mit den entsprechenden Grußtexten an entsprechender Stelle.

        // Ausgabe:
        // Hallo (0) und Hello (1) sind ungleich
        // Hallo (0) und Hallo (2) sind gleich
        // Hello (1) und Hallo (2) sind ungleich

        String[] daten = new String[3];
        daten[0] = "Hallo";
        daten[1] = "Hello";
        daten[2] = "Hallo";

        if (daten[0].equals(daten[1])) {
            System.out.println(daten[0] + " (0) und " + daten[1] + " (1) sind gleich");
        } else {
            System.out.println(daten[0] + " (0) und " + daten[1] + " (1) sind ungleich");
        }

        if (daten[0].equals(daten[2])) {
            System.out.println(daten[0] + " (0) und " + daten[2] + " (2) sind gleich");
        } else {
            System.out.println(daten[0] + " (0) und " + daten[2] + " (2) sind ungleich");
        }

        if (daten[1].equals(daten[2])) {
            System.out.println(daten[1] + " (1) und " + daten[2] + " (2) sind gleich");
        } else {
            System.out.println(daten[1] + " (1) und " + daten[2] + " (2) sind ungleich");
        }
    }
}
