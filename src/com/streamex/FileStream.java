package com.streamex;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStream {

	public static void main(String[] args) throws IOException {
		//Path path=Path.getFileName();
				//Pa("/Lambada/src/com/streamex/file1.txt");		
		
		Path path=Paths.get("D:\\SB-Test\\dev\\Java8Functional\\Lambada\\src\\com\\streamex\\file1.txt");
		 //Path path = FileSystems.getDefault().getPath("/Lambada/src/com/streamex/", "file1.txt");
		try (Stream<String> lines=Files.lines(path);)
		{
			long count =lines.count();
			System.out.println(count);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
			
			
	
	}

}
