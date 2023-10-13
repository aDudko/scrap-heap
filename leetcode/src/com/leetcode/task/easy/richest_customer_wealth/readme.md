<h4>You are given an <code>m x n</code> integer grid <code>accounts</code> where <code>accounts[i][j]</code> is the 
amount of money the <code>i<sup>th</sup></code> customer has in the <code>j<sup>th</sup></code> bank. Return the 
<code>wealth</code> that the richest customer has.</h4>

<p>A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer 
that has the maximum wealth.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>accounts = [[1, 2, 3], [3, 2, 1]]</code></p>
<p><b>Output:</b> <code>6</code></p>
<p><b>Explanation:</b><br>
<code>1st customer has wealth = 1 + 2 + 3 = 6</code><br>
<code>2nd customer has wealth = 3 + 2 + 1 = 6</code><br>
Both customers are considered the richest with a wealth of 6 each, so return 6.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>Input: accounts = [[1, 5], [7, 3], [3, 5]]</code></p>
<p><b>Output:</b> <code>10</code></p>
<p><b>Explanation:</b><br>
<code>1st customer has wealth = 6</code><br>
<code>2nd customer has wealth = 10</code><br>
<code>3rd customer has wealth = 8</code><br>
The 2nd customer is the richest with a wealth of 10.</p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>accounts = [[2, 8, 7], [7, 1, 3], [1, 9, 5]]</code></p>
<p><b>Output:</b> <code>17</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>m == accounts.length</code></li>
    <li><code>n == accounts[i].length</code></li>
    <li><code>1 <= m</code>, <code>n <= 50</code></li>
    <li><code>1 <= accounts[i][j] <= 100</code></li>
</ul>