public class Circulo {
    private double coordX;
    private double coordY;
    private double raio;

    public Circulo() {
        this(0,0,1);
       // coordX = 0;
       // coordY = 0;
       // raio = 1;
    }

    public Circulo(double umX, double umY, double umRaio) {
        this.coordX = umX;
        this.coordY = umY;
        this.raio = umRaio;
    }

    public void move(double novoX, double novoY) {
        coordX = novoX;
        coordY= novoY;
    }

    public void zoom(double fator) {
        raio = raio * fator;
    }

    public double area() {
        return Math.PI * Math.pow(raio,2);
    }

    public String toString() {
        //return "circulo: centro(" + coordx + "," + coordY +")"...
        return String.format("circulo: centro(%.3f,%.3f), raio=%.3f",
                    coordX, coordY, raio);
    }


}
