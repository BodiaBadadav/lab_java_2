public class Point3d {
    /** координата X */
    private double xCoord;

    /** координата Y **/
    private double yCoord;

    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /** Конструктор по умолчанию. **/
    public Point3d() {
        this(0, 0, 0);
    }

    /** Возвращение координаты X **/
    double getX () {
        return  point2d.getX ();
    }

    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }

    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }

    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }

    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }

    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }

    /** Метод для сравненя координат двух точек **/
    public static boolean raven(Point3d p1, Point3d p2) {
        if ((p1.getX() == p2.getX())&&(p1.getY() == p2.getY())&&(p1.getZ() == p2.getZ()))
            return true;
        else return false;
    }

    /** Метод для вычисления координат между двумя точками **/
    public static double distanceTo(Point3d p1, Point3d p2){
        return  Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())
                + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY())
                + (p2.getZ() - p1.getZ()) * (p2.getZ() - p1.getZ()));
    }


}
