import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import javax.swing.*;
import java.io.IOException;

public class plugin {
    public static void main(String[] args) throws IOException {
        String nome = JOptionPane.showInputDialog("Nombre del repositorio");
        String descripcion = JOptionPane.showInputDialog("Descripcion");

        GitHub github = GitHubBuilder.fromPropertyFile("").build();

        GHRepository repo = github.createRepository(nome,descripcion,
                "https://github.com/LeilaRomero",false);

    }

}
