package com.vinnytsoi;


public class Contacts {


    private String phoneNo;
    private String name;


    public Contacts(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    
    public String toString(){
        return ("Name: " + this.name + "\nPhone: " + this.phoneNo);
    }


}