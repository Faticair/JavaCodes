import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.text.SimpleDateFormat;

public class JavaCase {

    public void Case_delstr(){
        String str1 = "Goodbye, my friend.";
        System.out.println("Origin string: " + str1);
        System.out.println("Remove the 5th char: " + removeChar(str1, 5));
    }

    private String removeChar(String s, int position){
        return s.substring(0, position) + s.substring(position + 1);
    }

    public void Case_reverse(){
        String str2 = "Fire and ice.";
        String reverse_str2 = new StringBuffer(str2).reverse().toString();
        System.out.println("Origin string: " + str2);
        System.out.println("Reversed: " + reverse_str2);
    }

    public void Case_replace(){
        String str3 = "Good Morning, Madam.";
        System.out.println("Origin string: " + str3);
        System.out.println("Replace: " + str3.replace("o", "0"));
        System.out.println("Replace First: " + str3.replaceFirst("o", "0"));
    }
    
    public void Case_findindex(){
        String str4 = "You jump, I jump.";
        int index = str4.indexOf("jump");
        System.out.println("Origin string: " + str4);
        if(index == -1){
            System.out.println("Not found!");
        }else{
            System.out.println("'jump' is at: " + index);
        }
    }

    public void Case_split(){
        String str5 = "A--Sentence--with--line";
        String[] tmp;
        tmp = str5.split("-");
        String resstr = "";
        for (String ch: tmp){
            resstr = resstr + ch + " ";
        }
        System.out.println("Origin string: " + str5);
        System.out.println("Using 'split()': " + resstr);
        StringTokenizer st = new StringTokenizer(str5, "-");
        String resstr1 = "";
        while(st.hasMoreElements()){
            resstr1 = resstr1 + st.nextElement() + " ";
        }
        System.out.println("Using StringTokenizer: " + resstr1);
    }

    // public void Case_performance(){
    //     long timestart = System.nanoTime();
    //     // long timestart = System.currentTimeMillis();
    //     for(int i = 0; i < 100; i++){
    //         // String str6 = new String("Good boy.");
    //         String str6 = "Good boy.";
    //     }
    //     long timeend = System.nanoTime();
    //     System.out.println("Time used: " + (timeend - timestart) + " ns.");
    // }
    
    public void Case_append(){
        long startTime = System.nanoTime();
        // long startTime = System.currentTimeMillis();
        StringBuffer str6 = new StringBuffer();
        str6.append("Using ");
        str6.append("Append ");
        str6.append("to ");
        str6.append("extend.");
        long endTime = System.nanoTime();
        // long endTime = System.currentTimeMillis();
        System.out.println("append() uses time: " + (endTime - startTime) + "ns.");
    }
    
    public void Case_insert(){
        int a[] = {-1, 8, 4, 9, -3};
        Arrays.sort(a);
        System.out.println("Sorted array: ");
        printArray(a);
        int index = Arrays.binarySearch(a, 9);
        System.out.println("\nElement is at " + index);
        int insertindex = a.length;
        a = insertElement(a, (int)(Math.random()*10)+10, insertindex);
        printArray(a);
    }

    private int[] insertElement(int src[], int myelement, int myindex){
        int length = src.length;
        int dst[] = new int[length + 1];
        System.arraycopy(src, 0, dst, 0, myindex);
        dst[myindex] = myelement;
        System.arraycopy(src, myindex, dst, myindex + 1, length - myindex);
        return dst;
    }

    private void printArray(int array[]){
        for (int i = 0; i < array.length; i++){
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
    }

    public void Case_reverseArray(){
        Integer a[] = {1, 2, 3, 4, 5, 6};
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
        System.out.println("max: " + Collections.max(Arrays.asList(a)));
        System.out.println("min: " + Collections.min(Arrays.asList(a)));
    }

    public void Case_merge(){
        Integer a[] = {1, 2, 3, 4};
        Integer b[] = {11, 12, 13, 14};
        ArrayList<Integer> mergelist = new ArrayList<Integer>(Arrays.asList(a));
        mergelist.addAll(Arrays.asList(b));
        Object[] res = mergelist.toArray();
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        Date today = new Date();
        String dateformat = "yyyy-MM-dd";
        SimpleDateFormat sdft = new SimpleDateFormat(dateformat);
        System.out.println("### Today is " + sdft.format(today) + " ###");

        System.out.println("\n### Case ###");
        JavaCase javacase = new JavaCase();
        javacase.Case_merge();
    }
}
