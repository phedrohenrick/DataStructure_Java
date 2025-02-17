import modulos.Vetor;

public class App {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);
        
            vetor.adiciona("phedro");
            vetor.adiciona("henrick");
            vetor.adiciona("da silva");
            vetor.adiciona("Leão");

            vetor.adiciona(4, "marcelino");
            vetor.adiciona(1, "jose");
         System.out.println(vetor.toString());
    
    }
}
