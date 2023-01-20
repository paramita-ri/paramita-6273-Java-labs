/**
 * This polygon class is the clas that has three instance attributes which are width, height, 
 * and type (types of Polygons are defined using enum type PolygonType which has two values 
 * as RECTANGLE and TRIANGLE.) and two static attributes which are numPolygons and sumPolygonsArea
 * about method in this class have one instance method getArea() which returns the area of a polygon  
 * based on width, height, and type of a polygon 
 * and two static methods which are setNumPolygons(int numNewPolygons) which adds numNewPolygons
 * to the current value of numPolygons and setSumPolygonsArea(double newPolygonsArea)  which adds 
 * newPolygonsArea to the current value of sumPolygonsArea. 
 * 
 * Author: Paramita Ritidet
 * ID: 653040627-3
 * Sec: 1
 * Date: January 9, 2022
 */
package ritidet.paramita.lab5;

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
            double area = (width * height) / 2;
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