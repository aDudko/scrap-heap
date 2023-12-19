<h3>Contains Duplicate III</h3>

<p>You are given an integer array nums and two integers indexDiff and valueDiff.</p>
<p>Find a pair of indices (i, j) such that:</p>
<ul>
    <li><code>i != j</code></li>
    <li><code>abs(i - j) <= indexDiff</code></li>
    <li><code>abs(nums[i] - nums[j]) <= valueDiff</code></li>
</ul>
<p>Return <code>true</code> if such pair exists or <code>false</code> otherwise.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>>nums = [1,2,3,1], indexDiff = 3, valueDiff = 0</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3</code></p>
<p><b>Output:</b> <code>false</code></p>
<p><b>Explanation:</b> <code>After trying all the possible pairs (i, j), we cannot satisfy the three conditions, 
so we return false.</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
    <li><code>1 <= indexDiff <= nums.length</code></li>
    <li><code>0 <= valueDiff <= 10<sup>9</sup></code></li>
</ul>
