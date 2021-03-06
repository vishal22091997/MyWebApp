package Programs;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;
 
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        pairgcd solver = new pairgcd();
        solver.solve(1, in, out);
        out.close();
    }
 
    static class pairgcd {
        int[] count1, count2;
 
        public void solve(int testNumber, InputReader in, PrintWriter out) {
 
             
                int n = in.nextInt();
                int ar1[] = new int[1000001];
                int ar2[] = new int[1000001];
                for (int i = 0; i < n; i++) {
                    ar1[in.nextInt()]++;
                }
                for(int i=0;i<n;i++){
                	ar2[in.nextInt()]++;
                }
                count1 = new int[ar1.length];
                count2 = new int[ar2.length];
                for (int i = 1; i < ar1.length; i++) {
                    for (int j = i; j < ar1.length; j += i) {
                        count1[i] += ar1[j];
                        count2[i] += ar2[j];
                    }
                }
                int ans = 0;
                for (int i = 1; i < ar1.length; i++) {
                    if (count1[i]+count2[i] > 1) {
                        ans = Math.max(ans, i);
                    }
                }
                /*dp = new long[1000001];
                Arrays.fill(dp, -1);
                solve(1);
                long ans = 0;
                for (int i = 1; i <= 1e6; i++) {
                    if (dp[i] >= 1)
                        ans = Math.max(ans, i);
                }
                */
                 
                out.println(2*ans);
             
        }
 
    }
 
    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar;
        private int snumChars;
 
        public InputReader(InputStream st) {
            this.stream = st;
        }
 
        public int read() {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }
 
        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }
 
        public boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }
 
    }
}
 