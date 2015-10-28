package hashencadeamento.modelo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gurip_000
 */
public class ArrayDeChaves {

    private Set<Chave> chaves;

    public ArrayDeChaves() {

        chaves = new HashSet<>();
    }

    public Set<Chave> getChaves() {
        return chaves;
    }

    public void setChaves(Set<Chave> chaves) {
        this.chaves = chaves;
    }

    @Override
    public String toString() {
        return "ArrayDeChaves{" + "chaves=" + chaves + '}';
    }

}
