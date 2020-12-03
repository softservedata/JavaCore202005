package currency;

abstract public class Currency {
    private int kursNBU;

    public Currency(int baseKurs){
        this.kursNBU = baseKurs;
    }

    public int getKursNBU (){
        return kursNBU;
    }

    public void setKursNBU(int kursNBU) {
        this.kursNBU = kursNBU;
    }
}
