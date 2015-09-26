/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashencadeamento.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gurip_000
 */
public class ArrayDeChaves {

    private List<Chave> chaves;

    public ArrayDeChaves() {

        chaves = new ArrayList<>();
    }

    public List<Chave> getChaves() {
        return chaves;
    }

    public void setChaves(List<Chave> chaves) {
        this.chaves = chaves;
    }

    @Override
    public String toString() {
        return "ArrayDeChaves{" + "chaves=" + chaves + '}';
    }

}
