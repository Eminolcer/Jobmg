import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mette Frederiksen 19.11.1977");
        names.add("Jeppe Kofod 14.03.1974");
        names.add("Nick  Hækkerup 03.04.1968");
        names.add("Nicolai Halby Wammen 07.02.1971 ");
        names.add("Trine Bramsen 26.03.1981 ");
        names.add("Astrid Krag 17.11.1982 ");
        names.add("Flemming Møller Mortensen 03.07.1963 ");
        names.add("Peter  Hummelgaard 17.01.1983");
        names.add("Mattias Tesfaye 31.03.1981");
        names.add("Jesper Petersen 25.08.1981");
        names.add("Dan Jørgensen 12.06.1975");
        names.add("Morten Bødskov 01.05.1970");
        names.add("Pernille Rosenkrantz-Theil 17.01.1977");
        names.add("Ane Halsboe-Jørgensen 04.05.1983");
        names.add("Benny Engelbrecht 04.08.1970");
        names.add("Kaare Dybvad Bek 05.08.1984");
        names.add("Magnus Johannes Heunicke 28.01.1975");
        names.add("Lea  Wermelin 10.05.1985");


        Scanner sc = new Scanner(System.in);
        int selection;
        boolean exit = false;
        boolean nameExist = false;
        while (!exit) {
            System.out.println("");
            System.out.println("Vælg et af følgende muligheder, for at fortsætte");
            System.out.println("1) Søg efter folk på PEP-listen med fulde navn og fødselsdato");
            System.out.println("2) Se PEP-listen");
            System.out.println("3) Afslut");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Indtast fulde navn samt fødselsdato");
                    String nameSearch = myObj.nextLine();  // Read user input

                    for (int z = 0; z < names.size(); z++) {
                        if (StringUtils.equalsIgnoreCase(nameSearch, names.get(z))) {
                            System.out.println("Denne person er PEP-listet");

                            nameExist = true;


                            System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                            Scanner sc1 = new Scanner(System.in);
                            if (sc1.next().equalsIgnoreCase("nej"))
                                exit = true;
                            break;
                        }
                    }

                    if (!nameExist) {
                        System.out.println("Denne person findes ikke på PEP-Listen");
                        System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                        Scanner sc2 = new Scanner(System.in);
                        if (sc2.next().equalsIgnoreCase("nej"))
                            exit = true;
                        break;
                    }
                    break;


                case 2:
                    System.out.println(names);
                    break;

                case 3:
                    exit = true;
                    break;

            }
        }
    }
}