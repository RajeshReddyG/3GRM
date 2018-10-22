import java.util.*;
import java.io.File;
class FileInfo
{
	static void p(String s)
	{
		System.out.println(s);
	}
	public static void main(String args[])
	{
		File f1=new File("E:/Education/Materials/OOP/asd.txt");
		p("FileName:"+f1.getName());
		p("Path:"+f1.getPath());
		p("AbsPath"+f1.getAbsolutePath());
		p("Parent:"+f1.getParent());
		p(f1.exists()?"exits":"does not exits");
		p(f1.canWrite()?"is writeable":"is not writeable");
		p(f1.canRead()?"is readable":"is not readable");
		p("is"+(f1.isDirectory()?" ":"not"+"a directory"));
		p(f1.isFile()?"is normal file":" might be a named pipe");
		p(f1.isAbsolute()?"is absolute":"is not absolute");
		p("file last modified:"+f1.lastModified());
		p("file size:"+f1.length()+"Bytes\n\n\n\n\n");
		
	}
}
