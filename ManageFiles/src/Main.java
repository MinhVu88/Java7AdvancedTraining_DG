import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("files/loremipsum.txt");
		
		System.out.println("\n" + source.getFileName());
		
		// copy files
		Path target = Paths.get("files/newFile.txt");
		
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		
		//Files.copy(source, target);
		
		/*
		// delete files
		Path toDelete = Paths.get("files/toDelete.txt");
		
		Files.delete(toDelete);
		
		System.out.println("\nfile deleted");
		*/
		
		// create a new directory & move files into it
		Path newDir = Paths.get("files/newDir");
		
		Files.createDirectories(newDir);
		
		Files.move(source, newDir.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		
		
	}

}
