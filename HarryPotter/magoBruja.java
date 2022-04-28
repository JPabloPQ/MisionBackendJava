package HarryPotter;

public class magoBruja {
    private int id;
    private String nombre;
    private String casa;
    private String genero;
    private String boggart;
    private String patronums;

    public magoBruja(int id, String nombre, String casa, String genero, String boggart, String patronums){
        this.id = id;
        this.nombre = nombre;
        this.casa = casa;
        this.genero = genero;
        this.boggart = boggart;
        this.patronums = patronums;
    }

    public int getId(){return id;}

    public String getNombre(){return nombre;}

    public String getCasa(){return casa;}

    public String getGenero(){return genero;}

    public String getBoggart(){return boggart;}

    public String getPatronums(){return patronums;}

    public boolean setId(int id){
        if(id>0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre =  nombre;
            return true;

        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return  true;
        }else
            return false;
    }

    public  boolean setBoogart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;

        }else
            return false;
    }

    public boolean setPatronums(String patronums){
        if(!patronums.isEmpty()){
            this.patronums = patronums;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return "Nombre: " + nombre +
                "\nGenero: " + genero +
                "\nCasa: " + casa +
                "\nBoggart: " + boggart +
                "\nPatronus: " + patronums +
                "\n =================";
    }



}
