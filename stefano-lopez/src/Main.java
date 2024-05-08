import javax.management.Descriptor;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        // Creación de objetos sillas
        Chair c1 = new Chair(10, "Silla Gamer", 170790d, true);
        Chair c2 = new Chair(20, "Silla Hogareña", 38900d, false);
        Chair c3 = new Chair(50, "Silla Oficina", 80320d, true);


        // Creación de objetos escritorios
        Desktop d1 = new Desktop(10, "Escritorio Gamer", 140800d, 70.0d, 80.0d);
        Desktop d2 = new Desktop(20, "Escritorio Hogareño", 49500d, 30.0d, 60.0d);
        Desktop d3 = new Desktop(13, "Escritorio Oficina", 120800d, 80.0d, 90.0d);


        // Creación de objetos impresora
        Printer p1 = new Printer(30, "Impresora Industrial", 604000d, "Epson", 160);
        Printer p2 = new Printer(10, "Impresora Hogareña", 140000d, "Brother", 30);
        Printer p3 = new Printer(5, "Impresora Oficina", 190000d, "HP", 70);


        // Creación de objetos notebook
        Notebook n1 = new Notebook(5, "Notebook Gamer", 1340000d, "MSI", 1024);
        Notebook n2 = new Notebook(9, "Notebook Hogareña", 450000d, "Lenovo", 256);
        Notebook n3 = new Notebook(3, "Notebook Oficina", 795000d, "ASUS", 512);

        // Agregamos los productos a la lista de productos
        List<Product> products = new ArrayList<>();
        products.add(c1);
        products.add(c2);
        products.add(c3);
        products.add(d1);
        products.add(d2);
        products.add(d3);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(n1);
        products.add(n2);
        products.add(n3);

        // Muestro lista de productos
        System.out.println("\n---LISTADO DE PRODUCTOS---\n");
        for(Product p : products){
            System.out.println(p);
        }

        // Aplico descuento a una silla e impresora
        System.out.println("\n---¡¡¡OFERTAS ESPECIALES!!!---\n");
        System.out.println("La " + c1.getName() + " con 50% de descuento queda en $" + c1.applyDiscount(50.0));
        System.out.println("La " + p3.getName() + " con 30% de descuento queda en $" + c1.applyDiscount(30.0));

        // Se actualiza el precio de los productos
        System.out.println("\n---ACTUALIZACIÓN DE PRECIOS---\n");
        for(Product p : products){

            Double percent = 0.0;

            switch (p.getClass().getName()) {
            case "Chair":
                percent = 5d;
                break;
            case "Desktop":
                percent = 10d;
                break;
            case "Printer":
                percent = 15d;
                break;
            case "Notebook":
                percent = 20d;
                break;
             default:
                break;
            }

            System.out.println(p.getName() + " -----> Precio anterior: $" + p.getPrice() + " -----> Precio actualizado: $" + p.updatePrice(percent));
        }
    }
}