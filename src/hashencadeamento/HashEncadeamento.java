package hashencadeamento;

import hashencadeamento.modelo.Hash;

public class HashEncadeamento {

    public static void main(String[] args) {
        
        Hash hash = new Hash(7);

        hash.addArray(15);
        hash.addArray(12);
        hash.addArray(25);
        hash.addArray(17);
        hash.addArray(21);
        hash.addArray(22);
        hash.addArray(18);
        hash.addArray(7);
        hash.addArray(5);
        hash.addArray(0);
        hash.addArray(1);
        hash.addArray(2);
        hash.addArray(3);
        hash.addArray(4);

        System.out.println(hash);
        int valor = hash.pesquisaArray(22);
        System.out.println("Posição na lista onde está essa chave = " + valor);
    }

}
