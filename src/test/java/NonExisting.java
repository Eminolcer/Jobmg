import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class NonExisting {
    public static void main(String[] args) {

        PepList peplist = new PepList();
        ArrayList<String> names = peplist.getlist();


        boolean nameexistin = false;
        for (int z = 0; z < names.size(); z++) {
            if (StringUtils.equalsIgnoreCase("Emin Olcer 01.16.2001", names.get(z))) {
                System.out.println("Denne person er PEP-listet");
                nameexistin = true;

            }
            if (!nameexistin) {
                System.out.println("Denne person findes ikke på PEP-Listen");
                break;
            }
        }
    }
}
