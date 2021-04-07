package com.example.opvarmningsoevelse.businessLogic;

import java.util.Date;

public class Nyhedsindslag {


    String overskrift;

    String teasertekst;

    String videoLink;

    String stilbilledeLink;

    Date udgivelsesdato;

    boolean udgivet;


    public String getOverskrift() {
        return overskrift;
    }

    public void setOverskrift(String overskrift) {
        this.overskrift = overskrift;
    }

    public String getTeasertekst() {
        return teasertekst;
    }

    public void setTeasertekst(String teasertekst) {
        this.teasertekst = teasertekst;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getStilbilledeLink() {
        return stilbilledeLink;
    }

    public void setStilbilledeLink(String stilbilledeLink) {
        this.stilbilledeLink = stilbilledeLink;
    }

    public Date getUdgivelsesdato() {
        return udgivelsesdato;
    }

    public void setUdgivelsesdato(Date udgivelsesdato) {
        this.udgivelsesdato = udgivelsesdato;
    }

    public boolean isUdgivet() {
        return udgivet;
    }

    public void setUdgivet(boolean udgivet) {
        this.udgivet = udgivet;
    }


    public Nyhedsindslag() {
    }

    public Nyhedsindslag(String overskrift, String teasertekst, String stilbilledeLink) {
        this.overskrift = overskrift;
        this.teasertekst = teasertekst;
        this.stilbilledeLink = stilbilledeLink;
    }
}
