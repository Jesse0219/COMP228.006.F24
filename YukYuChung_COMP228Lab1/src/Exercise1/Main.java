package Exercise1;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singers singer1 = new Singers();
        //default
        System.out.println("Original default Singer Information:");
        singer1.displaySingerDetails();

        //1 argument
        singer1.setSingerId(8);
        System.out.println("\nOne argument Display:");
        singer1.displaySingerDetails();

        //2 arguments
        singer1.setSingerId(8);
        singer1.setSingerName("Hugh Jackman");
        System.out.println("\nTwo arguments Display:");
        singer1.displaySingerDetails();

        //3 arguments
        singer1.setSingerId(8);
        singer1.setSingerName("Hugh Jackman");
        singer1.setSingerAddress("99 New York Street");
        System.out.println("\nThree arguments Display:");
        singer1.displaySingerDetails();

        //4 arguments
        singer1.setSingerId(8);
        singer1.setSingerName("Hugh Jackman");
        singer1.setSingerAddress("99 New York Street");
        singer1.setDateOfBirth(new Date(68,10,12));
        System.out.println("\nFour arguments Display:");
        singer1.displaySingerDetails();


        //5 arguments
        singer1.setSingerId(8);
        singer1.setSingerName("Hugh Jackman");
        singer1.setSingerAddress("99 New York Street");
        singer1.setDateOfBirth(new Date(68,10,12));
        singer1.setNoOfAlbPublished(3);
        System.out.println("\n(Five argument)Value updated of Hugh Jackman: ");
        singer1.displaySingerDetails();

        //Set All the values
        singer1.setWhole(6,"Zac Efron","88 California Street",new Date(87,10,18),28);
        System.out.println("\n(SetAll)Value updated of Zac Efron: ");
        singer1.displaySingerDetails();
    }
}
