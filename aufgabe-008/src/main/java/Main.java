public class Main {

    public static void main(String[] args) {

        // TODO: Diese Aufgabe setzt auf aufgabe-006 auf. Erweitere den Code, sodass du Addition mit "add", Subtraktion
        // mit "sub", Multiplikation mit "mul" und Division mit "div" ausführen kannst.
        // Es muss jedes mal geprüft werden, ob es sich um "add", "sub", "mul" oder um "div" handelt. Ganz am Ende
        // soll es eine Ausgabe geben, für den Fall, dass es die Methode nicht ganz, etwa für "foo". Dort soll die
        // Fehlermeldung: "foo ist keine gültige Operation" ausgegeben werden.
        //
        // Die zu testenden Varianten:
        // add 5 4
        // sub 66 10
        // mul 3 4
        // div 12 4
        // foo 1 1

        // Ausgabe:
        // 5 + 4 = 9
        // 66 - 10 = 56
        // 3 * 4 = 12
        // div 12 / 4 = 3
        // foo ist keine gültige Operation

        String[] daten = new String[3];

        daten[0] = "add";
        daten[1] = "5";
        daten[2] = "4";
        if (daten[0].equals("add")) {
            int ergebnis = Integer.parseInt(daten[1]) + Integer.parseInt(daten[2]);
            System.out.println(daten[1] + " + " + daten[2] + " = " + ergebnis);
        }

        daten[0] = "sub";
        daten[1] = "66";
        daten[2] = "10";
        if (daten[0].equals("sub")) {
            int ergebnis = Integer.parseInt(daten[1]) - Integer.parseInt(daten[2]);
            System.out.println(daten[1] + " - " + daten[2] + " = " + ergebnis);
        }

        daten[0] = "mul";
        daten[1] = "3";
        daten[2] = "4";
        if (daten[0].equals("mul")) {
            int ergebnis = Integer.parseInt(daten[1]) * Integer.parseInt(daten[2]);
            System.out.println(daten[1] + " * " + daten[2] + " = " + ergebnis);
        }

        daten[0] = "div";
        daten[1] = "12";
        daten[2] = "4";
        if (daten[0].equals("div")) {
            int ergebnis = Integer.parseInt(daten[1]) / Integer.parseInt(daten[2]);
            System.out.println(daten[1] + " / " + daten[2] + " = " + ergebnis);
        }

        daten[0] = "foo";
        daten[1] = "1";
        daten[2] = "1";
        if (!daten[0].equals("add") && !daten[0].equals("sub") && !daten[0].equals("mul") && !daten[0].equals("div")) {
            System.out.println(daten[0] + " ist keine gültige Operation");
        }
    }
}
