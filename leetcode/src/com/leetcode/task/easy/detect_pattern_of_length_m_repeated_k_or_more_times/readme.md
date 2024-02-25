<h2>Detect Pattern of Length M Repeated K or More Times</h2>


<p>Given an array of positive integers <code>arr</code>, find a pattern of length <code>m</code> that is repeated 
<code>k</code> or more times.</p>

<p>A <b>pattern</b> is a subarray (consecutive sub-sequence) that consists of one or more values, repeated multiple 
times <b>consecutively</b> without overlapping. A pattern is defined by its length and the number of repetitions.</p>

<p>Return <i><code>true</code> if there exists a pattern of length <code>m</code> that is repeated <code>k</code> or 
more times, otherwise return <code>false</code></i>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>arr = [1, 2, 4, 4, 4, 4], m = 1, k = 3</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>The pattern <b>(4)</b> of length 1 is repeated 4 consecutive times. Notice that pattern 
can be repeated k or more times but not less.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>arr = [1, 2, 1, 2, 1, 1, 1, 3], m = 2, k = 2</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>The pattern <b>(1, 2)</b> of length 2 is repeated 2 consecutive times. Another valid 
pattern <b>(2, 1)</b> is also repeated 2 times.</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>arr = [1, 2, 1, 2, 1, 3], m = 2, k = 3</code></p>
<p><b>Output:</b> <code>false</code></p>
<p><b>Explanation:</b> <code>The pattern (1,2) is of length 2 but is repeated only 2 times. There is no pattern of 
length 2 that is repeated 3 or more times.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>2 <= arr.length <= 100</code></li>
    <li><code>1 <= arr[i] <= 100</code></li>
    <li><code>1 <= m <= 100</code></li>
    <li><code>2 <= k <= 100</code></li>
</ul>