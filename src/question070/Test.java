package question070;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 统计文件内容中子字符串出现的次数
 * @author Administrator
 *
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		int count = countStr("e://test.txt", "ab");
		System.out.println(count);
	}
	
	@SuppressWarnings("resource")
	public static int countStr(String filePath, String str) throws IOException {
		FileReader fileReader = new FileReader(filePath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int count = 0;
		String line = null;
		while ((line = bufferedReader.readLine()) != null) { // 读取出一行
			int index = -1;
			while ((line.length() >= str.length()) && (index = line.indexOf(str)) >= 0) { // 统计当前行的子字符串数
				count ++;
				line = line.substring(index + str.length());
			}
		}
		return count;
	}

}
