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

    public boolean adiciona(String elemento){
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

        if(!(posicao>=0 && posicao<tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementosVetor[posicao];
    }

    public int busca(String elemento){
           
       for(int i = 0; i<this.tamanho; i++){
           if(this.elementosVetor[i].equals(elemento)){
                return i; //se existir o elemento ele retorna a posição
           }

       }
        return -1;//se nao exisistir o -1 representará que o item nao existe
    }

    public boolean adiciona(int posicao, String elemento){
           posicao = posicao-1; 
        if(posicao<=0 && posicao>tamanho){
            throw new IllegalArgumentException("Posição inválida");
        }

        //0 1 2 3 4 5
       // a b c d + +

        for(int i = this.tamanho-1; i>=posicao; i--){
                this.elementosVetor[i+1] = this.elementosVetor[i]; //serve para nao perder a referencia do elemento que esta na posição que se quer adicionar
        }
        this.elementosVetor[posicao] = elemento; //coloca o elemento no lugar certo
        this.tamanho++;

         return true;
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
