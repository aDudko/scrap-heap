<h2>First Missing Positive</h2>


<p>Given an unsorted integer array <code>nums</code>, return <i>the smallest missing positive integer</i>.</p>

<p>You must implement an algorithm that runs in <code>O(n)</code> time and uses <code>O(1)</code> auxiliary space.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [1, 2, 0]</code></p>
<p><b>Output:</b> <code>3</code></p>
<p><b>Explanation:</b> <code>The numbers in the range [1, 2] are all in the array.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [3, 4, -1, 1]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> <code>1 is in the array but 2 is missing.</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [7, 8, 9, 11, 12]</code></p>
<p><b>Output:</b> <code>1</code></p>
<p><b>Explanation:</b> <code>The smallest positive integer 1 is missing.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>-2<sup>31</sup> <= nums[i] <= 2<sup>31</sup> - 1</code></li>
</ul>