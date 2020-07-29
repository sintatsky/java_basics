public class GeometryCalculator {

    public static double getCircleSquare(double radius) {

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга равна " + area);
        return area;
    }

    public static double getSphereVolume(double radius) {

        double sphereVolume = ( 4.0 / 3.0 ) * Math.PI * Math.pow( radius, 3 );
        System.out.println("Объем сферы раве " + sphereVolume);
        return sphereVolume;
    }

    public static boolean isTriangleRightAngled(double a, double b, double c) {
        boolean triangleRightAngled = false;
        if (Math.pow( c, 2) == Math.pow(a, 2) + Math.pow(b, 2))
    {
        triangleRightAngled = true;}
        System.out.println("Возможно ли построение треугольника по трём длинам сторон? " + triangleRightAngled);
        return triangleRightAngled;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTriangleRightAngled, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        double p = (a + b + c)/2;
        double triangleSquare = Math.sqrt(p * (p - a) * (p-b) * (p-c));
        System.out.println("Площадь треугольника равна " + triangleSquare);
        return triangleSquare;
    }

}
