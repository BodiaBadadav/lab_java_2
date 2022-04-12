    /**
    двумерный класс точки
    */
    public class point2d {
    /** координата X */
        private double xCoord;
    /** координата Y **/
        private double yCoord;
    /** Конструктор инициализации **/
        public point2d(double x, double y) {
            xCoord = x;
            yCoord = y;
        }
    /** Конструктор по умолчанию. **/
        public point2d() {
    //Вызовите конструктор с двумя параметрами и определите источник.
            this(0, 0);
        }
    /** Возвращение координаты X **/
        public static double getX() {
            return xCoord;
        }
    /** Возвращение координаты Y **/
        public double getY () {
            return yCoord;
        }
    /** Установка значения координаты X. **/
        public void setX ( double val) {
            xCoord = val;
        }
    /** Установка значения координаты Y. **/
        public void setY ( double val) {
            yCoord = val;
        }

    public static void main(String[] args) {
        point2d myPoint = new point2d ();//создает точку (0,0)
        point2d myOtherPoint = new point2d (5,3);//создает точку (5,3)
        point2d aThirdPoint = new point2d ();

        System.out.println("Координаты точки myPoint");
        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());

        System.out.println("Координаты точки  myOtherPoint");
        System.out.println(myOtherPoint.getX());
        System.out.println(myOtherPoint.getY());

        System.out.println("Координаты точки aThirdPoint");
        System.out.println(aThirdPoint.getX());
        System.out.println(aThirdPoint.getY());
    }
}


