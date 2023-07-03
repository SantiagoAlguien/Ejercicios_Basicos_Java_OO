public class CrearCuernta {
    public static void main(String[] args) {
       

 //se crea objeto cuenta1 sin parámetros
 //se ejecuta el constructor por defecto
 Cuenta cuenta1 = new Cuenta();

cuenta1.setNombre("Santiago");
 System.out.println("Nombre : "+ cuenta1.getnombre());
cuenta1.setNumero("231332");
 System.out.println("Número de cuenta : " + cuenta1.getnumero());
cuenta1.setTipoInteres(0.32);
 System.out.println("Tipo de interes : "+ cuenta1.gettipoInteres());
cuenta1.setSaldo(1000);
 System.out.println("Saldo: "+ cuenta1.getsaldo());
 
 //se crea el objeto cuenta2 con los valores leidos por teclado
 //se ejecuta el constructor con parámetros
Cuenta cuenta2 = new Cuenta("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);                       

Cuenta cuenta3 = new Cuenta(cuenta1);

//mostrar los datos de cuenta1
 System.out.println("Datos de la cuenta 1");
 System.out.println("Nombre del titular: " + cuenta1.getnombre());
 System.out.println("Número de cuenta: " + cuenta1.getnumero());
 System.out.println("Tipo de interés: " + cuenta1.gettipoInteres());
 System.out.println("Saldo: " + cuenta1.getsaldo());
 System.out.println();

//se realiza un ingreso en cuenta1
 cuenta1.ingreso(32131);

//mostrar el saldo de cuenta1 después del ingreso
 System.out.println("Saldo: " + cuenta1.getsaldo());

 //mostrar los datos de cuenta2
 System.out.println("Datos de la cuenta 2");
 System.out.println("Nombre del titular: " + cuenta2.getnombre());
 System.out.println("Número de cuenta: " + cuenta2.getnumero());
 System.out.println("Tipo de interés: " + cuenta2.gettipoInteres());
 System.out.println("Saldo: " + cuenta2.getsaldo());
 System.out.println();

  //mostrar los datos de cuenta3
 System.out.println("Datos de la cuenta 3");
 System.out.println("Nombre del titular: " + cuenta3.getnombre());
 System.out.println("Número de cuenta: " + cuenta3.getnumero());                                         
 System.out.println("Tipo de interés: " + cuenta3.gettipoInteres());
 System.out.println("Saldo: " + cuenta3.getsaldo());
 System.out.println();

  //realizar una transferencia de 10€ desde cuenta3 a cuenta2
 cuenta3.transferencia(cuenta2, 1000);

 System.out.println("Saldo de la cuenta 2");
 System.out.println("Saldo: " + cuenta2.getsaldo());
 System.out.println();
}
}
