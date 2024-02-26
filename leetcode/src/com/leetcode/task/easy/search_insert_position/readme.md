<h2>Search Insert Position</h2>


<p>Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.</p>

<p>You must write an algorithm with <code>O(log n)</code> runtime complexity.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [1, 3, 5, 6], target = 5</code></p>
<p><b>Output:</b> <code>2</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1, 3, 5, 6], target = 2</code></p>
<p><b>Output:</b> <code>1</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [1, 3, 5, 6], target = 7</code></p>
<p><b>Output:</b> <code>4</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 10<sup>4</sup></code></li>
    <li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
    <li><code>nums</code> contains <b>distinct</b> values sorted in <b>ascending</b> order.</li>
    <li><code>-10<sup>4</sup> <= target <= 10<sup>4</sup></code></li>
</ul>