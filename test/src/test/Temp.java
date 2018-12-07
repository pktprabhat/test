package test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.attribute.UserPrincipal;


import java.net.*;

public class Temp {
	public static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) throws Exception {
		Socket s=new Socket("www.gmail.com",	43);
		
		InputStream in=s.getInputStream();
		OutputStream out=s.getOutputStream();
		
		String str="blackbuck.com";
		byte[] buf=str.getBytes();
		out.write(buf);
		int c;
		while((c=in.read())!=-1) {
			System.out.println((char)c);
		}
		s.close();
		
		
		
		
		
		
		
		
		
		
		
		
		/*InetAddress addr1=InetAddress.getLocalHost();
		System.out.println(addr1);
		
		InetAddress[] addr2=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<addr2.length;++i)
		System.out.println(addr2[i]);
		
		String addr5;//=InetAddress.getHostAddress();
		//System.out.println(addr5);
		
		byte[] addr=new byte[] {(byte) 192,121,1,2};
		addr5=addr2[1].isMCGlobal()
				
		System.out.println(addr1);
		
		
		
		
		
		
		File f=new File("/input1.txt");
		p(f.getName());
		p(f.getPath());
		p(f.getParent());
		p(f.getAbsolutePath());
		p(f.getCanonicalPath());
		p(f.canExecute()?"execute":"not execute");
		p(f.canRead()?"read":"not read");
		p(f.canWrite()?"write":"not write");
		p(f.createNewFile()?"created":"not created");
		p(f.exists()?"exist":"not exist");
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());
		System.out.println(f.isAbsolute());
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		System.out.println(f.lastModified());
		System.out.println(f.mkdir());
		System.out.println(f.length());
		
		f.delete();*/
		
		
	}

}
