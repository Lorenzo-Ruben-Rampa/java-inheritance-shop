import java.math.BigDecimal;

public class Cuffie extends Prodotto  { 

    // Attributi
    protected String colore;
    protected boolean Iswireless;

    // 1° Costruttore
    public Cuffie(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean Iswireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.Iswireless = false;
    }

    //Getters e Setters
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isIswireless() {
        return Iswireless;
    }

    public void setIswireless(boolean iswireless) {
        Iswireless = iswireless;
    }
}
