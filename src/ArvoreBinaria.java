public class ArvoreBinaria {
    No raiz;

    public int contadorNo(No raiz){
        if (raiz == null){
            return 0;
        } else {
            return 1 + contadorNo(raiz.esquerdo) + contadorNo(raiz.direito);
        }
    }

}