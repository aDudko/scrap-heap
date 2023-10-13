<h4>Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.</h4>

<p>You may assume that each input would have <b>exactly one solution</b>, and you may not use the same element twice.</p>

<p>You can return the answer in any order.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums = [2, 7, 11, 15], target = 9</code></p>
<p><b>Output:</b> <code>[0, 1]</code></p>
<p><b>Explanation:</b> Because <code>nums[0] + nums[1] == 9</code>, we return <code>[0, 1]</code>.

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums = [3, 2, 4], target = 6</code></p>
<p><b>Output:</b> <code>[1, 2]</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>nums = [3, 3], target = 6</code></p>
<p><b>Output:</b> <code>[0, 1]</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>2 <= nums.length <= 10<sup>4</sup></code></li>
    <li><code>-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
    <li><code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code></li>
    <li><b>Only one valid answer exists.</b></li>
</ul>