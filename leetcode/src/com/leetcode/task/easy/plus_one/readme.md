<h3>Plus One</h3>

<p>You are given a <b>large integer</b> represented as an integer array <code>digits</code>, where each <code>digits[i]</code> 
is the <code>i<sup>th</sup></code> digit of the integer. The digits are ordered from most significant to least significant 
in left-to-right order. The large integer does not contain any leading <code>0</code>'s.</p>

<p>Increment the large integer by one and return <i>the resulting array of digits</i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>digits = [1, 2, 3]</code></p>
<p><b>Output:</b> <code>[1, 2, 4]</code></p>
<p><b>Explanation:</b> The array represents the integer 123.
Incrementing by one gives <code>123 + 1 = 124</code>.
Thus, the result should be <code>[1, 2, 4]</code>.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>digits = [4, 3, 2, 1]</code></p>
<p><b>Output:</b> <code>[4, 3, 2, 2]</code></p>
<p><b>Explanation:</b> The array represents the integer 4321.
Incrementing by one gives <code>4321 + 1 = 4322</code>.
Thus, the result should be <code>[4, 3, 2, 2]</code>.</p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>digits = [9]</code></p>
<p><b>Output:</b> <code>[1, 0]</code></p>
<p><b>Explanation:</b> The array represents the integer 9.
Incrementing by one gives <code>9 + 1 = 10</code>.
Thus, the result should be <code>[1, 0]</code>.</p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= digits.length <= 100</code></li>
    <li><code>0 <= digits[i] <= 9</code></li>
    <li><code>digits</code> does not contain any leading <code>0</code>'s.</li>
</ul>