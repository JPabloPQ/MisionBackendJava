package MonaOctocat;

public class SaintNictocat extends octocatSuperClass{
    public static void main(String[] args) {
        new SaintNictocat();
    }

    public SaintNictocat(){
        setId(5);
        setNombre("Saint Nictocat");
        setOutfit("Traje de Santa claus");
        setAccion("Tocando la campana mientras trae regalos");
        System.out.println(showMessage());
        verbo();

    }

    @Override
    public void verbo() {
        System.out.println("Feliz navidad a todos!!");
    }
}
