package com.Licht._15;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.Date;
import java.util.List;
/*
*AttributeView读取、修改文件的属性
*/
public class AttributeViewTest{
	public static void main(String[] args)
		throws Exception{
			Path testPath = Paths.get(""); 
			//访问基本属性的BasicFileAtrributeView
			BasicFileAttributeView basicView = Files.getFileAttributeView(
				testPath, BasicFileAttributeView.class);
			//访问基本属性的BasicFileAttributes
			BasicFileAttributes basicAttribs = basicView.readAttributes();
			System.out.println("创建时间：" + new Date(basicAttribs
				.creationTime().toMillis()) + "\n最后访问时间：" + new Date(basicAttribs
				.lastAccessTime().toMillis()) + "\n最后修改时间：" + new Date(basicAttribs
				.lastModifiedTime().toMillis())+ "\n文件大小：" + basicAttribs.size());
			//获取文件属主信息FileOwnerAttributeView
			FileOwnerAttributeView ownerView = Files.getFileAttributeView(
				testPath, FileOwnerAttributeView.class);
			//获取该文件所属用户
			System.out.println(ownerView.getOwner());
			//获取访问自定义属性的FileOwnerAttributeView
			UserDefinedFileAttributeView userView = Files.getFileAttributeView(
				testPath, UserDefinedFileAttributeView.class);
			//return a list containing names of user-defined attributes
			List<String> attrName = userView.list();
			for (String name : attrName){
				ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
				userView.read(name,buf); //read the value of user-defined attribute into a buffer
				buf.flip();
				String value = Charset.defaultCharset().decode(buf).toString();
				System.out.println(name + "--->" + value);
			}
			//add user-defined attribute
			userView.write("发行者", Charset.defaultCharset()
				.encode("版本"));
		}
}