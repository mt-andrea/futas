/*
 * Made by Andrea Mate.
 * For practice.
 * This is the way!
 */
package futas;

/* @author Máté Andrea */
public class Edzes {

    private int futasID;
    private String datum;
    private int tav, ido;

    public Edzes(int futasID, String datum, int tav, int ido) {
        this.futasID = futasID;
        this.datum = datum;
        this.tav = tav;
        this.ido = ido;
    }

    public int getFutasID() {
        return futasID;
    }

    public String getDatum() {
        return datum;
    }

    public int getTav() {
        return tav;
    }

    public int getIdo() {
        return ido;
    }

    public void setFutasID(int futasID) {
        this.futasID = futasID;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setTav(int tav) {
        this.tav = tav;
    }

    public void setIdo(int ido) {
        this.ido = ido;
    }

}
