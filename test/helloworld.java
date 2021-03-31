public class helloworld {
    hellolist word;
    public helloworld(hellolist w){
        word = w;
    }
    public void gethello() {
        System.out.println("Hello, " + word);
    }
}

enum hellolist {
    JAVA, world, zahi;
}