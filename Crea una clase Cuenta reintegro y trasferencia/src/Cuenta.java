//entidad cuenta:
class Cuenta {
    private String nombre;
    private String numero;
    private double tipoInteres;
    private double saldo ;


    //Constructor sin parametros 
    public Cuenta(){
    }

    //Constructor con parametros 
    public Cuenta(String nombre, String numero, double tipoInteres, double saldo){
        this.nombre = nombre;
        this.numero = numero;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    //Costructor copia superficial
    public Cuenta(Cuenta cuenta){
        this.nombre = cuenta.nombre;
        this.numero = cuenta.numero;
        this.tipoInteres = cuenta.tipoInteres;
        this.saldo = cuenta.saldo;
    }

    //Getters
    public String getnombre(){
        return nombre;
    }

    public String getnumero(){
        return numero;
    }

    public double gettipoInteres(){
        return tipoInteres;
    }

    public double getsaldo(){
        return saldo;
    }

    //Setters
    public void setNombre( String nombre){
        this.nombre = nombre;
    }

    public void setNumero( String numero){
        this.numero = numero;
    }

    public void setTipoInteres( double tipoInteres){
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo( double saldo){
        this.saldo = saldo;
    }

    //Metodo de ingreso 
    public boolean ingreso (double n){
        boolean numeroIncorrectos = true;
        if (n < 0) {
            numeroIncorrectos = false;
        }else{
            saldo = saldo + n;
        }
        return numeroIncorrectos;
    }

    //Metodo de reintegro 
    public boolean reintegro (double n){
        boolean reintegroCorrecto = true;

        if(n < 0){
            reintegroCorrecto = false;
        }else if(saldo >= n){
            saldo-=n;
        }else{
            reintegroCorrecto = false;

        }return reintegroCorrecto;
    }

    //método transferencia
    public boolean transferencia(Cuenta c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}