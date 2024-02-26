<h2>Remove Duplicates from Sorted Array</h2>


<p>Given an integer array <code>nums</code> sorted <b>in non-decreasing order</b>, remove the duplicates 
<a href="https://en.wikipedia.org/wiki/In-place_algorithm">in-place</a> such that each unique element appears only once. 
The <b>relative order</b> of the elements should be kept the <b>same</b>. Then return <i>the number of unique elements in <code>nums</code></i>.</p>

<p>Consider the number of unique elements of <code>nums</code> to be <code>k</code>, to get accepted, you need to do the following things:</p>
<ul>
    <li>Change the array <code>nums</code> such that the first <code>k</code> elements of <code>nums</code> contain the 
    unique elements in the order they were present in <code>nums</code> initially. The remaining elements of <code>nums</code> 
    are not important as well as the size of <code>nums</code>.</li>
    <li>Return <code>k</code>.</li>
</ul>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [1, 1, 2]</code></p>
<p><b>Output:</b> <code>2, nums = [1, 2, _]</code></p>
<p><b>Explanation:</b> <code>Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]</code></p>
<p><b>Output:</b> <code>5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]</code></p>
<p><b>Explanation:</b> <code>Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= nums.length <= 3 * 10<sup>4</sup></code></li>
    <li><code>-100 <= nums[i] <= 100</code></li>
    <li><code>nums</code> is sorted in <b>non-decreasing</b> order.</li>
</ul>