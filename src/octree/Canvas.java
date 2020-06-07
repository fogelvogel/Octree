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
	private void doDrawing(Graphics g) { //собственно рисование всего на форме
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.gray); //выбор цвета
		//g2d.fillRect(50,50, 20, 20);
		g2d.fillOval(470, 30, 50, 50);
		g.drawString("Корень", 400, 20 );// надписи
		if(App.tree.root.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.isSonVisible(i+1)) 
					g2d.setColor(Color.black); 
					g2d.fillOval(270+i*60, 200, 30, 30);
					g2d.setColor(Color.gray); 
			}
			g.drawString("Дети корня", 200, 170 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t1.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t1.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(30+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети первого сына корня", 30, 370 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t2.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t2.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(130+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети второго сына корня",130, 450 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t3.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t3.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(230+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети третьего сына корня", 230, 370 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t4.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t4.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(330+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
				
			}
			g.drawString("дети четвертого сына корня",330, 450 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t5.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t5.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(430+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети пятого сына корня", 430, 370 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t6.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(App.tree.root.t6.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(530+i*20, 480, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети шестого сына корня",530, 450 );// надписи
		}
		if(App.tree.root.t1!= null)
		if(App.tree.root.t7.t1!=null) {
			for(int i = 0;i< 8;i++) {
				if(!App.tree.root.t7.isSonVisible(i+1))
					g2d.setColor(Color.black); 
				g2d.fillOval(630+i*20, 400, 10, 10);
				g2d.setColor(Color.gray); 
			}
			g.drawString("дети седьмого сына корня", 630, 370 );// надписи
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
			g.drawString("дети восьмого сына корня",730, 450 );// надписи
		}
	}
}
