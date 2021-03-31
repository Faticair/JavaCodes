public class operater {

    public void selfleftadd(int x) {
        System.out.println("Before left add is " + x);
        int tmp = 2*++x;
        System.out.println("Operate 2*++x is " + tmp);
        System.out.println("Then number is " + x);
    }

    public void selfrightadd(int x) {
        System.out.println("Before right add is " + x);
        int tmp = 2*x++;
        System.out.println("Operate 2*x++ is " + tmp);
        System.out.println("Then number is " + x);
    }

    public void byteoperate(int x, int y) {
        System.out.println("x is " + x + ", y is " + y);
        System.out.println("Binary: x: " + Integer.toBinaryString(x) + "\ty: " + Integer.toBinaryString(y));
        int tmp = x << 3;
        System.out.println("x after << 3 is " + tmp + ". Binary is " + Integer.toBinaryString(tmp));
        tmp = y >>> 3;
        System.out.println("y after >>> 3 is " + tmp + ". Binary is " + Integer.toBinaryString(tmp));
    }
}
