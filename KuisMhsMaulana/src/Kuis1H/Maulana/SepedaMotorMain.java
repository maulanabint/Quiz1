package Kuis1H.Maulana;

public class SepedaMotorMain {
    public static void main(String[] args) {
        SepedaMotor spd = new SepedaMotor("Yamaha");
        spd.nyalakanMotor();
        spd.tambahKecepatanMotor(10);
        spd.info();
        spd.kurangiKecepatanMotor(10);
        spd.info();
        spd.matikanMotor();
        spd.info();
        System.out.println("");

    }

}
