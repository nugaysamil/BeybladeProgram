public class Dragon extends Beyblade{
    private String kutsalCanavar;
    private String GizliYetenek;


    @Override
    public void kutsalCanaverOrtayaCikar() {
        System.out.println(getBeybladci()+ "" + kutsalCanavar + " 'i ortaya cikariyor.. " );
        System.out.println(getBeybladci()+ " in Saldirisi : Hayalet kasirga");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adi : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " +GizliYetenek);
    }

    public Dragon(String beybladci, int donusHizi, int saldiriGucu, String kutsalCanavar, String GizliYetenek) {

        super(beybladci, donusHizi, saldiriGucu);
        this.GizliYetenek = GizliYetenek;
        this.kutsalCanavar = kutsalCanavar;
    }
}
