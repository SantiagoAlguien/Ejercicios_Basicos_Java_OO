public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        conversiones();
    }

    static void conversiones(){
        int var = 10;
        int var1 = 1;

        System.out.println("Suma de 1 + 1 = "+ (var + var1));
        System.out.println("resta de 1 - 1 = "+ (var - var1));
        System.out.println("multiplo de 1 * 1 = "+ (var * var1));
        System.out.println("division de 1 % 1 = "+ (var % var1));

    }
}