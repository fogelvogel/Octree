package octree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

import octree.App;

public class Canvas2 extends JPanel {
	@Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
	public void octantSide(OctreeNode thisNode,int x, int y,int node1,int node2,int node3,int node4,Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black); //выбор цвета
		if(thisNode.t1!=null) {
			if(!thisNode.isSonVisible(node1) ) {
				
				g2d.drawRect(x, y, 50, 50);
			}
			else g2d.fillRect(x, y, 50, 50);
			
if(!thisNode.isSonVisible(node2)) {
				
				g2d.drawRect(x+50, y, 50, 50);
			}
			else g2d.fillRect(x+50, y, 50, 50);
		
		if(!thisNode.isSonVisible(node3)) {
			
			g2d.drawRect(x, y+50, 50, 50);
		}
		else g2d.fillRect(x, y+50, 50, 50);
		
		if(!thisNode.isSonVisible(node4)) {
			
			g2d.drawRect(x+50, y+50, 50, 50);
		}
		else g2d.fillRect(x+50, y+50, 50, 50);
		}
	}
	public void cubeSide(int x, int y,int node1,int node2,int node3,int node4,Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black); //выбор цвета
		if(App.tree.root.t1!=null) {
			if(!App.tree.root.isSonVisible(node1)) {
				
				g2d.drawRect(x, y, 100, 100);
			}
			else g2d.fillRect(x, y, 100, 100);
			octantSide(App.tree.getByNumber(node1),x,y,node1,node2,node3,node4,g);/////////////////////////////////////////////////////////
			
if(!App.tree.root.isSonVisible(node2)) {
				
				g2d.drawRect(x+100, y, 100, 100);
			}
			else g2d.fillRect(x+100, y, 100, 100);
octantSide(App.tree.getByNumber(node2),x+100,y,node1,node2,node3,node4,g);
		if(!App.tree.root.isSonVisible(node3)) {
			
			g2d.drawRect(x, y+100, 100, 100);
		}
		else g2d.fillRect(x, y+100, 100, 100);
		octantSide(App.tree.getByNumber(node3),x,y+100,node1,node2,node3,node4,g);
		if(!App.tree.root.isSonVisible(node4)) {
			
			g2d.drawRect(x+100, y+100, 100, 100);
		}
		else g2d.fillRect(x+100, y+100, 100, 100);
		octantSide(App.tree.getByNumber(node4),x+100,y+100,node1,node2,node3,node4,g);
		}
	}
	private void doDrawing(Graphics g) { //собственно рисование всего на форме
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.gray); //выбор цвета
		g2d.fillRect(50,50,200,200);
		g2d.fillRect(350,50,200,200);
		g2d.fillRect(650,50,200,200);
		g2d.fillRect(50,300,200,200);
		g2d.fillRect(350,300,200,200);
		g2d.fillRect(650,300,200,200);
		g.drawString("Перед", 120, 30 );// надписи
		g.drawString("Верх", 435, 30 );// надписи
		g.drawString("Правая сторона", 700, 30 );// надписи
		g.drawString("Задняя сторона", 100, 280 );// надписи
		g.drawString("Низ", 435, 280 );// надписи
		g.drawString("Левая сторона", 700, 280 );// надписи
		g2d.setColor(Color.black); //выбор цвета
		cubeSide(50,50,1,2,3,4,g);
		cubeSide(350,50,5,6,1,2,g);
		cubeSide(650,50,2,6,4,8,g);
		cubeSide(50,300,6,5,8,7,g);
		cubeSide(350,300,3,4,7,8,g);
		cubeSide(650,300,5,1,7,3,g);
	}
}