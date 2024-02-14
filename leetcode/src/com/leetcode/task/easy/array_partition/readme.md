<h3>Array Partition</h3>

<p>Given an integer array <code>nums</code> of <code>2n</code> integers, group these integers into <code>n</code>
pairs <code>(a<sub>1</sub>, b<sub>1</sub>), (a<sub>2</sub>, b<sub>2</sub>), ..., (a<sub>n</sub>, b<sub>n</sub>)</code>
such that the sum of <code>min(ai, bi)</code> for all i is <b>maximized</b>. Return the <i>maximized sum</i>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [1, 4, 3, 2]</code></p>
<p><b>Output:</b> <code>4</code></p>
<p><b>Explanation:</b> <code>All possible pairings (ignoring the ordering of elements) are:<br>
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3<br>
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3<br>
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4<br>
So the maximum possible sum is 4.</code>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [6, 2, 6, 5, 1, 2]</code></p>
<p><b>Output:</b> <code>9</code></p>
<p><b>Explanation:</b> <code>The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= n <= 10<sup>4</sup></code></li>
    <li><code>nums.length == 2 * n</code></li>
    <li><code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code></li>
</ul>