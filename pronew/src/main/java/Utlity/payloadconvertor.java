package Utlity;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class payloadconvertor {
	//Basically to convert the body in to string
	public static String generatepayloadString(String filename) throws IOException
	{
		//String filepath =System.getProperty("user.dir")+"\\resources\\" +filename;
		String filepath =System.getProperty("E:\\Selenium-Workspace\\Rest Assured\\pronew\\resource") + filename;
		return new String(Files.readAllBytes(Paths.get(filepath)));
	}

}
