package MonaOctocat;

public class Hulatocat extends octocatSuperClass{
    public static void main(String[] args) {
        new Hulatocat();
    }

    public Hulatocat(){
        setId(3);
        setNombre("Hulatocat");
        setOutfit("Una flor en la oreja y una falta hawaina");
        setAccion("Bailando");
        System.out.println(showMessage());
        verbo();
    }

    @Override
    public void verbo() {
        System.out.println("Alohawai ^_^ /");
    }
}
