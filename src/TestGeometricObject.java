public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geo1 = new Circle(5);
        GeometricObject geo2 = new Rectangle(5,3);
        System.out.println("İki obje de aynı alana sahip mi?"+ equalArea(geo1,geo2));
        displayGeometricObject(geo1);
        displayGeometricObject(geo2);
    }
    public static boolean equalArea(GeometricObject obj1, GeometricObject obj2) {
        return obj1.getArea() == obj2.getArea();
    }
    public static void displayGeometricObject(GeometricObject obj) {
        System.out.println("Alan: " + obj.getArea());
        System.out.println("Çevre: " + obj.getPerimeter());
    }
}
