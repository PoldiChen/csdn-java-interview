package question071;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> allFiles = getFiles("e://@test");
		for (String fileName : allFiles) {
			System.out.println(fileName);
		}
	}
	
	public static List<String> getFiles(String path) {
		List<String> result = new ArrayList<String>();
		File directory = new File(path);
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				result.add(file.getName());
			} else {
				return getFiles(file.getPath());
			}
		}
		return result;
	}

}
