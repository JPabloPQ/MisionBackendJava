package HarryPotter;

import HarryPotter.magoBruja;

public class magoBrujaPerfil {
    public static void main(String[] args) throws InterruptedException {
        testPersonaje();
    }



    private static void testPersonaje() throws InterruptedException {
        magoBruja Harry = new magoBruja(
                1,
                "Harry Potter",
                "Grffindore",
                "Masculino",
                "Dementor",
                "Venado"
        );


        magoBruja Hermione = new magoBruja(
                2,
                "Hermione Granger",
                "Grffidore",
                "Femenino",
                "Fracaso",
                "Nutria"
        );

        magoBruja Ron = new magoBruja(
                3,
                "Ronald Weasley",
                "Grffindore",
                "Masculino",
                "Aragog",
                "Jack Russell terrier"

        );

        magoBruja Luna = new magoBruja(
                4,
                "Luna Scamander",
                "Ravenclaw",
                "Feminino",
                "Desconocido",
                "Liebre"
        );

        magoBruja Neville = new magoBruja(
                5,
                "Neville Longbottom",
                "Giffindore",
                "Masculino",
                "Serverus Snape",
                "No corporeo"

        );


        System.out.println(Harry.showMessage());
        System.out.println(Hermione.showMessage());
        System.out.println(Ron.showMessage());
        System.out.println(Luna.showMessage());
        System.out.println(Neville.showMessage());


    }

}
