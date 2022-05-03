package MonaOctocat;

public class Scubatocat extends octocatSuperClass{
    public static void main(String[] args) {
        new Scubatocat();
    }
    public Scubatocat(){
        setId(4);
        setNombre("Scubatocat");
        setOutfit("Traje de buzo");
        setAccion("Buceando");
        System.out.println(showMessage());
        verbo();
    }

    @Override
    public void verbo() {
        System.out.println("Saludando a un pez globo <3");
    }
}
