package JavaWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class JavaSwing_Example2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	private JTextField[] tf = new JTextField[4];
	
	private JButton btn1,btn2;
	private JTable table;
	
	
	public JavaSwing_Example2() {
		
		getContentPane().setLayout(null); //������ ��ġ 
		String[] title = {"�̸�","����","����","����"};
		for (int i = 0; i < title.length; i++) {
			JLabel lbl = new JLabel(title[i]);
			lbl.setBounds(10,(i+1)*30,50,20);
			getContentPane().add(lbl);
			
			tf[i] = new JTextField();
			tf[i].setBounds(80,(i+1)*30,70, 20);
			getContentPane().add(tf[i]);
			
		}
		
		btn1 = new JButton("�߰�");
		btn1.setBounds(10, 160,60,20); 
		btn1.addActionListener(this);
		getContentPane().add(btn1);
		
		btn2 = new JButton("����");
		btn2.setBounds(90, 160,60,20); 
		btn2.addActionListener(this);
		getContentPane().add(btn2);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});	
		addTable();
		setTitle("��ȭ����");
		setSize(600,300);
		setVisible(true);	
		setResizable(false);
	}
	
	private void addTable() {
		
		String title[] = {"�̸�","����","����","����","����","���"};
		
		MyTableModel model1 = new MyTableModel(title);
		
		table =  new JTable(model1);
		
		//��ũ�ѹ� scrollbar
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(160,30,355,150);
		
		getContentPane().add(sp);
		
		//�۾��� ���ٰ� �ڵ����� �þ���� �ʽ��ϴ�. .AUTO_RESIZE_OFF
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		//�÷��� ���� 
		//��ü ��� �÷��� ���� 55�� ���� 
		for (int i = 0; i < title.length; i++) {
			TableColumn col = table.getColumnModel().getColumn(i);
			col.setPreferredWidth(55);
		}
		
		
	}
	
	private void process() {
		
		String[] data = new String[6];
		
		int tot;
		
		try {
			tot = 0;
			data[0] = tf[0].getText(); //�̸� 
			for (int i = 1; i <=3; i++) {
				//���� ���ϱ� 
				tot += Integer.parseInt(tf[i].getText());
				data[i] = tf[i].getText(); //������ 
			}
			data[4] = Integer.toString(tot);
			data[5] = Integer.toString(tot/3);
			//�ϳ��� �� 
			((MyTableModel)table.getModel()).addRow(data);
			//�ʱ�ȭ �۾� 
			//�Է°��� �����͸� ����� 
			for (int i = 0; i < tf.length; i++) {
				tf[i].setText("");
			}
			tf[0].requestFocus();
		} catch (Exception e) {
			
		}
	}
	
	class MyTableModel extends DefaultTableModel{

		private static final long serialVersionUID = 1L;
		
		private String[] title;
		
		public MyTableModel(String[] title) {
		
			this.title = title;
		}

		@Override
		public int getColumnCount() {
			
			if(title==null || title.length==0) {
				return 0;
			}
			return title.length;
		}
		@Override
		public String getColumnName(int column) {
			
			if(title==null || title.length==0) {
				return null;
			}
			return title[column];		
		}
	}
	public static void main(String[] args) {
		new JavaSwing_Example2();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		if(ob instanceof JButton) {
			JButton b= (JButton)ob;
			
			if(b==btn1) {
				process();
			}else if(b==btn2){
				System.exit(0);
			}
		}
	}
}
