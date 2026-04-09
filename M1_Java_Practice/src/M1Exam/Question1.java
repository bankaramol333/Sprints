import java.util.*;

class Shape{

    public void drawShape() {
        System.out.println("Drawing a Shape");
    }
}

class Square extends Shape{

    @Override
    public void drawShape() {
        System.out.println("Drawing a Square");
    }
}

class Circle extends Shape{

    @Override
    public void drawShape() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape{

    @Override
    public void drawShape() {
        System.out.println("Drawing a Rectangle");
    }

}

class ShapeFactory{

    public void drawShape(String shapeType) {

        if(shapeType.equals("Square")) {
            Shape sh = new Square() ;
            sh.drawShape() ;
        }
        else if (shapeType.equals("Circle")) {
            Shape sh = new Circle() ;
            sh.drawShape() ;
        }
        else if (shapeType.equals("Rectangle")) {
            Shape sh = new Rectangle() ;
            sh.drawShape() ;
        }
        else {
            System.out.println("Drawing "+shapeType+" is not supported");
        }
    }
}
 
class Edge implements Comparable<Edge> {
    private int from;
    private int toNode;

    private Edge(int fromNode, int toNode) {
        this.fromNode = fromNode;
        this.toNode = toNode;
    }

    public static Edge createEdge(int fromNode, int toNode) {
        return new Edge(fromNode, toNode);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                      
        if (obj == null || getClass() != obj.getClass()) return false; 
        Edge edge = (Edge) obj;
        return fromNode == edge.fromNode && toNode == edge.toNode; 
    }


    @Override
    public int compareTo(Edge other) {
        if (this.fromNode != other.fromNode) {
            return Integer.compare(this.fromNode, other.fromNode);
        }
        return Integer.compare(this.toNode, other.toNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromNode, toNode);
    }

    @Override
    public String toString() {
        return "From node: " + fromNode + " To node: " + toNode;
    }
}