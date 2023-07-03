public class Libro {
    //Datos del objecto
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    //Constructo por defecto 
    public Libro(){
    }

    //Constructor con parametros
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    //Getters 
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getEjemplares(){
        return ejemplares;       
    }

    public int getPrestados(){
        return prestados;
    }

    //Setters
    public void SettTitulo(String titulo){
        this.titulo = titulo;
    }

    public void settAutor(String autor){
        this.autor = autor;
    }   

    public void settEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    public void settPrestados(int prestados){
        this.prestados = prestados;
    }

    //Método préstamo de libro debe ser boelano 
    public boolean prestado(){
        boolean prestado = true;
        if(prestados < ejemplares){
            prestados++;
        }else{
            prestado = false;
        }
        return prestado;
    }

    //Metodo de velolucion de un libro
    public boolean devolucion(){
        boolean devuelto = true;
        if (prestados == 0) {
            devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
    }

    //método toString sobrescrito para mostrar los datos de la clase Libro
    @Override
    public String toString(){
        return "titulo " + titulo + "auntor "+ autor + "ejemplares" + ejemplares + "prestados " + prestados;
    }

}