import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import com.lynda.javatraining.filetree.FileFinder;

public class Main {

	public static void main(String[] args) {

		Path topLevelDir = Paths.get("files");
		
		FileFinder fileFinder = new FileFinder("file*.txt");
		
		try {
			Files.walkFileTree(topLevelDir, fileFinder);
		
		} catch (IOException e) {
			System.out.println("\n" + e.getMessage());
		}
		
		ArrayList<Path> foundFiles = fileFinder.getFoundFiles();
		
		// check if there's any files found in the foundFiles ArrayList
		if (foundFiles.size() > 0) {
			
			for (Path p : foundFiles) {
				try {
					System.out.println("\n" + p.toRealPath(LinkOption.NOFOLLOW_LINKS));
				
				} catch (IOException e) {
					System.out.println("\n" + e.getMessage());
				}
			}
			
		} else {
			System.out.println("\n\tno files found");
		}

	}
	
}
