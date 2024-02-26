<h2>Running Sum of 1<sup>d</sup> Array</h2>


<p>Given an array <code>nums</code>. We define a running sum of an array as <code>runningSum[i] = sum(nums[0] … nums[i])</code>. Return <i>the running sum of <code>nums</code></i>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [1, 2, 3, 4]</code></p>
<p><b>Output:</b> <code>[1, 3, 6, 10]</code></p>
<p><b>Explanation:</b> Running sum is obtained as follows: <code>[1, 1+2, 1+2+3, 1+2+3+4]</code>.</p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1, 1, 1, 1, 1]</code></p>
<p><b>Output:</b> <code>[1, 2, 3, 4, 5]</code></p>
<p><b>Explanation:</b> Running sum is obtained as follows: <code>[1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1]</code>.</p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [3, 1, 2, 10, 1]</code></p>
<p><b>Output:</b> <code>[3, 4, 6, 16, 17]</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 1000</code></li>
    <li><code>-10<sup>6</sup> <= nums[i] <= 10<sup>6</sup></code></li>
</ul>