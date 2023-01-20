/**
 * This TestPolygons program is program has the main method that crete new object
 * polygon1, polygon2 by using class polygon to set attributes width, height and type 
 * and using method setNumPolygons(),setSumPolygonsArea()
 * Its output format of method main is
 * "The number of polygon is <Polygon.numPolygons> or <Polygon1.numPolygons> or <Polygon2.numPolygons>
 * The width of polygon1 is <polygon1.width> The width of polygon2 is <polygon2.width>
 * The sum of polygons area is <Polygon.sumPolygonsArea>"
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 9, 2022
 */
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