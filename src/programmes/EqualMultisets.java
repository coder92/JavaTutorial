package programmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.hackerearth.com/challenge/competitive/january-circuits-19/algorithm/make-the-multisets-equal-b48e764d/
public class EqualMultisets {
    public static void main(String args[] ) throws Exception {
        

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String name = br.readLine();                // Reading input from STDIN
       // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int n = Integer.parseInt(br.readLine());
        long[] A = new long[n];
        long[] B = new long[n];
        
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");
        
        
      
        for(int i=0;i<n;i++){
            A[i] = Long.parseLong(strA[i]);
        }
        for(int i=0;i<n;i++){
        	B[i] = Long.parseLong(strB[i]);
        }
        
        
        //logic
        //sort A - 1 3 4
        //sort B - 2 2 6
        //B[i]-A[i] -> 1 step| mod(-1) |  
        //
        
        Arrays.sort(A);
        Arrays.sort(B);
        long steps =0;
        for(int i=0;i<n;i++){
            steps += Math.abs(A[i]-B[i]);
        }
        System.out.println(steps);
    }
}
