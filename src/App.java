import modulos.Vetor;

public class App {
    public static void main(String[] args) throws Exception {

        Vetor vetor = new Vetor(10);
        
            vetor.adicionar("phedro");
            vetor.adicionar("henrick");
            vetor.adicionar("da silva");
            vetor.adicionar("Leão");
         System.out.println(vetor.toString());
    
    }
}
