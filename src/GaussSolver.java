
/**
 * Solves a linear system of equations, using Gauss elimination
 * 
 * @author Dr. Baharav
 */

public class GaussSolver {



    
    /**
     * Holds all coefficients and results
     */
    
    private int n;              // number of unknowns
    private double[][] bigA;    // matrix of size n x (n+1)

    
    /**
     * @param a - matrix of coefficients
     * @param b - vector of results
     * 
     * Precondition: a[][] is a square matrix of size nxn, and b.length is n.
     * 
     * Deep copy parameters into the big array, combining coefficients and values.
     * 
     */
        
    public GaussSolver(double[][] a, double[] b){
        
        n = a.length;
        
        bigA = new double[n][n+1];
        
        for (int rr=0; rr<n; ++rr) {
            for (int cc=0; cc<n; ++cc){
                bigA[rr][cc] = a[rr][cc];       
            }
         bigA[rr][n] = b[rr];
        }
    }
    
    /**
     * @return the variables solution. If none, return null.
     */
    public double[] Solve(){
        // Your code here!
        
        printMatrix(bigA, 0, 0, n, n+1, "Before Starting: ");
        
        for(int r = 0; r < n; r++){
            
            if(bigA[r][r] == 0){
                int r0 = r;
                while(r0 < n && bigA[r0][r] == 0) r0++;
                          
                if(r0 == n) return null;
                
                double[] tmp = bigA[r0];
                bigA[r0] = bigA[r];
                bigA[r] = tmp;
                
            }
            
            double scale = bigA[r][r];
            
            for(int c = r; c < n+1; c++){
                bigA[r][c] /= scale;
            }
            
            for(int rs = r+1; rs < n; rs++){
                double ratio = bigA[rs][r];
                for(int c = r; c < n+1; c++){
                    bigA[rs][c] -= ratio * bigA[r][c];
                }
            }
            
            printMatrix(bigA, 0, 0, n, n+1, "After iteration " + (r+1) + ":");
        }
        
        double[] x = new double[n];
        
        for(int r = n-1; r >= 0; r--){
            x[r]= bigA[r][n];
            for(int c= r+1; c<n; c++){
                x[r] -= bigA[r][c]*x[c];
            }
        }
        
        
        return x;
    }
    
        
    
    
    
    
    
    
    // Utility function
    static public void printMatrix(double[][] X, int minr, int minc, int maxr, int maxc, String str) {
        int rows=X.length ;
        int cols=X[0].length;

        maxr = Math.min(rows, maxr);
        maxc = Math.min(cols, maxc);
        
        System.out.println("\n% "+str);
        System.out.println("A=[...");
        for (int rr=minr; rr<maxr; ++rr) {
            for (int cc=minc; cc<maxc; ++cc) {
                System.out.format(" %5.2f ",X[rr][cc]);
            }   
            System.out.println();
        }
        System.out.println("];");
        
    }
    static public void printVector(double[] X,int minr, int maxr, String str) {
        int rows=X.length ;

        maxr = Math.min(rows, maxr);
        
        System.out.println("\n% "+str);
        System.out.print("b=[ ");
        for (int rr=minr; rr<maxr; ++rr) {
            System.out.format(" %5.2f ",X[rr]);
        }
        System.out.println("]; b=b';");
        System.out.println("x=A\\b; %y=reshape(x,rows,cols); imagesc(y)");
        
    }
    
}
