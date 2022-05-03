package MonaOctocat;

public class Nuxtocat extends octocatSuperClass {
    public static void main(String[] args) throws InterruptedException {
        new Nuxtocat();
    }

    public Nuxtocat(){
        setId(1);
        setNombre("NUXtocat");
        setOutfit("Clasico");
        setAccion("Jugar con olograma");
        System.out.println(showMessage() + verbo("Hola!"));

    }

    public void verbo(){
        System.out.println("n.n");
    }
}
