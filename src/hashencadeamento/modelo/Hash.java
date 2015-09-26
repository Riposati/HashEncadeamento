package hashencadeamento.modelo;

import java.util.ArrayList;
import java.util.List;

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
        int valor = -1, i;
        boolean flag = false;

        List<Chave> listaChaves = vetPai.get(funcaoHash).getChaves();

        for (i = 0; i < listaChaves.size() && flag == false; i++) {

            if (listaChaves.get(i).getChave() == chave) {
                valor = i;
                flag = true;
            }
        }
        System.out.println("Posição no hash onde está essa chave = " + funcaoHash);
        return valor;
    }

    @Override
    public String toString() {
        return "Hash{" + vetPai;
    }
}
