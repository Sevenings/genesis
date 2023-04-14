import java.util.*;

public class Coisa {
    private String nome;
    private int durabilidade;
    private List<Material> materiais;
    //private List<Efeito> efeitos;

    public Coisa(String nome, int durabilidade, List<Material> materiais) {
        setNome(nome);
        setDurabilidade(durabilidade);
        setMateriais(materiais);
    }

    // Getters e Setters
    
    public String getNome() {
        return nome; 
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.maateriais = materiais;
    }

    public boolean addMaterial(Material material) {
        return materiais.add(material);
    }

    public boolean removeMaterial(Material material) {
        return materiais.remove(material);
    }

    /*
    public List<Efeito> getEfeitos() {
        return efeitos;
    }

    public boolean addEfeito(Efeito efeito) {
        return efeitos.add(efeito);
    }

    public boolean removeEfeito(Efeito efeito) {
        return efeitos.remove(efeito);
    }
    */
}
