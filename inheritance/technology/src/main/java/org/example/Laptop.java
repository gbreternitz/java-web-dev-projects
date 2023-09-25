package org.example;

public class Laptop extends Computer {

    private Boolean hdmiPortAvailable = true;

    public Laptop(String webBrowser, String operatingSystem, String screenResolution) {
        super(webBrowser, operatingSystem, screenResolution);
    }

    public void connectHDMI(){
        if (hdmiPortAvailable){
            System.out.println("Connection successful - HDMI port available.");
            hdmiPortAvailable = false;
        } else {
            System.out.println("Connection failed - HDMI port already in use.");
        }
    }

    public void disconnectHDMI(){
        hdmiPortAvailable = false;
        System.out.println("HDMI disconnected.");
    }

}
