<h4>Given an integer <code>num</code>, return the number of steps to reduce it to zero.</h4>
<h5>In one step, if the current number is even, you have to divide it by <code>2</code>, otherwise, you have to subtract
<code>1</code> from it.</h5>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>num = 14</code></p>
<p><b>Output:</b> <code>6</code></p>
<p><b>Explanation:</b><br>
<ul>
<li>Step 1) 14 is even; divide by 2 and obtain 7.</li>
<li>Step 2) 7 is odd; subtract 1 and obtain 6.</li>
<li>Step 3) 6 is even; divide by 2 and obtain 3.</li>
<li>Step 4) 3 is odd; subtract 1 and obtain 2.</li>
<li>Step 5) 2 is even; divide by 2 and obtain 1.</li>
<li>Step 6) 1 is odd; subtract 1 and obtain 0.</li>
</ul>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>num = 8</code></p>
<p><b>Output:</b> <code>4</code></p>
<p><b>Explanation:</b><br>
<ul>
<li>Step 1) 8 is even; divide by 2 and obtain 4.</li>
<li>Step 2) 4 is even; divide by 2 and obtain 2.</li>
<li>Step 3) 2 is even; divide by 2 and obtain 1.</li>
<li>Step 4) 1 is odd; subtract 1 and obtain 0.</li>
</ul>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>num = 123</code></p>
<p><b>Output:</b> <code>12</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>0 <= num <= 10<sup>6</sup></code></li>
</ul>