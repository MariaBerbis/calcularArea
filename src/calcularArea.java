import java.util.Scanner;

class CalcularArea {
    public static void main(String[] args) {
        /* Objeto Scanner para leer el radio */
        Scanner scanner = new Scanner(System.in);

        // Pide el radio de la circunferencia al usuario
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcula el área (Área = π * r²)
        double area = Math.PI * Math.pow(radio, 2);

        // Muestra el resultado
        System.out.printf("El área de la circunferencia con radio %.2f es: %.2f%n", radio, area);

    }
}
