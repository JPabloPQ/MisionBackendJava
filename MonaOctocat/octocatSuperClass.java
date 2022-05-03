package MonaOctocat;

public class octocatSuperClass {
    private int id;
    private String nombre, outfit, accion;

    public octocatSuperClass(){

    }


    octocatSuperClass(int id, String nombre, String outfit, String accion ){
        this.id = id;
        this.nombre = nombre;
        this.outfit = outfit;
        this.accion = accion;
    }

    public int getId() {return id;}
    public String getNombre(){return nombre;}
    public String getOutfit(){return outfit;}
    public String getAccion(){return accion;}

    public boolean setId(int id){
        if(id>0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public  boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setOutfit(String outfit){
        if(!outfit.isEmpty()){
            this.outfit = outfit;
            return true;
        }else
            return false;
    }

    public boolean setAccion(String accion){
        if(!accion.isEmpty()){
            this.accion = accion;
            return true;
        }else
            return false;
    }

    public void verbo(){
        System.out.println("Hola Explorers!");
    }

    public boolean verbo(String saludo){
        if (!saludo.isEmpty()){
            System.out.println(saludo + " 0.0");
            return true;
        }else
            return false;

    }

    public String showMessage(){
        return "Nombre: " + nombre +
                "\nOutfit: " + outfit +
                "\nAccion: " + accion;
    }

}

