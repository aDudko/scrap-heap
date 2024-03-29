<h2>Top K Frequent Elements</h2>


<p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <i>the <code>k</code> most frequent elements</i>. You may return the answer in <b>any order</b>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [1, 1, 1, 2, 2, 3], k = 2</code></p>
<p><b>Output:</b> <code>[1,2]</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1], k = 1</code></p>
<p><b>Output:</b> <code>[1]</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 10<sup>5</sup></code></li>
    <li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
    <li><p><code>k</code> is in the range <code>[1, the number of unique elements in the array].</code></p></li>
    <li><p>It is <b>guaranteed</b> that the answer is <b>unique</b>.</p></li>
</ul>


<p><b>Follow up:</b> Your algorithm's time complexity must be better than <code>O(n log n)</code>, where n is the array's size.</p>