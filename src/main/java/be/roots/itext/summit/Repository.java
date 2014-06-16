package be.roots.itext.summit;

import java.io.File;

/**
 * Created by koen on 9-06-14.
 */
public class Repository {

    public static CarPass findOneCarPass() {
        return new CarPass();
    }

    public static File findCarPassPDFTemplate() {
        return new File( "src/main/resources/templates/car-pass-template.pdf" );
    }
}
