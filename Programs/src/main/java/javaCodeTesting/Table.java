package javaCodeTesting;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class Table extends JFrame {
	JLabel l1, l2, l3, l4;
	JComboBox cb1;
	JTextField tf1, tf2;
	JButton b1;

	public static void main(String args[]) {
		Table Frm = new Table();
		Frm.setSize(700, 500);
		Frm.setVisible(true);
	}

	public Table() {
		Container cn = getContentPane();
		cn.setLayout(null);
		l1 = new JLabel("select item");
		l1.setBounds(10, 10, 80, 30);
		cn.add(l1);
		cb1 = new JComboBox();
		cb1.setBounds(110, 10, 100, 20);
		cn.add(cb1);
		l2 = new JLabel("enter qun");
		l2.setBounds(10, 30, 80, 30);
		cn.add(l2);
		tf1 = new JTextField();
		tf1.setBounds(110, 40, 100, 20);
		cn.add(tf1);
		l3 = new JLabel("enter rate");
		l3.setBounds(10, 50, 80, 30);
		cn.add(l3);
		tf2 = new JTextField();
		tf2.setBounds(110, 60, 100, 20);
		cn.add(tf2);
		b1 = new JButton("add");
		b1.setBounds(10, 80, 100, 20);
		cn.add(b1);
		String heading[] = { "s.no", "item no", "quantity", "rate", "amount" };
		DefaultTableModel dtm = new DefaultTableModel(heading, 3);
		JTable tab = new JTable(dtm);
		JScrollPane jsp = new JScrollPane(tab);
		jsp.setBounds(10, 150, 450, 200);
		cn.add(jsp);
	}
}