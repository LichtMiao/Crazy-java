package com.Licht._15;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
/*
*直接将FileChannel的全部数据映射成ByteBuffer
*然后通过FileChannel输出
 */
public class FileChannelTest{
	public static void main(String[] args){
		File f = new File("F:\\eclipsework\\Crazy-java\\src\\com\\Licht\\_15\\FileChannelTest.java");
		try(FileChannel inChannel = new FileInputStream(f).getChannel();
			FileChannel outChannel = new FileOutputStream(f).getChannel();){
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			//将ByreBuffer中的数据写入FileChannel中输出
			outChannel.write(buffer);
			buffer.clear(); // 复原position、limit的位置
			/*---为了能打印文件，使用的Charset类和CharsetDecoder类
			将ByteBuffer转换成CharBuffer---*/
			//使用forName(字符集名称)创建GBK字符集对象
			Charset charset = Charset.forName("GBK");
			//创建解码器对象，使用解码器将ByteBuffer转换成CharBuffer
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer);
		}
		catch(IOException ioe){ioe.printStackTrace();}
	}
}