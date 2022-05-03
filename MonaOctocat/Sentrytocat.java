package MonaOctocat;

public class Sentrytocat extends octocatSuperClass{
    public static void main(String[] args) {
        new Sentrytocat();

    }

    public Sentrytocat(){
        setId(2);
        setNombre("Sentrytocat");
        setOutfit("Traje de bombero");
        setAccion("Dispaando un chorro de agua con la maguera");
        System.out.println(showMessage());
        verbo();
    }

    @Override
    public void verbo() {
        System.out.println("Apagando el fuegooo!!");
    }
}
