package octree;

public class Octree {
OctreeNode root;

Octree() {
	root = new OctreeNode(false,0,"root");
}
public void Add(OctreeNode n,boolean[] isNonVisual,String name) {
	n.t1 = new OctreeNode(isNonVisual[0],n.GetDepth()+1, name+1);
	n.t2 = new OctreeNode(isNonVisual[1],n.GetDepth()+1,name+2);
	n.t3 = new OctreeNode(isNonVisual[2],n.GetDepth()+1,name+3);
	n.t4 = new OctreeNode(isNonVisual[3],n.GetDepth()+1,name+4);
	n.t5 = new OctreeNode(isNonVisual[4],n.GetDepth()+1,name+5);
	n.t6 = new OctreeNode(isNonVisual[5],n.GetDepth()+1,name+6);
	n.t7 = new OctreeNode(isNonVisual[6],n.GetDepth()+1,name+7);
	n.t8 = new OctreeNode(isNonVisual[7],n.GetDepth()+1,name+8);
}
public void AddToRoot(boolean[] isNonVisual) {
	root.t1 = new OctreeNode(isNonVisual[0],root.GetDepth()+1,"rootSon1");
	root.t2 = new OctreeNode(isNonVisual[1],root.GetDepth()+1,"rootSon2");
	root.t3 = new OctreeNode(isNonVisual[2],root.GetDepth()+1,"rootSon3");
	root.t4 = new OctreeNode(isNonVisual[3],root.GetDepth()+1,"rootSon4");
	root.t5 = new OctreeNode(isNonVisual[4],root.GetDepth()+1,"rootSon5");
	root.t6 = new OctreeNode(isNonVisual[5],root.GetDepth()+1,"rootSon6");
	root.t7 = new OctreeNode(isNonVisual[6],root.GetDepth()+1,"rootSon7");
	root.t8 = new OctreeNode(isNonVisual[7],root.GetDepth()+1,"rootSon8");
}
public void AddToRootSon(int i,boolean[] isNonVisual) {
	OctreeNode n = new OctreeNode();
	switch(i) {
	case(1): {n = root.t1;break;}
	case(2): {n = root.t2;break;}
	case(3): {n = root.t3;break;}
	case(4): {n = root.t4;break;}
	case(5): {n = root.t5;break;}
	case(6): {n = root.t6;break;}
	case(7): {n = root.t7;break;}
	case(8): {n = root.t8;break;}
	}
	Add(n,isNonVisual,"rootSon"+i);
}
public void AddToRootGreatSon(int j,int i,boolean[] isNonVisual) {
	OctreeNode n = new OctreeNode();
	switch(j) {
	case(1): {n = root.t1;break;}
	case(2): {n = root.t2;break;}
	case(3): {n = root.t3;break;}
	case(4): {n = root.t4;break;}
	case(5): {n = root.t5;break;}
	case(6): {n = root.t6;break;}
	case(7): {n = root.t7;break;}
	case(8): {n = root.t8;break;}
	}
	switch(j) {
	case(1): {n =n.t1;break;}
	case(2): {n = n.t2;break;}
	case(3): {n = n.t3;break;}
	case(4): {n = n.t4;break;}
	case(5): {n = n.t5;break;}
	case(6): {n = n.t6;break;}
	case(7): {n = n.t7;break;}
	case(8): {n = n.t8;break;}
	}
	Add(n,isNonVisual,"rootGreatSon"+i);
}
public void Delete(OctreeNode n) {
	n.SetNonVisual(true);
}
public static void Print(OctreeNode n) {
	if(n!=null )System.out.println(n.node+n.GetNonVisual());
	
}
public  OctreeNode getByNumber(int i) {
	if(i==2) return root.t2;
	if(i==3) return root.t3;
	if(i==4) return root.t4;
	if(i==5) return root.t5;
	if(i==6) return root.t6;
	if(i==7) return root.t7;
	if(i==8) return root.t8;
	return root.t1;
}
public static void PrintWithChildren(OctreeNode n) {
	Print(n);
	if(n.t1!= null) Print(n.t1);
	if(n.t2!= null) Print(n.t2);
	if(n.t3!= null) Print(n.t3);
	if(n.t4!= null) Print(n.t4);
	if(n.t5!= null) Print(n.t5);
	if(n.t6!= null) Print(n.t6);
	if(n.t7!= null) Print(n.t7);
	if(n.t8!= null) Print(n.t8);
}
public void PrintTree() {
	Print(root);
	if(root.t1!= null) PrintWithChildren(root.t1);
	if(root.t2!= null) PrintWithChildren(root.t2);
	if(root.t3!= null) PrintWithChildren(root.t3);
	if(root.t4!= null) PrintWithChildren(root.t4);
	if(root.t5!= null) PrintWithChildren(root.t5);
	if(root.t6!= null) PrintWithChildren(root.t6);
	if(root.t7!= null) PrintWithChildren(root.t7);
	if(root.t8!= null) PrintWithChildren(root.t8);
}
}