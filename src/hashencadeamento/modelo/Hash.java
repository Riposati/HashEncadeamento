package hashencadeamento.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Hash {

    private final List<ArrayDeChaves> vetPai;
    private ArrayDeChaves arrayChaves;

    public Hash(int tamanhoHash) {

        vetPai = new ArrayList<>(tamanhoHash);

        for (int i = 0; i < tamanhoHash; i++) {
            arrayChaves = new ArrayDeChaves();
            vetPai.add(this.arrayChaves);
        }
    }

    public void addArray(int chave) {

        int funcaoHash = chave % this.vetPai.size();

        Chave chaveKey = new Chave();
        chaveKey.setChave(chave);

        vetPai.get(funcaoHash).getChaves().add(chaveKey);

    }

    public int pesquisaArray(int chave) {

        int funcaoHash = chave % this.vetPai.size();
        int valor = 0, i=1;

        Set<Chave>listaChaves = vetPai.get(funcaoHash).getChaves();
        
        for (Chave chaveFor : listaChaves) {
            
            if (chaveFor.getChave() == chave) {
                valor = i;
                break;
            }
            i++;
        }
        System.out.println("Posição no hash onde está essa chave = " + (funcaoHash + 1));
        return valor;
    }

    @Override
    public String toString() {
        return "Hash{" + vetPai;
    }
}
