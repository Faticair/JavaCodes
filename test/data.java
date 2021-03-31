public class data {
    byte bytenum;
    short shortnum;
    int intnum;
    long longnum;
    float flnum;
    double dounum;
    char chartype;

    public void showbyte() {
        System.out.println("byte:");
        System.out.println("SIZE: " + Byte.SIZE);
        System.out.println("MAX: " + Byte.MAX_VALUE);
        System.out.println("MIN: " + Byte.MIN_VALUE);
        System.out.println("Value: " + bytenum + '\n');
    }

    public void showshort() {
        System.out.println("short:");
        System.out.println("SIZE: " + Short.SIZE);
        System.out.println("MAX: " + Short.MAX_VALUE);
        System.out.println("MIN: " + Short.MIN_VALUE);
        System.out.println("Value: " + shortnum + '\n');
    }

    public void showint() {
        System.out.println("int:");
        System.out.println("SIZE: " + Integer.SIZE);
        System.out.println("MAX: " + Integer.MAX_VALUE);
        System.out.println("MIN: " + Integer.MIN_VALUE);
        System.out.println("Value: " + intnum + '\n');
    }

    public void showlong() {
        System.out.println("long:");
        System.out.println("SIZE: " + Long.SIZE);
        System.out.println("MAX: " + Long.MAX_VALUE);
        System.out.println("MIN: " + Long.MIN_VALUE);
        System.out.println("Value: " + longnum + '\n');
    }

    public void showfloat() {
        System.out.println("float:");
        System.out.println("SIZE: " + Float.SIZE);
        System.out.println("MAX: " + Float.MAX_VALUE);
        System.out.println("MIN: " + Float.MIN_VALUE);
        System.out.println("Value: " + flnum + '\n');
    }

    public void showdouble() {
        System.out.println("double:");
        System.out.println("SIZE: " + Double.SIZE);
        System.out.println("MAX: " + Double.MAX_VALUE);
        System.out.println("MIN: " + Double.MIN_VALUE);
        System.out.println("Value: " + dounum + '\n');
    }

    public void showchar() {
        System.out.println("char:");
        System.out.println("SIZE: " + Character.SIZE);
        System.out.println("MAX: " + (int)Character.MAX_VALUE);
        System.out.println("MIN: " + (int)Character.MIN_VALUE);
        System.out.println("Value: " + chartype + '\n');
    }
}
