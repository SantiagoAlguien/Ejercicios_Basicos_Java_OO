public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        funcion();
    }
    
    static void funcion(){
        var num1 = 11;
        var num2 = 19;


        if (num1 == num2){
            System.out.println(num1 +" es igual a " +num2);
        }else if(num1 > num2){
            System.out.println(num1 +" es mayor a " +num2);
        }else if(num2 > num1){
            System.out.println(num2 +" es mayor a " +num1);
        }
    }
}
