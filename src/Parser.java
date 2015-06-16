import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {
	private String fileName;
	private final String mainPattern = "([Р-пр-џ:\\w,]+\\s)+\\s+\\{\\s+([Р-пр-џ:\\w,]+\\s+)+\\}";
	private HashMap<String,String> formField = new HashMap<String,String>();
	
	Parser(String f) throws IOException{
		fileName = f;
		
		
		InputStream iStream = null;
		
		try {
			iStream = new FileInputStream(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		InputStreamReader is = new InputStreamReader(iStream, Charset.forName("CP1251"));
		
		BufferedReader bReader = new BufferedReader(is);
		
		String readedLine; 
		StringBuilder sb = new StringBuilder();
		while ((readedLine = bReader.readLine()) != null) {
			sb.append(readedLine+"\n");
		}
		
		String formDescr = sb.toString();
		
		boolean cont = true;
		//create """"
		formDescr = formDescr.replaceAll("([Р-пр-џ\\w]+\\s)+", "\"$1\"");
		System.out.println(formDescr);
		
		//System.out.println(formDescr);
		//System.out.println(formDescr.matches(mainPattern));
	//	while (cont) {
		
			/*if ((formDescr.equals("")) || !formDescr.matches(mainPattern)) {
				cont = false;
				continue;
			}
			Pattern  ptrn = Pattern.compile(mainPattern);
			Matcher  mtch = ptrn.matcher(formDescr);
			System.out.println(mtch.group());
			
			formDescr = formDescr.replaceAll(mainPattern, "");
			*/
		//} 
		
	}
	

}
