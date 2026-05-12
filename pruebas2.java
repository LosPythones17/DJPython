import java.util.Scanner;
public class pruebas2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Opción 1");
                break;
            case "2":
                System.out.println("Opción 2");
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}
