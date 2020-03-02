package cuentas1;

import cuentas1.CCuenta1;
import cuentas1.Main.Operativa_cuentaParameter;

public class Main1 {

    public static class MainParameter {
		public String[] args;

		public MainParameter(String[] args) {
			this.args = args;
		}
	}

	public static void main(String[] args)  {
        CCuenta1 cuenta1;
		double saldoActual;
		operativa_cuenta(new Operativa_cuentaParameter());

        cuenta1 = new CCuenta1("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	public static class Operativa_cuentaParameter {
		public Operativa_cuentaParameter() {
		}
	}

	public static float operativa_cuenta(Operativa_cuentaParameter cantidad) {
		CCuenta1 cuenta1;
        double saldoActual;
	}
}