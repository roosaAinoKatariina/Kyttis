package varaus.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a train.
 *
 */
public class Juna {

	private final String nimi;
    private final String tyyppi;  // Voisi luoda class Tyyppi, joka ois höyry- tai diesel
    private final boolean[] paikat;

    /**
     * Default constructor.
     */
    public Juna() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     * 
     * @param nimi
     * @param tyyppi
     */
    public Juna(String nimi, String tyyppi) {
        this.nimi = nimi;
        this.tyyppi = tyyppi;

        // Some initial dummy data, just for convenient testing.
        this.paikat = new boolean[60];
    }

    public String getnimi() {
        return nimi;
    }

    public void setFirstName(String nimi) {
        this.nimi = nimi;
    }
	
	
}
