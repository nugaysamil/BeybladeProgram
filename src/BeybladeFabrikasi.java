

public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beyblade_turu) {

        if(beyblade_turu.equals("Dragon")) {

            return new Dragon("Tako" , 800, 300, "Mavi Ejderha","Kutsal Canavarla Konusma");

        }
        else if (beyblade_turu.equals("Dranza")) {

            return new Dranza("Kai",600,400,"Kirmizi Anka Kusu");
        }
        else if (beyblade_turu.equals("Drayga")) {

            return new Dranza("Kai",600,400,"Beyaz Kaplan");

    }
        else if (beyblade_turu.equals("Draciel")) {

            return new Dranza("Max",200 ,100,"Kaya Kaplumbağa");



        }
        else {
        return null;

        }
    }

    }
