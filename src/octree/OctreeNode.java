package octree;

public class OctreeNode {
	private boolean nonVisual;
	private int depth;
	public String node; //для отладки
	//private OctreeNode up;
	OctreeNode t1;
	 OctreeNode t2;
	 OctreeNode t3;
	 OctreeNode t4;
	 OctreeNode t5;
	 OctreeNode t6;
	 OctreeNode t7;
	 OctreeNode t8;

	OctreeNode() {
		nonVisual = false;
		depth = 0;
		t1 = t2 = t3 = t4 = t5 = t6 = t7 = t8 = null;
	}
	 
	 OctreeNode(boolean isNonVisual,int d, String name) {
		 node = name;
		nonVisual = isNonVisual;
		depth = d;
		t1 = t2 = t3 = t4 = t5 = t6 = t7 = t8 = null;
	}
	public boolean isSonVisible(int i) {
		if(i==1)return this.t1.GetNonVisual();
		if(i==2)return this.t2.GetNonVisual();
		if(i==3)return this.t3.GetNonVisual();
		if(i==4)return this.t4.GetNonVisual();
		if(i==5)return this.t5.GetNonVisual();
		if(i==6)return this.t6.GetNonVisual();
		if(i==7)return this.t7.GetNonVisual();
		if(i==8)return this.t8.GetNonVisual();
		return true;
	}
	 public int GetDepth() {
		 return depth;
	 }
	 public void SetDepth(int d) {
		 depth = d;
	 }
	 public boolean GetNonVisual() {
		 return nonVisual;
	 }
	 public void SetNonVisual(boolean isNonVisual) {
		 nonVisual = isNonVisual;
	 }
}

