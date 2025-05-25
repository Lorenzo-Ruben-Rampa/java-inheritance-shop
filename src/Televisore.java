import java.math.BigDecimal;

public class Televisore extends Prodotto {

    // Attributi
    protected int dimensioni;
    protected boolean IssmartTV = false;

    // 1° Costruttore
    public Televisore(int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, Boolean issmartTV) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.IssmartTV = issmartTV;
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
        this.IssmartTV = issmartTV;
    }

}
