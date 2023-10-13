<h4>Given an integer array <code>nums</code> and an integer <code>val</code>, remove all occurrences of <code>val</code> 
in <code>nums</code> <a href="https://en.wikipedia.org/wiki/In-place_algorithm">in-place</a>. The order of the elements 
may be changed. Then return <i>the number of elements in <code>nums</code> which are not equal to <code>val</code></i>.</h4>

<p>Consider the number of elements in <code>nums</code> which are not equal to <code>val</code> be <code>k</code>, to get 
accepted, you need to do the following things:</p>
<ul>
<li>Change the array <code>nums</code> such that the first <code>k</code> elements of <code>nums</code> contain the 
elements which are not equal to <code>val</code>. The remaining elements of <code>nums</code> are not important as well as the size of <code>nums</code>.</li>
<li>Return <code>k</code>.</li>
</ul>

<h6>Example 1:</h6>

<p><b>Input:</b> <code>nums = [3, 2, 2, 3], val = 3</code></p>
<p><b>Output:</b> <code>2, nums = [2, 2, _, _]</code></p>
<p><b>Explanation:</b> Your function should return <code>k = 2</code>, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

<h6>Example 2:</h6>

<p><b>Input:</b> <code>nums = [0, 1, 2, 2, 3, 0, 4, 2], val = 2</code></p>
<p><b>Output:</b> <code>5, nums = [0, 1, 4, 0, 3, _, _, _]</code></p>
<p><b>Explanation:</b> Your function should return <code>k = 5</code>, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).

<h5>Constraints:</h5>
<ul>
    <li><code>0 <= nums.length <= 100</code></li>
    <li><code>0 <= nums[i] <= 50</code></li>
    <li><code>0 <= val <= 100</code></li>
</ul>