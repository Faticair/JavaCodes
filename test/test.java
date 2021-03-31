import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;
// import java.security.MessageDigest;
import java.io.*;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class test {
    public static void main(final String[] args) throws IOException {
        Date today = new Date();
        SimpleDateFormat sdft = new SimpleDateFormat("E yyyy-MM-dd HH:mm:ss");
        System.out.println("****************************");
        System.out.println("Today is " + today.toString());
        System.out.println("Format: " + sdft.format(today));
        System.out.println(String.format(Locale.UK, "%tc", today));
        System.out.println("****************************");

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String myline = "";
        // int i = 0;
        // String[] mylines = new String[10];
        // System.out.println("Please enter your command(enter 'q' to exit):");        
        // myline = br.readLine();
        // while (!myline.equals("q") && i < 10){
        //     mylines[i] = myline;
        //     myline = br.readLine();
        //     i += 1;
        // }
        // String res = "";
        // for (String l : mylines){
        //     if (l == null) continue;
        //     res = res + l + " ";
        // }
        // System.out.println(res);

        // helloworld a = new helloworld(hellolist.JAVA);
        // System.out.println(String.format("Hello, %s", a.word));
        // a.gethello();

        // data b = new data();
        // b.intnum = 1010;
        // b.showint();
        // b.bytenum = (byte)b.intnum;
        // b.showbyte();

        // operater c = new operater();
        // // c.selfleftadd(10);
        // // c.selfrightadd(20);
        // c.byteoperate(15, 64);

        // structure d = new structure();
        // int[] mynum = {1,2,3};
        // int[] myarr = new int[3];
        // for (int i = 2; i > -1; i--) {
        //     myarr[2 - i] = mynum[i];
        // }
        // d.enhanced_for(myarr);
        // d.switches('A');

        // regxx e = new regxx();
        // String text = "ip address: 127.0.0.1 189.1.1.1 10.0.32.191";
        // if (e.matchup(text)) {
        //     e.matchstring(text);
        // }
        // e.matchends(text);

        System.out.println("***************** Data structure: BitSet *****************");
        BitSet bitset1 = new BitSet(16);
        BitSet bitset2 = new BitSet(16);
        Random r1 = new Random();
        for (int i = 0; i<16; i++){
            int num1 = r1.nextInt(16);
            int num2 = r1.nextInt(16);
            bitset1.set(num1);
            bitset2.set(num2);
        }
        System.out.println("bitset1 is " + bitset1);
        System.out.println("bitset2 is " + bitset2);
        BitSet bitset3 = (BitSet)bitset1.clone();
        bitset1.and(bitset2);
        bitset3.xor(bitset2);
        System.out.println("\nbitset1 AND bitset2 is " + bitset1);
        // System.out.println("bitset3 is " + bitset3);
        System.out.println("bitset1 XOR bitset2 is " + bitset3);
        System.out.println("**********************************************************\n");

        System.out.println("***************** Data structure: Vector *****************");
        Vector<Integer> v = new Vector<Integer>(3, 4);
        Random r2 = new Random();
        System.out.println("Initial size:" + v.size());
        System.out.println("Initial capacity:" + v.capacity());
        for (int i = 0; i < 11; i++){
            v.addElement(r2.nextInt(100));
            System.out.println("Vector size:" + v.size() + "\tVector capacity:" + v.capacity());
        }
        System.out.println("\nVector: " + v.toString());
        v.setSize(12);
        System.out.println("\nSet size as 12:");
        System.out.println("Vector size:" + v.size() + "\tVector capacity:" + v.capacity());
        System.out.println("\nVector: " + v.toString());
        System.out.println("**********************************************************\n");

        System.out.println("********************* ArrayList *********************");
        ArrayList<String> myarray = new ArrayList<String>();
        myarray.add("BJ");
        myarray.add("SH");
        myarray.add("WH");
        myarray.add("GZ");
        myarray.add("CQ");
        System.out.println("My ArrayList size: " + myarray.size());
        System.out.println("My ArrayList: " + myarray);
        System.out.println("Using get(3) to visit element: " + myarray.get(3));
        myarray.set(3, "XM");
        System.out.println("Using set(3, \"XM\") to modify element: " + myarray.get(3));
        for (String j : myarray){
            System.out.println(j + " is a city.");
        }
        Collections.sort(myarray);
        System.out.println("Using Collections.sort(): " + myarray);
        System.out.println("*****************************************************\n");

        System.out.println("********************* Hashset *********************");
        HashSet<Integer> myhashset = new HashSet<Integer>();
        Random r3 = new Random();
        for ( int i = 0; i < 8; i++){
            int tmp = r3.nextInt(8);
            System.out.println("Add " + tmp + " to hashset.");
            myhashset.add(tmp);
        }
        System.out.println("My HashSet has " + myhashset.size() + " elements:\n" + myhashset);
        Iterator<Integer> it = myhashset.iterator();
        while (it.hasNext()){
            System.out.println("Iterator allocate: " + it.next());
        }

        System.out.println("***************************************************\n");

        System.out.println("********************* Hashmap *********************");
        // MessageDigest md = MessageDigest.getInstance("MD5");
        HashMap<Integer, String> myhashmap = new HashMap<Integer, String>();
        myhashmap.put(0, "SH");
        myhashmap.put(1, "PK");
        myhashmap.put(10, "GZ");
        myhashmap.put(11, "SZ");
        for (Integer i : myhashmap.keySet()) {
            System.out.println("key: " + i + " --> value: " + myhashmap.get(i));
        }

        System.out.println("***************************************************\n");
    }
}
