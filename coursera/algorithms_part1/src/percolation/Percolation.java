package percolation;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private static final int VIRTUAL_TOP = 0;
    private final boolean[][] grid;
    private final int gridSize;
    private final WeightedQuickUnionUF openConnections;
    private final WeightedQuickUnionUF fullConnections;
    private final int virtualBottom;
    private int totalOpenSites;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        if (n <= 0) throw new IllegalArgumentException("N must be greater than 0");

        gridSize = n;
        grid = new boolean[n][n];
        int gridSizeSquared = gridSize * gridSize;
        int openConnectionsSize = gridSizeSquared + 2;
        int fullConnectionsSize = gridSizeSquared + 1;
        openConnections = new WeightedQuickUnionUF(openConnectionsSize);
        fullConnections = new WeightedQuickUnionUF(fullConnectionsSize);
        virtualBottom = gridSizeSquared + 1;
    }

    // test client (optional)
    public static void main(String[] args) {

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        validateSite(row, col);
        if (isOpen(row, col)) return;
        grid[row - 1][col - 1] = true;
        totalOpenSites++;
        int connectionIndex = connectionsIndex(row, col);
        if (row == 1) {
            openConnections.union(VIRTUAL_TOP, connectionIndex);
            fullConnections.union(VIRTUAL_TOP, connectionIndex);
        }
        if (row == gridSize) {
            openConnections.union(virtualBottom, connectionIndex);
        }
        connect(connectionIndex, row, col - 1);
        connect(connectionIndex, row, col + 1);
        connect(connectionIndex, row - 1, col);
        connect(connectionIndex, row + 1, col);
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        validateSite(row, col);
        return grid[row - 1][col - 1];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        validateSite(row, col);
        boolean site = grid[row - 1][col - 1];
        if (!site) {
            return false;
        }
        return fullConnections.find(VIRTUAL_TOP) == fullConnections.find(connectionsIndex(row, col));
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return totalOpenSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return openConnections.find(VIRTUAL_TOP) == openConnections.find(virtualBottom);
    }

    private int connectionsIndex(int row, int col) {
        return gridSize * (row - 1) + col;
    }

    private void validateSite(int row, int col) {
        if (!isOnGrid(row, col)) {
            throw new IllegalArgumentException("Index is out of grid's bounds");
        }
    }

    private boolean isOnGrid(int row, int col) {
        int shiftRow = row - 1;
        int shiftCol = col - 1;
        return (shiftRow >= 0 && shiftCol >= 0 && shiftRow < gridSize && shiftCol < gridSize);
    }

    private void connect(int openSiteConnectionIndex, int siteRow, int siteCol) {
        if (isOnGrid(siteRow, siteCol) && isOpen(siteRow, siteCol)) {
            openConnections.union(openSiteConnectionIndex, connectionsIndex(siteRow, siteCol));
            fullConnections.union(openSiteConnectionIndex, connectionsIndex(siteRow, siteCol));
        }
    }
}