package design_Pattern.Memento;

import java.util.ArrayList;

import design_Pattern.Iterator.Array;

public class Walker {
	
	 private int currentX, currentY; // 현재위치
	 private int targetX, targetY; // 목적지
	 private ArrayList<String> actionList = new ArrayList<String>(); //갈때 action
	 
	 public Walker(int currentX, int currentY, int targetX, int targetY) {
		 this.currentX = currentX;
		 this.currentY =currentY;
		 this.targetX = targetX;
		 this.targetY = targetY;
	 }
 
	 public double walk(String action) {
		 actionList.add(action);
		 
		 if(action.equals("up")) {
			 currentY += 1;		 
		 } else if(action.equals("Rignt")) {
			 currentX += 1;
		 } else if(action.equals("down")) {
			 currentY -= 1;
		 } else if(action.equals("Left")) {
			 currentX -= 1;
		 }
		 
		 return Math.sqrt(Math.pow(currentX-targetX,2)+Math.pow(currentY-targetY,2));
	 }
	 
	 public class Memento{
		 private int x, y;
		 private ArrayList<String> actionList;
		 private Memento() {}
	 }
	 
	 public Memento createMemento() {
		 Memento memento = new Memento();
		 
		 memento.x = this.currentX;
		 memento.y = this.currentY;
		 memento.actionList = (ArrayList<String>)this.actionList.clone();
		 
		 return memento;
	 }
	 
	 	//walker상태
	 public void restoreMemento(Memento memento) {
		 memento.x = this.currentX;
		 memento.y = this.currentY;
		 memento.actionList = (ArrayList<String>)this.actionList.clone();
	 }
	 
	 public String toString() {
		 return actionList.toString();
	 }
}
