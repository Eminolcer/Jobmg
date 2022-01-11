import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Mette Frederiksen");
        names.add("Jeppe Kofod");
        names.add("Nick  Hækkerup");
        names.add("Nicolai Halby Wammen");
        names.add("Trine Bramsen");
        names.add("Astrid Krag");
        names.add("Flemming Møller Mortensen");
        names.add("Peter  Hummelgaard");
        names.add("Mattias Tesfaye");
        names.add("Jesper Petersen");
        names.add("Dan Jørgensen");
        names.add("Morten Bødskov");
        names.add("Pernille Rosenkrantz-Theil");
        names.add("Ane Halsboe-Jørgensen");
        names.add("Benny Engelbrecht");
        names.add("Kaare Dybvad Bek");
        names.add("Magnus Johannes Heunicke");
        names.add("Lea  Wermelin");


        Scanner sc = new Scanner(System.in);
        int selection;
        boolean exit = false;
        boolean nameExist = false;
        while (!exit) {
            System.out.println("Menu : ");
            System.out.println("Vælg mellem tallene 1 og 2, for at fortsætte");
            System.out.println("1) Søg efter folk på listen med fulde navn");
            System.out.println("2) Afslut");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Indtast fulde navn");
                    String nameSearch = myObj.nextLine();  // Read user input

                    for (int z = 0; z < names.size(); z++) {
                        if (StringUtils.equalsIgnoreCase(nameSearch, names.get(z))) {
                            System.out.println("Navnet findes på PEP-listen");

                            nameExist = true;


                            System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                            Scanner sc1 = new Scanner(System.in);
                            if (sc1.next().equalsIgnoreCase("nej"))
                                exit = true;
                            break;
                        }
                    }

                    if (!nameExist) {
                        System.out.println("Dette navn findes ikke på PEP-Listen");
                        System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                        Scanner sc1 = new Scanner(System.in);
                        if (sc1.next().equalsIgnoreCase("nej"))
                            exit = true;
                        break;
                    }


                case 2:
                    exit = true;
                    break;
            }
        }
    }
}