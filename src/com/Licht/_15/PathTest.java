package com.Licht._15;
/*
 * Path接口的用法
 */
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest{
	public static void main(String[] args)
		throws Exception{
			//以当前路径创建Path对象
			Path path = Paths.get(".");
			System.out.println("path里包含的路径数量：" 
				+ path.getNameCount() + "\n根路径为：" //返回路径所包含的路径名称的数量
				+ path.getRoot());
			//获取path的绝对路径
			Path absolutePath = path.toAbsolutePath();
			System.out.println("absulutePath的绝对路径：" 
				+ absolutePath + "\nabsulutePath的根路径为："
				+ absolutePath.getRoot() + "\n获取绝对路径的数量："
				+ absolutePath.getNameCount()); 
			//以多个String来构建Path对象
			Path path2 = Paths.get("g:", "public", "codes");//将多个字符串连缀成路径
			System.out.println(path2); //g:\public\codes
		}
}