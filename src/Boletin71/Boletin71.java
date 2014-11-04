package Boletin71;
//@author dpazolopez

public class Boletin71 {

    public static void main(String[] args) {
        short num1, num2;
        Numeros obxecto = new Numeros();
        num1= obxecto.pedirDato();
        num2= obxecto.pedirDato();
        obxecto.setNum1(num1);
        obxecto.setNum2(num2);
        obxecto.Condicion();
      /*  Scanner dato = new Scanner(System.in);
        System.out.println("dato1:");
        obxecto.setNum1(dato.nextShort());
        System.out.println("dato2:");
        obxecto.setNum2(dato.nextShort());
        obxecto.getNum1();
        obxecto.getNum2();
        obxecto.Condicion();*/
    }

}
