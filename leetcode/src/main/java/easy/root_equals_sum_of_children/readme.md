<h4>You are given the <code>root</code> of a binary tree that consists of exactly <code>3</code> nodes: the root, its left child, and its right child.</h4>

<h5>Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.</h5>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>root = [10, 4, 6]</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return <code>true</code>.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>root = [5, 3, 1]</code></p>
<p><b>Output:</b> <code>false</code></p>
<p><b>Explanation:</b> The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
5 is not equal to 3 + 1, so we return <code>false</code>.</p>

<h5>Constraints:</h5>
<ul>
    <li>The tree consists only of the root, its left child, and its right child.</li>
    <li><code>-100 <= Node.val <= 100</code></li>
</ul>