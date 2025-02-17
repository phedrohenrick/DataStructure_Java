package modulos;
public class Vetor {

    private String[] elementosVetor;
    private int tamanho;

    public Vetor(int capacidade){
            this.elementosVetor = new String[capacidade];
            this.tamanho = 0;
    }

    // public void adicionar(String elemento){
    //     for(int i = 0; i < elementosVetor.length; i++){
    //         if(elementosVetor[i] == null){
    //             elementosVetor[i] = elemento;
    //             break;
    //         }
    //     }
    // }

    // public void adicionar(String elemento) throws ArrayIndexOutOfBoundsException{
    //     // preciso verificar se a capacidade do elementosVetor não é menor que a quantidade de elementos
    //     if(this.tamanho < this.elementosVetor.length){ 
    //         this. elementosVetor[this.tamanho] = elemento;
    //     this.tamanho++;
        
    //     }else{
    //         throw new ArrayIndexOutOfBoundsException("Capacidade do vetor estourou");
    //     }
        
    // } 

    public boolean adicionar(String elemento){
        // preciso verificar se a capacidade do vetor não é menor que a quantidade de elementos
        if(this.tamanho < this.elementosVetor.length){ 
            this. elementosVetor[this.tamanho] = elemento;
        this.tamanho++;
        return true;
        }
        return false;
        
    } 

    public int getTamanho(){
        return this.tamanho;
    }

    public String busca(int posicao){

        if(!(posicao>0 && posicao<=tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementosVetor[posicao];
    }

    @Override
    public String toString(){

       StringBuilder s = new StringBuilder();
       s.append("[");

       for(int i = 0; i<this.tamanho-1; i++){ //vai ate a penultima posição
              s.append(this.elementosVetor[i]);
              s.append(", ");
       }

       if(this.tamanho>0){
           s.append(this.elementosVetor[this.tamanho-1]); //acessa a ultima posição
       }

       s.append("]");
        return  s.toString(); //dessa forme ele não consegue acessar somente ate o tamanho atual do vetor
    }


}
