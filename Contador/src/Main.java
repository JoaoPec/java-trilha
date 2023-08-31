public class Main {

    public static void main(String[] args) throws ArgsException {

        int firstArg = Integer.parseInt(args[0]);
        int secondArg = Integer.parseInt(args[1]);

        try {
            int index = getIndex(firstArg, secondArg);

            for (int count = 1; count < index; count++) {
                System.out.println("Imprimindo o número " + count);
            }

        } catch (ArgsException e) {
            System.out.println("The first arg must be bigger than the second");
        }

    }

    public static int getIndex(int args1, int args2) throws ArgsException {

        if (args1 < args2) {
            int index = args2 - args1;
            return index;
        } else {
            throw new ArgsException();
        }
    }
}
