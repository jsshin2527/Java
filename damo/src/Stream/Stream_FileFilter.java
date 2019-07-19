package Stream;

import java.io.File;
import java.io.FileFilter;

//FileFilter �������̽� 
//�ش� �ڵ��� ��ü�� 2�� �����ϴ°����� 
//��ü�� �����԰� ���ÿ� �ʱ�ȭ�� �߽��ϴ�. 
//File Ŭ������ ����ϸ鼭 ������ ��ü�� �����߽��ϴ�. 
class MyFileList implements FileFilter{
	
	private File f;
	
	//���� ���� ��θ� �ٰ��ε� ��ü�� �ҷ��ﶧ ��θ� �������ְ� �ʹ� 
	//****** �ſ� �߿� *******
	public MyFileList(String filepath) {
		f = new File(filepath);
	}
	
	public void result() {
		
		try {
			
			if(!f.exists()) {
				System.out.println("������ �����ϴ�");
				return;
			}
			System.out.println("���� ��� : "+f.getAbsolutePath());
			System.out.println("���� ũ�� : "+f.length());
			//���� �о�� ������ ���丮�ϰ�� 	
			if(f.isDirectory()) {
			
				File[] lists = f.listFiles(this/*�˾Ƽ� ��ο� ������ �մϴ� Accept���� �Ѿ� �ɴϴ�. */);
				
				System.out.println("\n���� ��� .....");
				for (int i = 0; i < lists.length; i++) {
					//File file = lists[i];
					System.out.print(lists[i].getName());
					System.out.println("\t "+lists[i].length());
				}
			}
			System.out.println("\n ��Ʈ �����丮 ����");
			
			File[] root = File.listRoots();
			
			for (int i = 0; i < root.length; i++) {
				System.out.println(root[i].getPath());
			}
			
			//C:
			//D:
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	@Override
	public boolean accept(File pathname) {
		
		return pathname.isFile() || pathname.isDirectory();
		//return pathname.isFile();
		//return pathname.isDirectory(); 
	}
	
}

public class Stream_FileFilter {

	public static void main(String[] args) {
		
		MyFileList nf = new MyFileList("d:\\java\\eclipse");		
		nf.result();
	}
}
