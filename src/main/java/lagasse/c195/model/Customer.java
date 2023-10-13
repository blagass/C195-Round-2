package lagasse.c195.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Customer {
    private ObservableList<Appointment> associatedApps = FXCollections.observableArrayList();
    private String name;
    private String address;
    private int phone;
    private int postalCode;
    private String country;
    private int divisionId;


    private Customer(String name, String address, int phone, int postalCode, String country, int divisionId){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.postalCode = postalCode;
        this.country = country;
        this.divisionId = divisionId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone(){
        return phone;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public int getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(int postalCode){
        this.postalCode = postalCode;
    }

    public String getCountry(){
        return country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public int getDivisionId(){
        return divisionId;
    }

    public void setDivisionId(int divisionId){
        this.divisionId = divisionId;
    }
}
