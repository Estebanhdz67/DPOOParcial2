
package logica;

public class Parcial {

    public String calcularRaices(double a, double b, double c) throws Exception {
        if(!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(c)) {
            throw new Exception("Numeros invalidos");
        }else if(a == 0) {
            throw new Exception("No es ecuacion de 2 grado");
        }else {
            double discriminante = b*b - 4*a*c;

            if(!Double.isFinite(discriminante)) {
                throw new Exception("No se pueden calcular las raices");
            }else if(discriminante < 0) {
                throw new Exception("raices complejas");
            }else {
                double x1 = (-b + Math.sqrt(discriminante))/(2*a);
                double x2 = (-b - Math.sqrt(discriminante))/(2*a);

                if(!Double.isFinite(x1) || !Double.isFinite(x2)) {
                    throw new Exception("No se pueden calcular las raices");
                }else {
                    return "x=" + x1 + ", x= " + x2;
                }
            }
        }
    }
}
