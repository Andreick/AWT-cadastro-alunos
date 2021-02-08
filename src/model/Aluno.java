package model;

public class Aluno {
    
    private String interesses[];
    private String nome;
    private String estado;
    private int curso;

    public Aluno(int tamArray) {
        this.setNome("");
        this.setEstado("");
        this.setCurso(0);
        this.interesses = new String[tamArray];
    }

    public String getInteresse(int i) {
        return interesses[i];
    }
    
    public int getInteressesLen() {
        return interesses.length;
    }

    public void setInteresse(String interesse, int i) {
        this.interesses[i] = interesse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno......: " + this.nome +
             "\nEstado....: " + this.estado +
             "\nCurso......: " + this.curso +
             "\nInteresses:" + getInteresses();
    }
    
    private String getInteresses() {
        String interesses = "";
        int len;
        int i;
        
        len = this.interesses.length;
        
        for (i = 0; i < len; i++) {
            interesses += "\n- " + this.interesses[i];
        }
        
        return interesses;
    }
}
