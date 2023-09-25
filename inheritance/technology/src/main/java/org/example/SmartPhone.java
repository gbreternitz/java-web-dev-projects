package org.example;

public class SmartPhone extends Computer  {

    private String phoneNumber;

    public SmartPhone(String webBrowser, String operatingSystem, String screenResolution, String phoneNumber) {
        super(webBrowser, operatingSystem, screenResolution);
        this.phoneNumber = phoneNumber;
    }

    public void callMom() {
        System.out.println("Dialing Mom from the phone number: " + phoneNumber + ".");
    }
}
