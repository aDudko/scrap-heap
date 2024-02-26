<h2>Neither Minimum nor Maximum</h2>


<p>Given an integer array <code>nums</code> containing <b>distinct positive</b> integers, find and return <b>any</b> number from the array that is neither the <b>minimum</b> nor the <b>maximum</b> value in the array, or <code>-1</code> if there is no such number.</p>

<p>Return <i>the selected integer</i>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [3, 2, 1, 4]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> In this example, the minimum value is 1 and the maximum value is 4. Therefore, either 2 or 3 can be valid answers.</p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1, 2]</code></p>
<p><b>Output:</b> <code>-1</code></p>
<p><b>Explanation:</b> Since there is no number in nums that is neither the maximum nor the minimum, we cannot select a number that satisfies the given condition. Therefore, there is no answer.</p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [2, 1, 3]</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> Since 2 is neither the maximum nor the minimum value in nums, it is the only valid answer.</p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 100</code></li>
    <li><code>1 <= nums[i] <= 100</code></li>
    <li>All values in <code>nums</code> are distinct></li>
</ul>