<h3>Make Array Zero by Subtracting Equal Amounts</h3>

<p>You are given a non-negative integer array <code>nums</code>. In one operation, you must:</p>
<ul>
    <li>Choose a positive integer <code>x</code> such that <code>x</code> is less than or equal to the 
<b>smallest non-zero</b> element in nums.</li>
    <li>Subtract <code>x</code> from every <b>positive</b> element in <code>nums</code>.</li>
</ul>
<p>Return <i>the <b>minimum</b> number of operations to make every element in <code>nums</code> equal to <code>0</code></i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [1,5,0,3,5]</code></p>
<p><b>Output:</b> <code>3</code></p>
<p><b>Explanation:</b><br>
    <code>
        In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].<br>
        In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].<br>
        In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
    </code>
</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [0]</code></p>
<p><b>Output:</b> <code>0</code></p>
<p><b>Explanation:</b><code>Each element in nums is already 0 so no operations are needed.</code>


<h5>Constraints:</h5>
<ul>
    <li><code>1 <= nums.length <= 100</code></li>
    <li><code>0 <= nums[i] <= 100</code></li>
</ul>
