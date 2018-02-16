package varaus.model;

	import java.time.LocalDate;

	import javafx.beans.property.IntegerProperty;
	import javafx.beans.property.ObjectProperty;
	import javafx.beans.property.SimpleIntegerProperty;
	import javafx.beans.property.SimpleObjectProperty;
	import javafx.beans.property.SimpleStringProperty;
	import javafx.beans.property.StringProperty;

	/**
	 * Model class for a User.
	 *
	 * Nyt on paljon infoa, tuskin tarvitaan kaikkea.
	 *
	 */
	public class User {

	    private final StringProperty firstName;
	    private final StringProperty lastName;
	    private final StringProperty street;
	    private final IntegerProperty postalCode;
	    private final StringProperty city;
	    private final ObjectProperty<LocalDate> birthday;
	    
	    private String tunnus;
	    private String salasana; 
	    private boolean yp; // ylläpitäjä vai ei

	    /**
	     * Default constructor.
	     */
	    public User() {
	        this(null, null);
	        tunnus = " ";
	        salasana = "0";
	        yp = false;
	    }

	    /**
	     * Konstruktori, jossa meille aluksi oleelliset
	     * Luo tavallisen käyttäjän
	     * ei vielä osaa tarkistaa, onko tunnus jo käytössä
	     * salasana2 lisäksi, niin voisi varmistaa et salasana tulee kaksi kertaa..?
	     * @param tunnus
	     * @param salasana
	     */
	    public User(String tunnus, String salasana){
	        this.tunnus = tunnus;
	        this.salasana = salasana;
	        yp = false;
	        
	        this.firstName = new SimpleStringProperty("Kalle");
	        this.lastName = new SimpleStringProperty("Tavis");
	        	
	        this.street = new SimpleStringProperty("some street");
	        this.postalCode = new SimpleIntegerProperty(1234);
	        this.city = new SimpleStringProperty("some city");
	        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	    }
	    
	    
	    /**
	     * Constructor with some initial data.
	     * 
	     * @param firstName
	     * @param lastName
	     */
	    public User(String firstName, String lastName, String tunnus) {
	        this.firstName = new SimpleStringProperty(firstName);
	        this.lastName = new SimpleStringProperty(lastName);

	        // Some initial dummy data, just for convenient testing.
	        this.street = new SimpleStringProperty("some street");
	        this.postalCode = new SimpleIntegerProperty(1234);
	        this.city = new SimpleStringProperty("some city");
	        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
	    }
	    
	    //---------------------------------------- Getterit ja setterit 

	    public String getFirstName() {
	        return firstName.get();
	    }

	    public void setFirstName(String firstName) {
	        this.firstName.set(firstName);
	    }

	    public StringProperty firstNameProperty() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName.get();
	    }

	    public void setLastName(String lastName) {
	        this.lastName.set(lastName);
	    }

	    public StringProperty lastNameProperty() {
	        return lastName;
	    }

	    public String getStreet() {
	        return street.get();
	    }

	    public void setStreet(String street) {
	        this.street.set(street);
	    }

	    public StringProperty streetProperty() {
	        return street;
	    }

	    public int getPostalCode() {
	        return postalCode.get();
	    }

	    public void setPostalCode(int postalCode) {
	        this.postalCode.set(postalCode);
	    }

	    public IntegerProperty postalCodeProperty() {
	        return postalCode;
	    }

	    public String getCity() {
	        return city.get();
	    }

	    public void setCity(String city) {
	        this.city.set(city);
	    }

	    public StringProperty cityProperty() {
	        return city;
	    }

	    public LocalDate getBirthday() {
	        return birthday.get();
	    }

	    public void setBirthday(LocalDate birthday) {
	        this.birthday.set(birthday);
	    }

	    public ObjectProperty<LocalDate> birthdayProperty() {
	        return birthday;
	    }
	}
	
	
	
