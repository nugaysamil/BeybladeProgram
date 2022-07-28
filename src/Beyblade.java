public class Beyblade {

    private String beybladci;
    private int saldiriGucu;
    private int donusHizi;


    public Beyblade(String beybladci, int donusHizi, int saldiriGucu) {
        this.beybladci = beybladci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }


    public String getBeybladci() {
        return beybladci;
    }

    public void setBeybladci(String beybladci) {
        this.beybladci = beybladci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;


    }
    public void Saldir() {
        System.out.println(beybladci + " " + saldiriGucu + "ve " + donusHizi + " ile saldiriyo ");

    }
    public void kutsalCanaverOrtayaCikar() {

        System.out.println("Bu beyblade'in kutsal canavari bulunmuyor..");

    }
    public void bilgileriGoster() {

        System.out.println("Beybladeci ismi : "+ beybladci) ;
        System.out.println("Saldiri Gucu : "+ saldiriGucu) ;
        System.out.println("Donus Hizi: "+ donusHizi) ;
    }


}
