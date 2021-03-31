public class structure {
    public void enhanced_for(int [] numbers) {
        for(int x: numbers){
            System.out.println("The number is " + x);
        }
    }

    public void switches(char s) {
        switch(s){
            case 'A': 
                System.out.println("A!");
                break;
            case 'B':
                System.out.println("B!");
                break;
            case 'C':
                System.out.println("C!");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
