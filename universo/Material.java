package universo;

import java.util.*;

public class Material {
    private String nome;
    public List<String> propriedades = new ArrayList<String>();

    public Material(String nome, List<String> propriedades) {
        this.nome = nome;
        this.propriedades = propriedades;
    }
}
