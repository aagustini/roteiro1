public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Circulo c1 = new Circulo();
        
        System.out.println(c1);
        System.out.println("\t area de c1: " + c1.area());

        Circulo c2 = new Circulo(3, 4, 2);
        System.out.println(c2);
        c2.move(5,9);
        c2.zoom(2);
        System.out.println(c2);
        System.out.println("\t area de c2: " + c2.area());

        Circulo[] lista;

        lista = new Circulo[3];
        lista[0] = c1;
        lista[1] = c2;
        lista[2] = new Circulo(4,5,2);
        

        System.out.println("\n lista de circulos");
        for (int i=0; i<lista.length; i++ ){
            System.out.println(lista[i]);
        }


        System.out.println("\n lista de circulos foreach");
        for (Circulo c : lista ){
            System.out.println(c);
        }









       


    }
}
