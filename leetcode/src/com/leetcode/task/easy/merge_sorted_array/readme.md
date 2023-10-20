<p>You are given two integer arrays <code>nums1</code> and <code>nums2</code>, sorted in <b>non-decreasing order</b>, and two integers <code>m</code> and <code>n</code>, representing the number of elements in <code>nums1</code> and <code>nums2</code> respectively.</p>
<p>Merge <code>nums1</code> and <code>nums2</code> into a single array sorted in <b>non-decreasing order</b>.</p>
<p>The final sorted array should not be returned by the function, but instead be <i>stored inside the array</i> <code>nums1</code>. To accommodate this, <code>nums1</code> has a length of <code>m + n</code>, where the first <code>m</code> elements denote the elements that should be merged, and the last <code>n</code> elements are set to <code>0</code> and should be ignored. <code>nums2</code> has a length of <code>n</code>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3</code></p>
<p><b>Output:</b> <code>[1,2,2,3,5,6]</code></p>
<p><b>Explanation:</b> The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>nums1 = [1], m = 1, nums2 = [], n = 0</code></p>
<p><b>Output:</b> <code>[1]</code></p>
<p><b>Explanation:</b> The arrays we are merging are [1] and [].
The result of the merge is [1].</p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>nums1 = [0], m = 0, nums2 = [1], n = 1</code></p>
<p><b>Output:</b> <code>[1]</code></p>
<p><b>Explanation:</b> The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.</p>

<h5>Constraints:</h5>
<ul>
    <li><code>nums1.length == m + n</code></li>
    <li><code>nums2.length == n</code></li>
    <li><code>0 <= m, n <= 200</code></li>
    <li><code>1 <= m + n <= 200</code></li>
    <li><code>-10<sup>9</sup> <= nums1[i], nums2[j] <= 10<sup>9</sup></code></li>
</ul>

<p><b>Follow up:</b> Can you come up with an algorithm that runs in <code>O(m + n)</code> time?</p>