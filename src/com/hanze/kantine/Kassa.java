package com.hanze.kantine;

public class Kassa {

    private KassaRij kassaRij;
    private double kasInhoud;
    private int aantalArtikelen;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassaRij = new KassaRij();
        this.kasInhoud = 0;
        this.aantalArtikelen = 0;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        this.kasInhoud += klant.getTotaalPrijs();
        this.aantalArtikelen += klant.getArtikelen().size();
    }

    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int getAantalArtikelen() {
        return aantalArtikelen;
    }
    /**
     * Geeft het totaalbedrag van alle artikelen die de kass
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
       return this.kasInhoud;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        this.kasInhoud = 0;
        this.aantalArtikelen = 0;
    }

    /**
     * @return int
     */
    public KassaRij getKassaRij() {
        return kassaRij;
    }

    /**
     * @param kassaRij
     */
    public void setKassaRij(KassaRij kassaRij) {
        this.kassaRij = kassaRij;
    }

    /**
     * @return int
     */
    public double getKasInhoud() {
        return kasInhoud;
    }

    /**
     * @param kasInhoud
     */
    public void setKasInhoud(double kasInhoud) {
        this.kasInhoud = kasInhoud;
    }

    /**
     * @param aantalArtikelen
     */
    public void setAantalArtikelen(int aantalArtikelen) {
        this.aantalArtikelen = aantalArtikelen;
    }
}