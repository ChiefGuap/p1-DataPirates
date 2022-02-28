package com.example.sping_portfolio.controllers;
public class RAlamWeek5Q1Model {
    private String hostName;
    private String address;
    private String invitee;
    private Object String;

    public RAlamWeek5Q1Model(String n, String a, String b) {
        hostName = n;
        address = a;
        invitee = b;
    }

    public RAlamWeek5Q1Model() {
        hostName = "Host";
        address = "Address";
        invitee = "Invitee";
    }

    public RAlamWeek5Q1Model(String b) {
        address = b;
        hostName = "Host";
        invitee = "Invitee";
    }

    public String returnHost() {
        return hostName;
    }

    public String returnAddress() {
        return address;
    }

    public String returnInvitee() {
        return invitee;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
    }

    public void updateHostName(String newHostName) {
        hostName = newHostName;
    }

    public void updateInvitee(String newInvitee) {
        invitee = newInvitee;
    }

    public java.lang.String sendInvite(java.lang.String host, java.lang.String address, java.lang.String invitee) {
        return host;
    }


//    public java.lang.String sendInvite(java.lang.String host, java.lang.String address, java.lang.String invitee) {
  //  }
}



   // public String sendInvite(String invitee) {
      //  public String sendInvite(String hostName, String ;address, String invitee) {
        //    return "Dear " + invitee + ", please attend my event at " + address + ". See you then, " + hostName + ".";
    //    }