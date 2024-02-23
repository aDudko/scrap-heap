<h3>Reshape the Matrix</h3>

<p>In MATLAB, there is a handy function called <code>reshape</code> which can reshape an <code>m x n</code> matrix into
a new one with a different size <code>r x c</code> keeping its original data.</p>
<p>You are given an <code>m x n</code> matrix <code>mat</code> and two integers <code>r</code> and <code>c</code>
representing the number of rows and the number of columns of the wanted reshaped matrix.</p>
<p>The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.</p>
<p>If the <code>reshape</code> operation with given parameters is possible and legal, output the new reshaped matrix;
Otherwise, output the original matrix.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>mat = [[1, 2],[3, 4]], r = 1, c = 4</code></p>
<p><b>Output:</b> <code>[[1, 2, 3, 4]]</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>mat = [[1, 2],[3, 4]], r = 2, c = 4</code></p>
<p><b>Output:</b> <code>[[1, 2],[3, 4]]</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>m == mat.length</code></li>
    <li><code>n == mat[i].length</code></li>
    <li><code>1 <= m, n <= 100</code></li>
    <li><code>-1000 <= mat[i][j] <= 1000</code></li>
    <li><code>1 <= r, c <= 300</code></li>
</ul>