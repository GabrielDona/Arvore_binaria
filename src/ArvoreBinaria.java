import java.util.Queue;

public class ArvoreBinaria {
    No raiz;

    public int contadorNo(No raiz){
        if (raiz == null){
            return 0;
        } else {
            return 1 + contadorNo(raiz.esquerdo) + contadorNo(raiz.direito);
        }
    }

    public void percorrerPreOrdem(No raiz){
        if (raiz != null){
            System.out.println(raiz.valor + ' ');
            percorrerPreOrdem(raiz.esquerdo); 
            percorrerPreOrdem(raiz.direito);
            }
    }
    
    public void percorrerEmOrdem(No raiz){
        if(raiz != null){
            percorrerEmOrdem(raiz.esquerdo);
            System.out.println(raiz.valor + ' ');
            percorrerEmOrdem(raiz.direito);
        }
    
    }

    public void percorrerPosOrdem(No raiz){
        if (raiz!= null){
            percorrerPosOrdem(raiz.esquerdo);
            percorrerPosOrdem(raiz.direito);
            System.out.println(raiz.valor + ' ');
        }
    }

    public void percorrerEmNivel(){
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.println(atual.valor + ' ');

            if (atual.esquerdo != null) fila.add(atual.esquerdo);
            if (atual.direito != null ) fila.add(atual.direito);
        }
    }
}