package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	   extractedMethod(nodes, p);     
	   // other implementation
       return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
       // other implementation
       return null;
   }

   <T extends Element> void extractedMethod(List<T> elementList, String p) {
	   for (Element element : elementList) {
		   if (element.contains(p))
			   System.out.println(element);
	   }
	   // other implementation
	   return;
   }
}

abstract class Element {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}

class Node extends Element{

}

class Edge extends Element{
   
}