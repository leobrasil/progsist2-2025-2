import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeitorLivros {
    public static void main(String[] args){
        Path arq_livros = Paths.get("aula0_intro_excecoes/livro.txt");
        System.out.println("iniciando processo de leitura");

        String livros[];
        try {
            System.out.println("Iniciando abertura do arquivo");
            livros = Files.readAllLines(arq_livros).toArray(new String[0]);
            System.out.println("terminou de ler o arquivo");
            for (String livro : livros) {
                System.out.println(livro);
            }
        } catch (IOException e) {
            System.out.println("deu erro, e agora?");

            e.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Terminando o programa");
        
    }
}