//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {


        TanqueAgua tanque = new TanqueAgua(1000, 300);


        tanque.llenar(500);


        tanque.consumir(200);


        tanque.llenar(600);


        System.out.println("Nivel actual: "
                + tanque.getNivelActualLitros() + " litros");

        System.out.println("Porcentaje de llenado: "
                + tanque.calcularPorcentaje() + "%");
    }
}
