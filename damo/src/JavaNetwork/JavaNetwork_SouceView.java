package JavaNetwork;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URL;

public class JavaNetwork_SouceView extends Frame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;
	
	public JavaNetwork_SouceView() {
		ta = new TextArea();
		add(ta);
		//https -> 인증서 서버필요
		
		tf = new TextField("https://");
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setTitle("HTML , Viewer");
		setSize(400,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JavaNetwork_SouceView();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			String str;
			URL url = new URL(tf.getText());
			
			ta.setText("");
			/*
			//방법1
			InputStream is = url.openStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			*/
			
			//방법2 
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
			while((str=br.readLine())!= null) {
				if(ta.getText().equals("")) {
					ta.setText(str);
				}else {
					ta.setText(ta.getText()+ "\r\n" +str);
				}
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}	
	}
}
