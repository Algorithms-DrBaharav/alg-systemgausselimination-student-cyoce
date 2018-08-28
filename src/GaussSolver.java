
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

        return null;
    }
    
        
    
    
    
    
    
    
    // Utility function
    static public void printMatrix(double[][] X,int minr, int minc, int maxr, int maxc, String str) {
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
