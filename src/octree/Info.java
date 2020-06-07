package octree;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JLabel;

public class Info {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Info window = new Info();
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
	public Info() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textArea.setWrapStyleWord(true);
		textArea.setTabSize(20);
		textArea.setLineWrap(true);
		textArea.setRows(10);
		textArea.setText("\u041A\u0430\u0436\u0434\u044B\u0439 \u0443\u0437\u0435\u043B  \u0432 \u043E\u043A\u0442\u043E\u0434\u0435\u0440\u0435\u0432\u0435 \u0434\u0435\u043B\u0438\u0442 \u043F\u0440\u043E\u0441\u0442\u0440\u0430\u043D\u0441\u0442\u0432\u043E \u043D\u0430 \u0432\u043E\u0441\u0435\u043C\u044C \u043E\u043A\u0442\u0430\u043D\u0442\u043E\u0432. \u041A\u0430\u0436\u0434\u044B\u0439 \u0443\u0437\u0435\u043B \u0441\u043E\u0445\u0440\u0430\u043D\u044F\u0435\u0442  \u0442\u0440\u0451\u0445\u043C\u0435\u0440\u043D\u0443\u044E \u0442\u043E\u0447\u043A\u0443, \u043A\u043E\u0442\u043E\u0440\u0430\u044F \u044F\u0432\u043B\u044F\u0435\u0442\u0441\u044F \u00AB\u0446\u0435\u043D\u0442\u0440\u043E\u043C\u00BB \u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u044F \u043F\u0440\u043E\u0441\u0442\u0440\u0430\u043D\u0441\u0442\u0432\u0430 \u0434\u043B\u044F \u044D\u0442\u043E\u0433\u043E \u0443\u0437\u043B\u0430 \u0438 \u043D\u0430\u0437\u044B\u0432\u0430\u0435\u0442\u0441\u044F \u0440\u0435\u0433\u0438\u043E\u043D\u0430\u043B\u044C\u043D\u043E\u0439. \u0414\u0430\u043D\u043D\u0430\u044F \u0442\u043E\u0447\u043A\u0430 \u043E\u043F\u0440\u0435\u0434\u0435\u043B\u044F\u0435\u0442 \u043E\u0434\u0438\u043D \u0438\u0437 \u0443\u0433\u043B\u043E\u0432 \u043A\u0430\u0436\u0434\u043E\u0433\u043E \u0438\u0437 \u0432\u043E\u0441\u044C\u043C\u0438 \u0434\u043E\u0447\u0435\u0440\u043D\u0438\u0445 \u043F\u0440\u043E\u0441\u0442\u0440\u0430\u043D\u0441\u0442\u0432. \u0412 MX-\u043E\u043A\u0442\u043E\u0434\u0435\u0440\u0435\u0432\u0435 \u0442\u043E\u0447\u043A\u0430 \u0440\u0430\u0437\u0434\u0435\u043B\u0435\u043D\u0438\u044F \u044F\u0432\u043B\u044F\u0435\u0442\u0441\u044F \u043D\u0435\u044F\u0432\u043D\u044B\u043C \u0446\u0435\u043D\u0442\u0440\u043E\u043C \u043F\u0440\u043E\u0441\u0442\u0440\u0430\u043D\u0441\u0442\u0432\u0430, \u043A\u043E\u0442\u043E\u0440\u043E\u0435 \u043F\u0440\u0435\u0434\u0441\u0442\u0430\u0432\u043B\u044F\u0435\u0442 \u0443\u0437\u0435\u043B. ");
		textArea.setBackground(SystemColor.activeCaptionBorder);
		textArea.setBounds(35, 29, 271, 352);
		frame.getContentPane().add(textArea);
		frame.setTitle("\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F");
		frame.setResizable(false);
		frame.setBackground(Color.LIGHT_GRAY);
		frame.setBounds(600, 100, 350, 450);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
