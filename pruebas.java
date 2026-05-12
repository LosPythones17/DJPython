import java.util.Scanner;
public class pruebas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Elige una opción: ");
        String input = sc.nextLine();

        int opcion;

        try {
            opcion = Integer.parseInt(input); // convierte String a int
        } catch (NumberFormatException e) {
            System.out.println("❌ Entrada inválida. Debe ser un número entero.");
            return; // o break / continue según tu programa
        }

        switch (opcion) {
            case 1:
                System.out.println("Opción 1 seleccionada");
                break;
            case 2:
                System.out.println("Opción 2 seleccionada");
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}
