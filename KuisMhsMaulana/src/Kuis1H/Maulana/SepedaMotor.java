package Kuis1H.Maulana;

public class SepedaMotor {
        String merk;
        int kecepatan;
        boolean nyala;
        SepedaMotor(String merk){
            this.merk= merk;
            this.kecepatan=0;
            this.nyala= false;
        }
        void nyalakanMotor() {
            this.nyala= true;
        }
        void matikanMotor() {
            this.nyala= false;
            this.kecepatan=0;
        }
        void tambahKecepatanMotor(int c) {
            this.kecepatan += c;
        }
        void kurangiKecepatanMotor(int c) {
            this.kecepatan -= c;
        }
        void info() {
            System.out.println("Sepeda motor merk "+this.merk+" memiliki kecepatan "+ this.kecepatan);
        }
}
