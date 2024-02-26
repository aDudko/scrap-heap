<h2>Third Maximum Number</h2>


<p>Given an integer array <code>nums</code>, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [3,2,1]</code></p>
<p><b>Output:</b> <code>1</code></p>
<p><b>Explanation:</b><code>
The first distinct maximum is 3.<br>
The second distinct maximum is 2.<br>
The third distinct maximum is 1.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1,2]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b><code>
The first distinct maximum is 2.<br>
The second distinct maximum is 1.<br>
The third distinct maximum does not exist, so the maximum (2) is returned instead.</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [2,2,3,1]</code></p>
<p><b>Output:</b> <code>1</code></p>
<p><b>Explanation:</b><code>
The first distinct maximum is 3.<br>
The second distinct maximum is 2 (both 2's are counted together since they have the same value).<br>
The third distinct maximum is 1.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 10<sup>4</sup></code></li>
    <li><code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code></li>
</ul>


<p><b>Follow up:</b> Can you find an <code>O(n)</code> solution?</p>