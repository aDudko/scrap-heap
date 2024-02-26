<h2>Maximum Repeating Substring</h2>


<p>For a string <code>sequence</code>, a string <code>word</code> is <b><code>k</code>-repeating</b> if <code>word</code>
concatenated <code>k</code> times is a substring of <code>sequence</code>. The <b><code>word</code>'s maximum 
<code>k</code>-repeating value</b> is the highest value <code>k</code> where word is <code>k</code>-repeating in 
<code>sequence</code>. If <code>word</code> is not a substring of <code>sequence</code>, <code>word</code>'s maximum 
<code>k</code>-repeating value is <code>0</code>.</p>

<p>Given strings <code>sequence</code> and <code>word</code>, return <i>the <b>maximum <code>k</code>-repeating value</b>
of <code>word</code> in <code>sequence</code>.</i></p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>sequence = "ababc", word = "ab"</code></p>
<p><b>Output:</b> <code>2</code></p>
<p><b>Explanation:</b> <code>"abab" is a substring in "ababc"</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>sequence = "ababc", word = "ba"</code></p>
<p><b>Output:</b> <code>1</code></p>
<p><b>Explanation:</b> <code>"ba" is a substring in "ababc". "baba" is not a substring in "ababc"</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>sequence = "ababc", word = "ac"</code></p>
<p><b>Output:</b> <code>0</code></p>
<p><b>Explanation:</b> <code>"ac" is not a substring in "ababc"</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= sequence.length <= 100</code></li>
    <li><code>1 <= word.length <= 100</code></li>
    <li><code>sequence</code> and <code>word</code> contains only lowercase English letters.</li>
</ul>