public class Draciel extends Beyblade{

    private String kutsalCanavar;

    @Override
    public void kutsalCanaverOrtayaCikar() {
        System.out.println(getBeybladci()+ "" + kutsalCanavar + " 'i ortaya cikariyor.. " );
        System.out.println(getBeybladci()+ " in Savunmasi : Kale savunmasi");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adi : " + kutsalCanavar);
    }

    public Draciel(String beybladci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }
}
