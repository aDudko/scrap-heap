<h3>Range Sum Query - Immutable</h3>

<p>Given an integer array <code>nums</code>, handle multiple queries of the following type:</p>
<ul>
    <li>Calculate the <b>sum</b> of the elements of <code>nums</code> between indices <code>left</code> and 
    <code>right</code> inclusive where <code>left <= right</code>.</li>
</ul>

<p>Implement the <code>NumArray</code> class:</p>
<ul>
    <li><code>NumArray(int[] nums)</code> Initializes the object with the integer array <code>nums</code>.</li>
    <li><code>int sumRange(int left, int right)</code> Returns the <b>sum</b> of the elements of <code>nums</code> 
    between indices <code>left</code> and <code>right</code> <b>inclusive</b> 
    (i.e. <code>nums[left] + nums[left + 1] + ... + nums[right]</code>)</li>
</ul>

<h6>Example 1:</h6>
<p><b>Input:</b> <code><br>
["NumArray", "sumRange", "sumRange", "sumRange"]<br>
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]</code></p>
<p><b>Output:</b> <code>[null, 1, -1, -3]</code></p>
<p><b>Explanation:</b><code><br>
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);<br>
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1<br>
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1<br>
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3</code></p>


<h5>Constraints:</h5>
<ul>
    <li><code>1 <= nums.length <= 10<sup>4</sup></code></li>
    <li><code>-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup></code></li>
    <li><code>0 <= left <= right < nums.length</code></li>
    <li>At most <code>10<sup>4</sup></code> calls will be made to <code>sumRange</code>.</li>
</ul>
