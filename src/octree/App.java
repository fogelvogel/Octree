package octree;
//treeFrame.getContentPane().add(panel);
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;

import octree.Canvas;

import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class App {

	public JFrame frame;
	private JFrame treeFrame;
	private JFrame cubeFrame;

	public Info infoFrame;
	public static Canvas panel; 
	public static Canvas2 panel2; 
public static Octree tree;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		panel = new Canvas();
		panel.setBounds(10, 11, 960, 550);
		panel2 = new Canvas2();
		panel2.setBounds(10, 11, 960, 550);
		frame = new JFrame();
		frame.setTitle("\u041E\u043A\u0442\u043E\u0434\u0435\u0440\u0435\u0432\u043E");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JButton btnInfoButton = new JButton("Info");
		btnInfoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tree.PrintTree();
				infoFrame = new Info();
				infoFrame.frame.setVisible(true);
			}
		});
		tree = new Octree();
		boolean[] isNonVisual = {false,false,false,false,false,false,false,false};
		btnInfoButton.setBackground(SystemColor.activeCaption);
		btnInfoButton.setForeground(SystemColor.desktop);
		btnInfoButton.setBounds(304, 284, 94, 65);
		frame.getContentPane().add(btnInfoButton);
		
		JButton treeButton = new JButton("\u0414\u0435\u0440\u0435\u0432\u043E");
		treeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				treeFrame = new JFrame();
				treeFrame.setVisible(true);
				treeFrame.setTitle("\u041E\u043A\u0442\u043E\u0434\u0435\u0440\u0435\u0432\u043E");
				treeFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
				treeFrame.getContentPane().setLayout(null);
				treeFrame.setBackground(Color.BLACK);
				treeFrame.setBounds(100, 100, 1000, 650);
			//	treeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				treeFrame.getContentPane().add(panel);
			}
		});
		treeButton.setForeground(Color.WHITE);
		treeButton.setBackground(SystemColor.activeCaption);
		treeButton.setBounds(304, 78, 94, 65);
		frame.getContentPane().add(treeButton);
		
		JButton cubeButton = new JButton("\u041A\u0443\u0431");
		cubeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cubeFrame = new JFrame();
				cubeFrame.setVisible(true);
				cubeFrame.setTitle("\u041E\u043A\u0442\u043E\u0434\u0435\u0440\u0435\u0432\u043E");
				cubeFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
				cubeFrame.getContentPane().setLayout(null);
				cubeFrame.setBackground(Color.BLACK);
				cubeFrame.setBounds(100, 100, 1000, 650);
				//cubeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				cubeFrame.getContentPane().add(panel2);
			}
		});
		cubeButton.setForeground(Color.WHITE);
		cubeButton.setBackground(SystemColor.activeCaption);
		cubeButton.setBounds(304, 163, 94, 65);
		frame.getContentPane().add(cubeButton);
		
		JLabel lblNewLabel = new JLabel("\u041F\u043E\u043A\u0430\u0437\u0430\u0442\u044C:");
		lblNewLabel.setBounds(304, 34, 74, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxNode1 = new JCheckBox("\u0421\u044B\u043D 1");
		chckbxNode1.setSelected(true);
		chckbxNode1.setBounds(25, 78, 97, 23);
		frame.getContentPane().add(chckbxNode1);
		
		JCheckBox chckbxNode2 = new JCheckBox("\u0421\u044B\u043D 2");
		chckbxNode2.setSelected(true);
		chckbxNode2.setBounds(25, 113, 97, 23);
		frame.getContentPane().add(chckbxNode2);
		
		JCheckBox chckbxNode3 = new JCheckBox("\u0421\u044B\u043D 3");
		chckbxNode3.setSelected(true);
		chckbxNode3.setBounds(25, 149, 97, 23);
		frame.getContentPane().add(chckbxNode3);
		
		JCheckBox chckbxNode4 = new JCheckBox("\u0421\u044B\u043D 4");
		chckbxNode4.setSelected(true);
		chckbxNode4.setBounds(25, 184, 97, 23);
		frame.getContentPane().add(chckbxNode4);
		
		JCheckBox chckbxNode7 = new JCheckBox("\u0421\u044B\u043D 7");
		chckbxNode7.setSelected(true);
		chckbxNode7.setBounds(25, 291, 97, 23);
		frame.getContentPane().add(chckbxNode7);
		
		JCheckBox chckbxNode8 = new JCheckBox("\u0421\u044B\u043D 8");
		chckbxNode8.setSelected(true);
		chckbxNode8.setBounds(25, 326, 97, 23);
		frame.getContentPane().add(chckbxNode8);
		
		JCheckBox chckbxNode6 = new JCheckBox("\u0421\u044B\u043D 6");
		chckbxNode6.setSelected(true);
		chckbxNode6.setBounds(25, 255, 97, 23);
		frame.getContentPane().add(chckbxNode6);
		
		JCheckBox chckbxNode5 = new JCheckBox("\u0421\u044B\u043D 5");
		chckbxNode5.setSelected(true);
		chckbxNode5.setBounds(25, 220, 97, 23);
		frame.getContentPane().add(chckbxNode5);
		
		JLabel label = new JLabel("\u0412\u0438\u0434\u0438\u043C\u044B\u0435:");
		label.setBounds(25, 34, 74, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C \u0434\u0435\u0442\u0435\u0439 \u043A:");
		label_1.setBounds(160, 34, 127, 14);
		frame.getContentPane().add(label_1);
		
		JButton btnRoot = new JButton("\u041A\u043E\u0440\u043D\u044E");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t1==null) tree.AddToRoot(isNonVisual);
			}
		});
		btnRoot.setBounds(160, 66, 119, 23);
		frame.getContentPane().add(btnRoot);
		
		JButton btnRootSon1 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #1");
		btnRootSon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t1.t1==null) tree.AddToRootSon(1, isNonVisual);
			}
		});
		btnRootSon1.setBounds(160, 100, 119, 23);
		frame.getContentPane().add(btnRootSon1);
		
		JButton btnRootSon3 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #3");
		btnRootSon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t3.t1==null) tree.AddToRootSon(3, isNonVisual);
			}
		});
		btnRootSon3.setBounds(160, 168, 119, 23);
		frame.getContentPane().add(btnRootSon3);
		
		JButton btnRootSon2 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #2");
		btnRootSon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t2.t1==null) tree.AddToRootSon(2, isNonVisual);
			}
		});
		btnRootSon2.setBounds(160, 134, 119, 23);
		frame.getContentPane().add(btnRootSon2);
		
		JButton btnRootSon5 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #5");
		btnRootSon5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t5.t1==null) tree.AddToRootSon(5, isNonVisual);
			}
		});
		btnRootSon5.setBounds(160, 236, 119, 23);
		frame.getContentPane().add(btnRootSon5);
		
		JButton btnRootSon4 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #4");
		btnRootSon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {isNonVisual[0] = chckbxNode1.isSelected();
			isNonVisual[1] = !chckbxNode2.isSelected();
			isNonVisual[2] = !chckbxNode3.isSelected();
			isNonVisual[3] = !chckbxNode4.isSelected();
			isNonVisual[4] = !chckbxNode5.isSelected();
			isNonVisual[5] = !chckbxNode6.isSelected();
			isNonVisual[6] = !chckbxNode7.isSelected();
			isNonVisual[7] = !chckbxNode8.isSelected();
			if(tree.root.t4.t1==null) tree.AddToRootSon(4, isNonVisual);
			}
		});
		btnRootSon4.setBounds(160, 202, 119, 23);
		frame.getContentPane().add(btnRootSon4);
		
		JButton btnRootSon7 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #7");
		btnRootSon7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t7.t1==null) tree.AddToRootSon(7, isNonVisual);
			}
		});
		btnRootSon7.setBounds(160, 304, 119, 23);
		frame.getContentPane().add(btnRootSon7);
		
		JButton btnRootSon6 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #6");
		btnRootSon6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t6.t1==null) tree.AddToRootSon(6, isNonVisual);
			}
		});
		btnRootSon6.setBounds(160, 270, 119, 23);
		frame.getContentPane().add(btnRootSon6);
		
		JButton btnRootSon8 = new JButton("\u0421\u044B\u043D\u0443 \u043A\u043E\u0440\u043D\u044F #8");
		btnRootSon8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isNonVisual[0] = !chckbxNode1.isSelected();
				isNonVisual[1] = !chckbxNode2.isSelected();
				isNonVisual[2] = !chckbxNode3.isSelected();
				isNonVisual[3] = !chckbxNode4.isSelected();
				isNonVisual[4] = !chckbxNode5.isSelected();
				isNonVisual[5] = !chckbxNode6.isSelected();
				isNonVisual[6] = !chckbxNode7.isSelected();
				isNonVisual[7] = !chckbxNode8.isSelected();
				if(tree.root.t8.t1==null) tree.AddToRootSon(8, isNonVisual);
			}
		});
		btnRootSon8.setBounds(160, 341, 119, 23);
		frame.getContentPane().add(btnRootSon8);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
