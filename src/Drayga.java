public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beybladci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanaverOrtayaCikar() {
        System.out.println(getBeybladci()+ "" + kutsalCanavar + " 'i ortaya cikariyor.. " );
        System.out.println(getBeybladci()+ " in Saidirisi : Kaplan Pencesi");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : " + kutsalCanavar);
    }
}
