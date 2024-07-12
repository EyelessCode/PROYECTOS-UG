public class App {
    static class PrediccionPrecio {
        public int dia;
        public double precio;
        
        public PrediccionPrecio(int dia,double precio){
            this.dia=dia;
            this.precio=precio;
        }
    }

    public static double inteLineal(double x0, double y0, double x1, double y1, double x) {
        return y0 + (y1 - y0) * ((x - x0) / (x1 - x0));
    }

    public static double extrapolateLinear(double x0, double y0, double x1, double y1, double x) {
        return inteLineal(x0, y0, x1, y1, x);
    }
    public static void main(String[] args) throws Exception {
    }
}
