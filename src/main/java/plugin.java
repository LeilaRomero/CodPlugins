import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;


import javax.swing.*;
import java.io.IOException;

public class plugin {

    public static void main(String[] args) throws IOException {



        String nombre = JOptionPane.showInputDialog(null,"Teclea tu nombre de usuario");
        String contraseña = JOptionPane.showInputDialog(null,"Teclea tu contraseña de usuario");
        GitHub github = new GitHubBuilder().withPassword(nombre, contraseña).build();


        GHRepository repo = github.createRepository(
                "plugins tres ramas","ramas para el proyecto",
                "https://google.com",false/*private*/);
        repo.addCollaborators(github.getUser("damiancastelao"));

    }
}
