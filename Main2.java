package cuenta2;

import cuenta2.CCuenta2;
import cuenta2.Main2.Operativa_cuentaParameter;

public class Main2 {

    public static class MainParameter {
		public String[] args;

		public MainParameter(String[] args) {
			this.args = args;
		}
	}

	public static void main(String[] args)  {
        CCuenta2 cuenta2;
		double saldoActual;
		operativa_cuenta(new Operativa_cuentaParameter());

        cuenta2 = new CCuenta2("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta2.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta2.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta2.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	public static class Operativa_cuentaParameter {
		public Operativa_cuentaParameter() {
		}
	}

	public static float operativa_cuenta(Operativa_cuentaParameter cantidad) {
		CCuenta2 cuenta2;
        double saldoActual;
	}

}