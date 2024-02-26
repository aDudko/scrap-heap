<h2>Median of Two Sorted Arrays</h2>


<p>Given two sorted arrays <code>nums1</code> and <code>nums2</code> of size <code>m</code> and <code>n</code> respectively, return <b>the median</b> of the two sorted arrays.</p>

<p>The overall run time complexity should be <code>O(log (m+n))</code>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums1 = [1, 3], nums2 = [2]</code></p>
<p><b>Output:</b> <code>2.00000</code></p>
<p><b>Explanation:</b> <code>merged array = [1, 2, 3] and median is 2.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums1 = [1, 2], nums2 = [3, 4]</code></p>
<p><b>Output:</b> <code>2.50000</code></p>
<p><b>Explanation:</b> <code>merged array = [1, 2, 3, 4] and median is (2 + 3) / 2 = 2.5.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>nums1.length == m</code></li>
    <li><code>nums2.length == n</code></li>
    <li><code>0 <= m <= 1000</code></li>
    <li><code>0 <= n <= 1000</code></li>
    <li><code>1 <= m + n <= 2000</code></li>
    <li><code>-10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup></code></li>
</ul>