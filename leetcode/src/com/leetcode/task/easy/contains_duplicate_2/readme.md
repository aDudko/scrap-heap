<h3>Contains Duplicate II</h3>

<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code> <i>if there are two 
<b>distinct indices</b> <code>i</code> and <code>j</code> in the array such that <code>nums[i] == nums[j]</code> and 
<code>abs(i - j) <= k</code></i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [1,2,3,1], k = 3</code></p>
<p><b>Output:</b> <code>true</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [1,0,1,1], k = 1</code></p>
<p><b>Output:</b> <code>true</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>nums = [1,2,3,1,2,3], k = 2</code></p>
<p><b>Output:</b> <code>false</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
    <li><code>0 <= k <= 10<sup>5</sup></code></li>
</ul>
