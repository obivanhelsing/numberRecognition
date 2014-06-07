package pattern;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import javax.naming.BinaryRefAddr;
import javax.swing.text.html.Option;

public class MainClass {
	
	
	static InputStream in;
	
	public static void main(String[] args){
		
			Path f = Paths.get(new File("").getAbsolutePath()+"/src/pattern/data0.htm");
			
			try {
				in = Files.newInputStream(f,new OpenOption[] {StandardOpenOption.READ});
				byte b[] = new byte[784];
				in.read(b);
				for(int i=0;i<28;i++){
					for(int j=0;j<28;j++){
						int c = (int)b[i*28+j];
						
						 if(c<0)
		                   {
		                      c += 256;
		                      if(c > 128 )
		                          c = 1; 
		                      else    
		                         c = 0; 
		                       
		                   }
		                   else
		                   {
		                      if(c> 128 )
		                         c = 1; 
		                      else    
		                          c = 0; 
		                    
		                   }
						 System.out.print(c+" ");
					}
					System.out.println();
	             }
						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("New input stream açılmadı dostum: ");
			}

}
}
