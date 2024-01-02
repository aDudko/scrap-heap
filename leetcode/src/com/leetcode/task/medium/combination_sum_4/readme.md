<h3>Combination Sum IV</h3>

<p>Given an array of <b>distinct</b> integers <code>nums</code> and a target integer <code>target</code>, return 
<i>the number of possible combinations that add up to <code>target</code></i>.</p>
<p>The test cases are generated so that the answer can fit in a <b>32-bit</b> integer.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [1,2,3], target = 4</code></p>
<p><b>Output:</b> <code>7</code></p>
<p><b>Explanation:</b> The possible combination ways are:</p>
<ul>
    <li><code>(1, 1, 1, 1)</code></li>
    <li><code>(1, 1, 2)</code></li>
    <li><code>(1, 2, 1)</code></li>
    <li><code>(1, 3)</code></li>
    <li><code>(2, 1, 1)</code></li>
    <li><code>(2, 2)</code></li>
    <li><code>(3, 1)</code></li>
</ul>
<p>Note that different sequences are counted as different combinations.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [9], target = 3</code></p>
<p><b>Output:</b> <code>0</code></p>


<h5>Constraints:</h5>
<ul> 
    <li><code>1 <= nums.length <= 200</code></li>
    <li><code>1 <= nums[i] <= 1000</code></li>
    <li>All the elements of <code>nums</code> are unique.</li>
    <li><code>1 <= target <= 1000</code></li>
</ul>

<p><b>Follow up:</b> What if negative numbers are allowed in the given array? How does it change the problem? 
What limitation we need to add to the question to allow negative numbers?</p>
