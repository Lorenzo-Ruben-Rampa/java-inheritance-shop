import java.math.BigDecimal;

public class Cuffia extends Prodotto  { 

    // Attributi
    protected String colore;
    protected boolean isWireless = false;

    // 1° Costruttore
    public Cuffia(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean isWireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    //Getters e Setters
    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
    this.isWireless = isWireless;
    }
}