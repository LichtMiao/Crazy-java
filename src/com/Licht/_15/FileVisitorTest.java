package com.Licht._15;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/*
*使用Visitor遍历文件和子目录
*/
public class FileVisitorTest{
	public static void main(String[] args)
		throws Exception{
			//遍历F:\eclipsework\Crazy-java\src\com\Licht\_15目录下所有文件和子目录
			Files.walkFileTree(Paths.get("F:", "eclipsework"
				, "Crazy-java", "src", "com", "Licht", "_15")
				, new SimpleFileVisitor<Path>(){ //SimpleFileVisitor是FileVisitor的实现类
				//访问文件时触发该方法
				@Override
				public FileVisitResult visitFile(Path file
					, BasicFileAttributes attrs) throws IOException{
					System.out.println("系统正在访问" + file + "文件");
					if (file.endsWith("FileVisitor.java")){
						System.out.println("已找到目标文件");
						return FileVisitResult.TERMINATE;
					}
					return FileVisitResult.CONTINUE;
				}
				//开始访问目录时触发该方法
				@Override
				public FileVisitResult preVisitDirectory(Path dir
					, BasicFileAttributes attrs) throws IOException{
					System.out.println("正在访问" + dir + "路径");
						return FileVisitResult.CONTINUE;
				}
			});
		}
}