<h2>Find the Index of the First Occurrence in a String</h2>


<p>Given two strings <code>needle</code> and <code>haystack</code>, return the index of the first occurrence of
<code>needle</code> in <code>haystack</code>, or <code>-1</code> if needle is not part of <code>haystack</code>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>haystack = "sadbutsad", needle = "sad"</code></p>
<p><b>Output:</b> <code>0</code></p>
<p><b>Explanation:</b> <code>"sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>haystack = "leetcode", needle = "leeto"</code></p>
<p><b>Output:</b> <code>-1</code></p>
<p><b>Explanation:</b> <code>"leeto" did not occur in "leetcode", so we return -1</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= haystack.length, needle.length <= 104</code></li>
    <li><code>haystack</code> and <code>needle</code> consist of only lowercase English characters.</li>
</ul>