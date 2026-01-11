import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        String nombreUsuario = "Peon";
        double cuenta = 1500.00;
        int opcion = 0;

        System.out.println("\n*************************************");
        System.out.println("Nombre del cliente: " + nombreUsuario);
        System.out.println("Saldo en Cuenta: " + cuenta);
        System.out.println("*************************************");



        String menuTiendas = """
                *** Eliga la tienda a la que desea acceder ***
                1 - Xbox
                2 - Amazon
                3 - Shein
                4 - Servicios de suscripciones
                9 - Cerrar la app
                """;

        //Lo siguiente son los menus para cada una de las tiendas.
        String menuDeXbox = """
                *** Bienveido a Xbox ***
                1 - Compra de licencias de juegos digitales
                2 - Compra de juegos físicos
                0 - Volver al menú principal
                """;

        String menuDeAmazon = """
                *** Bienvenido a Amazon ***
                1 - Comprar productos electrónicos
                2 - Comprar libros
                3 - Comprar accesorios y varios
                0 - Volver al menú principal
                """;

        String menuDeShein = """
                *** Bienvenido a Shein ***
                1 - Comprar ropa
                2 - Comprar calzado
                3 - Comprar accesorios
                0 - Volver al menú principal
                """;

        String serviciosDeSuscripcion = """
                *** Servicios de suscripción disponibles ***
                1 - Netflix
                2 - Spotify
                3 - Amazon Prime
                0 - Volver al menú principal
                """;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> historialCompras = new ArrayList<>();

        while (opcion != 9) {
            Collections.sort(historialCompras, (c1, c2) -> {
                double p1 = Double.parseDouble(
                        c1.substring(c1.indexOf("($") + 2, c1.indexOf(")"))
                );
                double p2 = Double.parseDouble(
                        c2.substring(c2.indexOf("($") + 2, c2.indexOf(")"))
                );
                return Double.compare(p1, p2);
            });

            System.out.println("\n===== HISTORIAL DE COMPRAS (de menor a mayor gasto) =====");

            if (historialCompras.isEmpty()) {
                System.out.println("No se realizaron compras.");
            } else {
                for (String compra : historialCompras) {
                    System.out.println("- " + compra);
                }
            }
            System.out.println(menuTiendas);
            opcion = teclado.nextInt();

            if (opcion == 1) {
                int opcionXbox = -1;
                while (opcionXbox != 0) {
                    System.out.println(menuDeXbox);
                    opcionXbox = teclado.nextInt();

                    double precio = 0;
                    String descripcion = "";

                    if (opcionXbox == 1) {
                        precio = 120;
                        descripcion = "xbox - Licencia digital ($120)";
                    } else if (opcionXbox == 2) {
                        precio = 200;
                        descripcion = "xbox - Juego físico ($200)";
                    } else if (opcionXbox == 0) {
                        System.out.println("Volviendo al menú principal...");
                        continue;
                    } else {
                        System.out.println("Error, elija una opción válida");
                        continue;
                    }

                    if (cuenta >= precio) {
                        cuenta -= precio;
                        historialCompras.add(descripcion);
                        System.out.println("Compra realizada. Saldo restante: " + cuenta);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            } else if (opcion == 2) {
                int opcionAmazon = -1;
                while (opcionAmazon != 0) {
                    System.out.println(menuDeAmazon);
                    opcionAmazon = teclado.nextInt();

                    double precio = 0;
                    String descripcionCompra = "";

                    if (opcionAmazon == 1) {
                        precio = 350;
                        descripcionCompra = "Amazon - Electrónicos ($350)";
                    } else if (opcionAmazon == 2) {
                        precio = 80;
                        descripcionCompra = "Amazon - Libros ($80)";
                    } else if (opcionAmazon == 3) {
                        precio = 150;
                        descripcionCompra = "Amazon - Accesorios ($150)";
                    } else if (opcionAmazon == 0) {
                        System.out.println("Volviendo al menú principal...");
                        continue;
                    } else {
                        System.out.println("Error, elija una opción válida");
                        continue;
                    }

                    if (cuenta >= precio) {
                        cuenta -= precio;
                        historialCompras.add(descripcionCompra);
                        System.out.println("Compra realizada. Saldo restante: " + cuenta);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            } else if (opcion == 3) {
                int opcionShein = -1;
                while (opcionShein != 0) {
                    System.out.println(menuDeShein);
                    opcionShein = teclado.nextInt();

                    double precio = 0;
                    String descripcion = "";

                    if (opcionShein == 1) {
                        precio = 100;
                        descripcion = "Shein - Polera ($100)";
                    } else if (opcionShein == 2) {
                        precio = 180;
                        descripcion = "Shein - Pantalón ($180)";
                    } else if (opcionShein == 3) {
                        precio = 60;
                        descripcion = "Shein - Accesorio ($60)";
                    } else if (opcionShein == 0) {
                        System.out.println("Volviendo al menú principal...");
                        continue;
                    } else {
                        System.out.println("Error, elija una opción válida");
                        continue;
                    }

                    if (cuenta >= precio) {
                        cuenta -= precio;
                        historialCompras.add(descripcion);
                        System.out.println("Compra realizada. Saldo restante: " + cuenta);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            } else if (opcion == 4) {
                int opcionSuscripcion = -1;
                while (opcionSuscripcion != 0) {
                    System.out.println(serviciosDeSuscripcion);
                    opcionSuscripcion = teclado.nextInt();

                    double precio = 0;
                    String descripcion = "";

                    if (opcionSuscripcion == 1) {
                        precio = 45;
                        descripcion = "Suscripción - Netflix ($45)";
                    } else if (opcionSuscripcion == 2) {
                        precio = 30;
                        descripcion = "Suscripción - Spotify ($30)";
                    } else if (opcionSuscripcion == 3) {
                        precio = 40;
                        descripcion = "Suscripción - Disney+ ($40)";
                    } else if (opcionSuscripcion == 0) {
                        System.out.println("Volviendo al menú principal...");
                        continue;
                    } else {
                        System.out.println("Error, elija una opción válida");
                        continue;
                    }

                    if (cuenta >= precio) {
                        cuenta -= precio;
                        historialCompras.add(descripcion);
                        System.out.println("Suscripción activada. Saldo restante: " + cuenta);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                }
            }else {
                System.out.println("Error, elija una opción válida");
            }
        }
    }
}