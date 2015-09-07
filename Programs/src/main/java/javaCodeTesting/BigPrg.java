package javaCodeTesting;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.RandomAccessFile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class BigPrg extends JFrame implements ActionListener
{
	JTextArea jt1;
	JTextField tf2,tf3,tf4,tf5;
	JButton bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,bu10,bu11;
	JLabel lb1,lb2,lb3,lb4;
	String str,str1;
	JProgressBar jp1;
	int n1,n2, c;
	public static void main(String args[])
	{
		BigPrg th=new BigPrg();
		th.setSize(800,700);
		th.setVisible(true);
	}

	public BigPrg()
	{
		Container cn=getContentPane();
		cn.setLayout(null);
		jt1=new JTextArea();
		JScrollPane jsp=new JScrollPane(jt1);
		jsp.setBounds(130,20,520,130);
		cn.add(jsp);
		Color cl1=new Color(84,216,222);
		cn.setBackground(cl1);
		Color cl=new Color(220,60,230);
		jt1.setBackground(cl);
		tf2=new JTextField();
		tf2.setBounds(140,210,280,25);
		tf2.setBackground(Color.YELLOW);
		cn.add(tf2);
		tf3=new JTextField();
		tf3.setBounds(140,240,280,25);
		cn.add(tf3);
		tf3.setBackground(Color.GREEN);
		tf4=new JTextField();
		tf4.setBounds(140,270,280,25);
		cn.add(tf4);
		tf4.setBackground(Color.RED);
		tf5=new JTextField();
		tf5.setBounds(140,300,280,25);
		cn.add(tf5);
		tf5.setBackground(Color.BLUE);

		lb1=new JLabel("Find What");
		lb1.setBounds(25,210,100,20);
		cn.add(lb1);
		lb2=new JLabel("Replace With");
		lb2.setBounds(25,240,100,20);
		cn.add(lb2);
		lb3=new JLabel("Save File Name");
		lb3.setBounds(25,270,100,20);
		cn.add(lb3);
		lb4=new JLabel("Open File Name");
		lb4.setBounds(25,300,100,20);
		cn.add(lb4);

		bu1=new JButton("cut");
		bu1.setBounds(110,170,80,20);
		cn.add(bu1);
		bu2=new JButton("copy");
		bu2.setBounds(205,170,90,20);
		cn.add(bu2);
		bu3=new JButton("paste");
		bu3.setBounds(310,170,100,20);
		cn.add(bu3);
		bu4=new JButton("select All");
		bu4.setBounds(430,170,100,20);
		cn.add(bu4);
		bu5=new JButton("Clear All");
		bu5.setBounds(550,170,100,20);
		cn.add(bu5);
		bu6=new JButton("Find");
		bu6.setBounds(430,210,100,20);
		cn.add(bu6);

		bu7=new JButton("Find Next");
		bu7.setBounds(550,210,100,20);
		cn.add(bu7);
		bu8=new JButton("Replace");
		bu8.setBounds(430,240,100,20);
		cn.add(bu8);
		bu9=new JButton("Replace All");
		bu9.setBounds(550,240,100,20);
		cn.add(bu9);
		bu10=new JButton("Save");
		bu10.setBounds(430,270,100,20);
		cn.add(bu10);
		bu11=new JButton("Open");
		bu11.setBounds(430,300,100,20);
		cn.add(bu11);
		jp1=new JProgressBar();
		cn.add(jp1);
		jp1.setBounds(140,340,380,25);
		bu1.addActionListener(this);
		bu2.addActionListener(this);
		bu3.addActionListener(this);
		bu4.addActionListener(this);
		bu5.addActionListener(this);
		bu6.addActionListener(this);
		bu7.addActionListener(this);
		bu8.addActionListener(this);
		bu9.addActionListener(this);
		bu10.addActionListener(this);
		bu11.addActionListener(this);
	}
		class A extends Thread
		{
			
			public void run()
			{	
					try
					{
					String v1=tf5.getText();
					FileReader fr=new FileReader(v1);
					
					while((c=fr.read())!=-1)
					{
						Thread.sleep(500);
						jp1.setStringPainted(true);
						jt1.append(""+(char)c);
						
					}
					fr.close();
				

				}
				catch(Exception er)
				{
					System.out.println(er.getMessage());
				}
				//String v1=tf5.getText();
				//int lb=Integer.parseInt(v1);
				
			}
			
		}	
		class B extends Thread
			{
			
			public void run()
			{	
					String v1=tf5.getText();
					int a=v1.length();
					jp1.setMaximum(a);
					for(int i=0;i<=a;i++)
					{
					try
					{
					jp1.setValue(i);
					Thread.sleep(500);
					}
					catch(Exception er)
					{
					System.out.println(er.getMessage());
					}
					}
			}
			
		}
			public void actionPerformed(ActionEvent ae)
			{
				
				if(ae.getSource()==bu1)
				{
					 n1=jt1.getSelectionStart();
					n2=jt1.getSelectionEnd(); 
					str=jt1.getSelectedText();
					jt1.replaceRange("",n1,n2);
				}
				if(ae.getSource()==bu2)
				{
					n1=jt1.getSelectionStart();
					 n2=jt1.getSelectionEnd();  
					str=jt1.getSelectedText();
				}
				if(ae.getSource()==bu3)
				{
					 n1=jt1.getSelectionStart();
					jt1.insert(str,n1);
				}
				if(ae.getSource()==bu4)
				{
					jt1.selectAll();
					jt1.requestFocus();
				}
				if(ae.getSource()==bu5)
				{
					jt1.setText("");
					jt1.requestFocus();
				}
				if(ae.getSource()==bu6)
				{
					String s1=jt1.getText();
					String s2=tf2.getText();
					int ln=s2.length();
					int i=s1.indexOf(s2);
					jt1.requestFocus(); 
					jt1.select(i,i+ln);
				}
					if(ae.getSource()==bu7)
				{
					 n2=jt1.getSelectionEnd(); 
					String s1=jt1.getText();
					String s2=tf2.getText();
					int ln=s2.length();
					int i=s1.indexOf(s2,n2);
					jt1.requestFocus(); 
					jt1.select(i,i+ln);
				}
				
					
					
				if(ae.getSource()==bu8)
				{
					n1=jt1.getSelectionStart();
					 
					
					String w=tf3.getText();
					String s2=tf2.getText();
					String s1=jt1.getText();
					int ln=s2.length();
					
					int aa=s1.indexOf(s2);
					jt1.requestFocus(); 
					if(aa>=0 && ln>0)
					{
						jt1.replaceRange(w,aa,aa+ln);
					}
					 
					
				}	 
				
				if(ae.getSource()==bu9)
				{		 
						
					
					String w=tf3.getText();	//replace with
					String s2=tf2.getText();//find what
					String s1=jt1.getText();
					int ln=s2.length();
					
					int i=0;	

						if(s1.indexOf(s2)>=0)
						{
							jt1.requestFocus();
							i=s1.indexOf(s2);
							
							
							jt1.replaceRange(w,i,(i+ln));
						}
			}
				if(ae.getSource()==bu10)
				{
					try
					{
						
					String s1=tf4.getText();
					RandomAccessFile raf=new RandomAccessFile(s1,"rw");
					raf.seek(raf.length());
					String ak=jt1.getText();
					byte bt[]=ak.getBytes();
					raf .write(bt);
					
					//File fl=new File(ak);
					//boolean res=fl.mkdirs(s1);
					
					}
					catch(Exception ex)
					{
						System.out.println("errer....."+ex);
					}
					
				}
				if(ae.getSource()==bu11)
				{
					
					B th2=new B();
					th2.start();
					A th1=new A();
					th1.start();
					/*try
					{
					String v1=tf5.getText();
					FileReader fr=new FileReader(v1);
					
					while((c=fr.read())!=-1)
					{
						Thread.sleep(200);
						jt1.append(""+(char)c);
						
					}
					fr.close();

				}
				catch(Exception er)
				{
					System.out.println(er.getMessage());
				}*/
			}
		
	}

}
