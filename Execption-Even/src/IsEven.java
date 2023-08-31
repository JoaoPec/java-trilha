import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) throws EvenException {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        try {
            System.out.println(VerificarNumero(numero));
        } catch (EvenException e) {
            e.printStackTrace();
            System.out.println("O número é impar");
        }
    }

    static String VerificarNumero(int numero) throws EvenException {
        if (numero % 2 == 0) {
            return "O número é pár";
        }
        throw new EvenException();
    }
}

