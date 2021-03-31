public class Method {
    
    public static int count = 0;

    public static void HanoTower(int disks, char A, char B, char C){
        if (disks == 1){
            count += 1;
            System.out.println("Step " + count + ": Disk 1: " + A + " --> " + C);
        }else {
            HanoTower(disks - 1, A, C, B);
            count += 1;
            System.out.println("Step " + count + ": Disk " + disks + ": "+ A + " --> " + C);
            HanoTower(disks - 1, B, A, C);
        } 
    }

    public void labeling(){
        String str1 = "Found the boy under tree.";
        String substr = "boy";
        boolean found = false;
        int length = str1.length() - substr.length();
        Testlabel:
        for (int i = 0; i < length; i++ ){
            int sublen = substr.length();
            int j = i;
            int k = 0;
            while (sublen-- != 0){
                if (str1.charAt(j++) != substr.charAt(k++)){
                    continue Testlabel;
                }
            }
            found = true;
            break Testlabel;
        }
        if (found){
            System.out.println("Found!");
        }else {
            System.out.println("Not Found!");
        }
    }

    public void varargs(int ... array){
        int sum = 0;
        for (int x: array){
            sum = sum + x;
        }
        System.out.println("\nSum of " + array.length + " number: " + sum);
    }

    public static void main(String[] args) {
        int Diskcount = 2;
        HanoTower(Diskcount, 'A', 'B', 'C');
        System.out.println("\nDisks: " + Diskcount +"\nTotal Steps: " + count);

        Method method = new Method();
        // method.labeling();
        method.varargs(1, 2, 3, 4, 5, 6);
    }
}
