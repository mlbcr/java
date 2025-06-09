package basico.biblioteca;

public class Livro {
    private int cod_livro;
    private String titulo;
    private int exemplares;

    public Livro(int cod_livro, String titulo, int exemplares){
        this.cod_livro = cod_livro;
        this.titulo = titulo;
        this.exemplares = exemplares;
    }

    public int getCod_livro(){
        return cod_livro;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getExemplares(){
        return exemplares;
    }
    public void reporExemplares(int novos_exemplares){
        this.exemplares += novos_exemplares;
    }
    public void emprestarExemplares(int exemplares_emprestados){
        this.exemplares -= exemplares_emprestados;
    }

    public void mostrarLivro(){
        System.out.printf("Dados do livro atualizados:\nCódigo %d, Título: %s, Exemplares disponíveis: %d\n",
                cod_livro, titulo, exemplares);
    }
}
