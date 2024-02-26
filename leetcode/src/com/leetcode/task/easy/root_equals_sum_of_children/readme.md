<h2>Root Equals Sum of Children</h2>


<p>You are given the <code>root</code> of a binary tree that consists of exactly <code>3</code> nodes: the root, its 
left child, and its right child.</p>

<p>Return <i>true</i> if the value of the root is equal to the sum of the values of its two children, or <i>false</i> 
otherwise.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>root = [10, 4, 6]</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true</code>.</p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>root = [5, 3, 1]</code></p>
<p><b>Output:</b> <code>false</code></p>
<p><b>Explanation:</b> <code>The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
5 is not equal to 3 + 1, so we return false</code>.</p>


<h3>Constraints:</h3>
<ul>
    <li>The tree consists only of the root, its left child, and its right child.</li>
    <li><code>-100 <= Node.val <= 100</code></li>
</ul>