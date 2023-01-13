package ritidet.paramita.lab5;

public class TestPolygons {
    public static void main(String[] args) {
        Polygon polygon1 = new Polygon();
        polygon1.width = 2;
        polygon1.height = 3;
        polygon1.type = PolygonType.RECTANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon1.getArea());
        Polygon polygon2 = new Polygon();
        polygon2.width = 3;
        polygon2.height = 4;
        polygon2.type = PolygonType.TRIANGLE;
        Polygon.setNumPolygons(1);
        Polygon.setSumPolygonsArea(polygon2.getArea());
        System.out.println("The number of polygon is " + Polygon.numPolygons + " or "
                + polygon1.numPolygons + " or " + polygon2.numPolygons);
        System.out.println("The width of polygon1 is " + polygon1.width
                + " The width of polygon2 is " + polygon2.width);
        System.out.println("The sum of polygons area is " + Polygon.sumPolygonsArea);
    }
}

class Polygon {
    double width;
    double height;
    static int numPolygons;
    static double sumPolygonsArea;
    PolygonType type;


    double getArea() {
        if (type == PolygonType.RECTANGLE) {
            double area = width * height;
            return area;
        } else if (type == PolygonType.TRIANGLE) {
            double area = (width * height)/2;
            return area;
        } else {
            return 0;
        }

    }

    static int setNumPolygons(int numNewPolygons) {
        numPolygons += numNewPolygons;
        return numPolygons;
    }

    static double setSumPolygonsArea(double newPolygonsArea) {
        sumPolygonsArea += newPolygonsArea;
        return sumPolygonsArea;
    }
}
enum PolygonType {
    RECTANGLE,
    TRIANGLE
}




