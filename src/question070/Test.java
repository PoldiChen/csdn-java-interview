package question070;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * ͳ���ļ����������ַ������ֵĴ���
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
		while ((line = bufferedReader.readLine()) != null) { // ��ȡ��һ��
			int index = -1;
			while ((line.length() >= str.length()) && (index = line.indexOf(str)) >= 0) { // ͳ�Ƶ�ǰ�е����ַ�����
				count ++;
				line = line.substring(index + str.length());
			}
		}
		return count;
	}

}
