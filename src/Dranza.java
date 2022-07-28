public class Dranza extends Beyblade {

    private String kutsalCanavar;

    @Override
    public void kutsalCanaverOrtayaCikar() {
        System.out.println(getBeybladci()+ "" + kutsalCanavar + " 'i ortaya cikariyor.. " );
        System.out.println(getBeybladci()+ " in Saidirisi : Alev Kilici");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : " + kutsalCanavar);
    }


    public Dranza(String beybladci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
}
