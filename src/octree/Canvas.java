package octree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import octree.App;

public class Canvas extends JPanel {
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
	private void doDrawing(Graphics g) { //���������� ��������� ����� �� �����
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.gray); //����� �����
		//g2d.fillRect(50,50, 20, 20);
		g2d.fillOval(470, 30, 50, 50);
		g.drawString("������", 400, 20 );// �������
		if(App.tree.root.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.isSonVisible(i+1)) 
					g2d.setColor(Color.black); 
					g2d.fillOval(270+i*60, 200, 30, 30);
					g2d.setColor(Color.gray); 
			}
			g.drawString("���� �����", 200, 170 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t1.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t1.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(30+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� ������� ���� �����", 30, 370 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t2.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t2.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(130+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� ������� ���� �����",130, 450 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t3.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t3.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(230+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� �������� ���� �����", 230, 370 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t4.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t4.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(330+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
				
			}
			g.drawString("���� ���������� ���� �����",330, 450 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t5.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t5.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(430+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� ������ ���� �����", 430, 370 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t6.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t6.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(530+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� ������� ���� �����",530, 450 );// �������
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t7.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(!App.tree.root.t7.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(630+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("���� �������� ���� �����", 630, 370 );// �������
		}
		//if(!App.tree.root.t8.GetNonVisual()) 
		if(App.tree.root.t1!= null)
		if(App.tree.root.t8.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t8.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(730+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
				
			}
			g.drawString("���� �������� ���� �����",730, 450 );// �������
		}
	}
}
