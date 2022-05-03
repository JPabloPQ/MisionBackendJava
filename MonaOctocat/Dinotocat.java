package MonaOctocat;

public class Dinotocat extends octocatSuperClass{
    public static void main(String[] args) {
        new Dinotocat();
    }
    public  Dinotocat(){
        setId(6);
        setNombre("Dinotocat");
        setOutfit("Traje de dinosaurio");
        setAccion("Aplastando un escarabajo");
        System.out.println(showMessage());
        verbo();

    }

    @Override
    public void verbo() {
        System.out.println("Raaaaawww :3");
    }
}
