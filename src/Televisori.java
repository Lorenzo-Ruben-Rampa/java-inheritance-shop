import java.math.BigDecimal;

public class Televisori extends Prodotto {

    // Attributi
    protected int dimensioni;
    protected boolean IssmartTV;

    // 1° Costruttore
    public Televisori(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, String risoluzione) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.IssmartTV = false; // Default value, can be set later

    }

    // Getters e Setters
    public int getdimensioni() {
        return dimensioni;
    }

    public void setdimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean isIssmartTV() {
        return IssmartTV;
    }

    public void setIssmartTV(boolean issmartTV) {
        IssmartTV = issmartTV;
    }

}
