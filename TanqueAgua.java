
public class TanqueAgua {

    private double capacidadMaximaLitros;
    private double nivelActualLitros;


    public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros) {

        if (capacidadMaximaLitros <= 0 || nivelActualLitros < 0
                || nivelActualLitros > capacidadMaximaLitros) {
            throw new IllegalArgumentException(
                    "Los valores del tanque no son válidos"
            );
        }

        this.capacidadMaximaLitros = capacidadMaximaLitros;
        this.nivelActualLitros = nivelActualLitros;
    }


    public void llenar(double litros) {

        if (litros < 0) {
            throw new IllegalArgumentException(
                    "Los litros no pueden ser negativos"
            );
        }

        nivelActualLitros = Math.min(
                nivelActualLitros + litros,
                capacidadMaximaLitros
        );
    }


    public void consumir(double litros) {

        if (litros < 0) {
            throw new IllegalArgumentException(
                    "Los litros no pueden ser negativos"
            );
        }

        if (litros > nivelActualLitros) {
            throw new IllegalArgumentException(
                    "No hay suficiente agua en el tanque"
            );
        }

        nivelActualLitros -= litros;
    }


    public double calcularPorcentaje() {
        return (nivelActualLitros / capacidadMaximaLitros) * 100;
    }


    public double getNivelActualLitros() {
        return nivelActualLitros;
    }
}
