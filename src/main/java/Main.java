import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PepList peplist = new PepList();
        ArrayList<String> names = peplist.getlist();

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
                    System.out.println("Opstillingen skal se således ud: fulde navn og dd.mm.yyyy");
                    String nameSearch = myObj.nextLine();  // Read user input

                    for (int z = 0; z < names.size(); z++) {
                        if (StringUtils.equalsIgnoreCase(nameSearch, names.get(z))) {
                            System.out.println("Denne person er PEP-listet");

                            nameExist = true;


                            System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                            Scanner sc1 = new Scanner(System.in);
                            if (sc1.next().equalsIgnoreCase("nej"))
                                exit = true;
                        }
                    }

                    if (!nameExist) {
                        System.out.println("Denne person findes ikke på PEP-Listen");
                        System.out.println("Vil du fortsætte? Indtast Ja / Nej");
                        Scanner sc2 = new Scanner(System.in);
                        if (sc2.next().equalsIgnoreCase("nej"))
                            exit = true;
                    }
                    break;


                case 2:
                    System.out.println(names);
                    break;

                case 3:
                    exit = true;
                    break;


                default:
                    System.out.println("Du bedes vælge et tal mellem 1-3");
                    break;
            }
        }
    }
}
