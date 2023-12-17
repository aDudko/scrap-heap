package percolation;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

public class PercolationStats {
    private static final double CONFIDENCE_95 = 1.96;
    private final int totalTrials;
    private final double[] trialResults;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials) {
        if (n <= 0 || trials <= 0) throw new IllegalArgumentException("N must be greather than 0");
        totalTrials = trials;
        trialResults = new double[totalTrials];
        for (int i = 0; i < totalTrials; i++) {
            Percolation p = new Percolation(n);
            boolean[][] pickedSites = new boolean[n][n];
            int row;
            int col;
            while (!p.percolates()) {
                do {
                    row = StdRandom.uniform(0, n);
                    col = StdRandom.uniform(0, n);
                } while (pickedSites[row][col]);
                p.open(row + 1, col + 1);
                pickedSites[row][col] = true;
            }
            int openSites = p.numberOfOpenSites();
            double result = (double) openSites / (n * n);
            trialResults[i] = result;
        }
    }

    // test client (see below)
    public static void main(String[] args) {
        int gridSize = 10;
        int totalTrials = 10;
        if (args.length >= 2) {
            gridSize = Integer.parseInt(args[0]);
            totalTrials = Integer.parseInt(args[1]);
        }
        PercolationStats ps = new PercolationStats(gridSize, totalTrials);

        String confidence = "[" + ps.confidenceLo() + ", " + ps.confidenceHi() + "]";
        StdOut.println("mean                    = " + ps.mean());
        StdOut.println("stddev                  = " + ps.stddev());
        StdOut.println("95% confidence interval = " + confidence);
    }

    // sample mean of percolation threshold
    public double mean() {
        return StdStats.mean(trialResults);
    }

    // sample standard deviation of percolation threshold
    public double stddev() {
        return StdStats.stddev(trialResults);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo() {
        return mean() - ((CONFIDENCE_95 * stddev()) / Math.sqrt(totalTrials));
    }

    // high endpoint of 95% confidence interval
    public double confidenceHi() {
        return mean() + ((CONFIDENCE_95 * stddev()) / Math.sqrt(totalTrials));
    }
}
