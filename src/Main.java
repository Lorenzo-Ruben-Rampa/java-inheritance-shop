import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Prodotto p1 = new Prodotto(Prodotto.generatoreCodice(), "Cavo USB", "Euronics", new BigDecimal("9.99"), new BigDecimal("0.22"));
        System.out.println("\nCodice: " + p1.getCodice());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Marca: " + p1.getMarca());
        System.out.println("Prezzo: " + p1.generatorePrezzoFinale());
        System.out.println("-------------------------------------");

        Smartphone p2 = new Smartphone(Prodotto.generatoreCodice(), "Smartphone 5G", "Samsung", new BigDecimal("799.99"), new BigDecimal("0.22"));;
        System.out.println("Codice: " + p2.getCodice());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Marca: " + p2.getMarca());
        System.out.println("Prezzo Finale: " + p2.generatorePrezzoFinale());
        System.out.println("RAM: " + p2.getMemoriaRam());
        System.out.println("Codice IMEI: " + p2.getCodiceIMEI());
        System.out.println("-------------------------------------");

        Televisore p3 = new Televisore(Prodotto.generatoreCodice(), "OLED 4K", "LG", new BigDecimal("1299.99"), new BigDecimal("0.22"), 55, true);
        System.out.println("Codice: " + p3.getCodice());
        System.out.println("Nome: " + p3.getNome());      
        System.out.println("Marca: " + p3.getMarca());
        System.out.println("Prezzo: " + p3.generatorePrezzoFinale());
        System.out.println("Dimensioni: " + p3.getdimensioni() + " pollici");
        System.out.println("Smart TV: " + (p3.isIssmartTV() ? "Disponibile" : "Non disponibile"));
        System.out.println("-------------------------------------");

        Cuffia p4 = new Cuffia(Prodotto.generatoreCodice(), "Cuffie Bluetooth", "Sony", new BigDecimal("89.99"), new BigDecimal("0.22"), "Nero", false);

        System.out.println("Codice: " + p4.getCodice());
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Marca: " + p4.getMarca());
        System.out.println("Prezzo: " + p4.generatorePrezzoFinale());
        System.out.println("Colore: " + p4.getColore());
        System.out.println("Wireless: " + (p4.isWireless() ? "Disponibile" : "Non disponibile"));
        System.out.println("-------------------------------------");
    }
}
