package Lecture1.Point2D_2;
/*
 * конструктор
 */
public class Point2D {
    int x, y;
    
    /** конструктор
     * @param valueX ось х
     * @param valueY ось у
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;        
    }
    public String getInfo(){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override
    public String toString() {
        return getInfo();
    }
    //ctor
    //get; set;
    //docs;
}
