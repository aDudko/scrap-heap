<h2>Mean of Array After Removing Some Elements</h2>


<p>Given an integer array <code>arr</code>, return <i>the mean of the remaining integers after removing the smallest 
<code>5%</code> and the largest <code>5%</code> of the elements</i>.</p>

<p>Answers within <code>10<sup>-5</sup></code> of the <b>actual answer</b> will be considered accepted.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>arr = [1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3]</code></p>
<p><b>Output:</b> <code>2.00000</code></p>
<p><b>Explanation:</b> <code>After erasing the minimum and the maximum values of this array, all elements are equal to 2, 
so the mean is 2.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>arr = [6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0]</code></p>
<p><b>Output:</b> <code>4.00000</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>arr = [6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5,
10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4]</code></p>
<p><b>Output:</b> <code>4.77778</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>20 <= arr.length <= 1000</code></li>
    <li><code>arr.length <b>is a multiple</b> of 20.</code>.</li>
    <li><code>0 <= arr[i] <= 10<sup>5</sup></code>.</li>
</ul>