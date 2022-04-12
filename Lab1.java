import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {

        /** ВВод координат и создание 3ех точек **/
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты 1ой точки(x, y, z):");
        Point3d P1 = new Point3d (in.nextDouble(),in.nextDouble(),in.nextDouble());

        System.out.println("Введите координаты 2ой точки(x, y, z):");
        Point3d P2 = new Point3d (in.nextDouble(),in.nextDouble(),in.nextDouble());

        System.out.println("Введите координаты 3ей точки(x, y, z):");
        Point3d P3 = new Point3d (in.nextDouble(),in.nextDouble(),in.nextDouble());

        /** Вычисление площади треугольника с проверкой **/
        if (Point3d.raven(P1, P2)|| Point3d.raven(P1, P3)||Point3d.raven(P3, P2))
            System.out.println("Ошибка! Некоторые точки имеют одинаковые координаты.");
        else
        System.out.println(computeArea(P1, P2, P3));

    }

    /** Метод, позволяющий найти площадь треугольника **/
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3){
        double a = Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX())
                + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY())
                + (p2.getZ() - p1.getZ()) * (p2.getZ() - p1.getZ()));
        double b = Math.sqrt((p3.getX() - p1.getX()) * (p3.getX() - p1.getX())
                + (p3.getY() - p1.getY()) * (p3.getY() - p1.getY())
                + (p3.getZ() - p1.getZ()) * (p3.getZ() - p1.getZ()));
        double c =  Math.sqrt((p2.getX() - p3.getX()) * (p2.getX() - p3.getX())
                + (p2.getY() - p3.getY()) * (p2.getY() - p3.getY())
                + (p2.getZ() - p3.getZ()) * (p2.getZ() - p3.getZ()));
        double p = (a+b+c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
