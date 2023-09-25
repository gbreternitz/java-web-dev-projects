package org.example;

public class Computer extends AbstractEntity {

    private String webBrowser;
    private String operatingSystem;
    private String ScreenResolution;

    public Computer(String webBrowser, String operatingSystem, String screenResolution) {
        this.webBrowser = webBrowser;
        this.operatingSystem = operatingSystem;
        this.ScreenResolution = screenResolution;
    }

    public void accessInternet(){

        System.out.println("Opening the " + webBrowser + " window to access the internet.");
    }

    public void reboot() {
        System.out.println("Rebooting -- shutting down " + operatingSystem + " and power-cycling.");
    }

    //Getters and Setters


    public String getWebBrowser() {
        return webBrowser;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getScreenResolution() {
        return ScreenResolution;
    }

}
