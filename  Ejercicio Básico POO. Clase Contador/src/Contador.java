public class Contador {

    //unico atributo 
    private int cont;

    //Constructor por defecto 
    public Contador(){
    }

    //constructor con parámetros
    public Contador(int cont){
        if (cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }

    //Copia cosntructor 
    public Contador(final Contador c){
        cont = c.cont;
    }

    //getters 
    public int getContador(){
        return cont;
    }

    //setters 
    public void setContador(int cont){
        if(cont < 0){
            this.cont = 0;
        }else{
            this.cont = cont;
        }
    }

    //método incrementar contador
    public void incrementar() {
        cont++;
    }

    //metedo para desimcrementar 
    public void desinmcrementar(){
        cont --;
        if(cont < 0){
            this.cont = 0;
        }
    }
}