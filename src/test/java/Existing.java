import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;

public class Existing {

    public static void main(String[] args) {

        PepList peplist = new PepList();
        ArrayList<String> names = peplist.getlist();


        boolean nameexistin = false;
        for (int z = 0; z < names.size(); z++) {
            if (StringUtils.equalsIgnoreCase("mette frederiksen 19.11.1977", names.get(z))) {
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
