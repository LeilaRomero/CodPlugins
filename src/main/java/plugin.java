import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import java.io.File;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

import static org.eclipse.jgit.util.FileUtils.mkdirs;

public class plugin {
    public static void main(String[] args) throws IOException, GitAPIException {

        // Perdir para clonar el repositorio.
        String clonar = JOptionPane.showInputDialog("Clonar repositorio");

        //Se clona el repositorio indicado en la url.
        Git git = Git.cloneRepository ().setURI ("https://github.com/LeilaRomero/CodPlugins").setDirectory ((new File("/home/local/DANIELCASTELAO/lromerofajar/Escritorio/Cod_Examen/"))).setCloneAllBranches(true).call();

        git.close();
        
    }

}
