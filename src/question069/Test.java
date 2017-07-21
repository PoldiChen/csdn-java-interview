/**
 * @project csdn-java-interview
 * @package question069
 * @file Test.java
 * @author chenxihong
 */
package question069;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/** 
 * Class: Test
 * date: 2017年7月21日 下午9:17:03
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public class Test {
	
	public static void main(String[] args) throws IOException {
		fileCopyNIO("e://aaa.txt", "e://ddd.txt");
	}
	
	public static void fileCopy(String source, String target) throws IOException {
		InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(target);
		try {
			byte[] buffer = new byte[4096];
			int bytesToRead;
			while ((bytesToRead = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytesToRead);;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			out.close();
			in.close();
		}
	}
	
	public static void fileCopyNIO(String source, String target) throws IOException {
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
		FileChannel inChannel = in.getChannel();
		FileChannel outChannel = out.getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
		try {
			while (inChannel.read(byteBuffer) != -1) {
				byteBuffer.flip();
				outChannel.write(byteBuffer);
				byteBuffer.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			inChannel.close();
			outChannel.close();
			in.close();
			out.close();
		}
	}

}
