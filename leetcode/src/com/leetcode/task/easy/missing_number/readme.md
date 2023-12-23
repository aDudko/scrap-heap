<h3>Missing Number</h3>

<p>Given an array <code>nums</code> containing <code>n</code> distinct numbers in the range <code>[0, n]</code>, return
<i>the only number in the range that is missing from the array</i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [3,0,1]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> <code>n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [0,1]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> <code>n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>nums = [9,6,4,2,3,5,7,0,1]</code></p>
<p><b>Output:</b> <code>8</code></p>
<p><b>Explanation:</b> <code>n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.</code></p>


<h5>Constraints:</h5>
<ul>
    <li><code>n == nums.length</code></li>
    <li><code>1 <= n <= 10<sup>4</sup></code></li>
    <li><code>0 <= nums[i] <= n</code></li>
    <li>All the numbers of <code>nums</code> are <b>unique</b>.</li>
</ul>

<p><b>Follow up:</b> Could you implement a solution using only <code>O(1)</code> extra space complexity and <code>O(n)</code> runtime complexity?</p>
