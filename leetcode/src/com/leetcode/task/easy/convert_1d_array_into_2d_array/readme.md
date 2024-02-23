<h3>Convert 1D Array Into 2D Array</h3>

<p>You are given a <b>0-indexed</b> 1-dimensional (1D) integer array <code>original</code>, and two integers, 
<code>m</code> and <code>n</code>. You are tasked with creating a 2-dimensional (2D) array with <code>m</code> rows and 
<code>n</code> columns using all the elements from <code>original</code>.</p>
<p>The elements from indices <code>0</code> to <code>n - 1</code> (<b>inclusive</b>) of <code>original</code> should 
form the first row of the constructed 2D array, the elements from indices <code>n</code> to <code>2 * n - 1</code> 
(<b>inclusive</b>) should form the second row of the constructed 2D array, and so on.</p>
<p>Return <i>an <code>m x n</code> 2D array constructed according to the above procedure, or an empty 2D array if it is 
impossible</i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>original = [1, 2, 3, 4], m = 2, n = 2</code></p>
<p><b>Output:</b> <code>[[1,2], [3,4]]</code></p>
<p><b>Explanation:</b> <code>The constructed 2D array should contain 2 rows and 2 columns. The first group of n = 2 
elements in original, [1, 2], becomes the first row in the constructed 2D array. The second group of n = 2 elements in 
original, [3, 4], becomes the second row in the constructed 2D array.</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>original = [1, 2, 3], m = 1, n = 3</code></p>
<p><b>Output:</b> <code>[[1, 2, 3]]</code></p>
<p><b>Explanation:</b> <code>The constructed 2D array should contain 1 row and 3 columns. Put all three elements in 
original into the first row of the constructed 2D array.</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>original = [1, 2], m = 1, n = 1</code></p>
<p><b>Output:</b> <code>[]</code></p>
<p><b>Explanation:</b> <code>There are 2 elements in original. It is impossible to fit 2 elements in a 1x1 2D array, 
so return an empty 2D array.</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= original.length <= 5 * 10<sup>4</sup></code></li>
    <li><code>1 <= original[i] <= 10<sup>5</sup></code></li>
    <li><code>1 <= m, n <= 4 * 10<sup>4</sup></code></li>
</ul>