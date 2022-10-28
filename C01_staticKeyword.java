package ders22_statickeyword;

public class C01_staticKeyword {
    static String hastaneIsmi="Yildiz hastanesi";
    static String hastaneAdresi="Cankaya / Ankara";
    static String basHekimi="mehmet yildiz";
    String personelIsim="isim belitilmedi";

    @Override
    public String toString() {
        return "C01_staticKeyword{" +
                "personelIsim='" + personelIsim + '\'' +
                ", personelAdresi='" + personelAdresi + '\'' +
                ", personelTelefon='" + personelTelefon + '\'' +
                ",hastane ismi:"+hastaneIsmi + "\nhastene adresi"+ hastaneAdresi +
                '}';
    }

    String personelAdresi="adres belitilmedi";
    String personelTelefon="telefon belitilmedi";

}
