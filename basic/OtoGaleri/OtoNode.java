package OtoGaleri;

public class OtoNode {

        String model;
        String plaka;
        String marka;
        String renk;
        String aciklama;
        int alisFiyati;
        double satisFiyati;

        OtoNode next;

        public OtoNode(String model, String plaka, String marka, String renk, String aciklama, int alisFiyati) {
            this.model = model;
            this.plaka = plaka;
            this.marka = marka;
            this.renk = renk;
            this.aciklama = aciklama;
            this.alisFiyati = alisFiyati;
            this.satisFiyati=alisFiyati* (12/10);
            next=null;
        }

    }


