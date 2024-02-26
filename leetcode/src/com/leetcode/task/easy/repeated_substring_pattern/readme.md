<h2>Repeated Substring Pattern</h2>


<p>Given a string <code>s</code>, check if it can be constructed by taking a substring of it and appending multiple 
copies of the substring together.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>s = "abab"</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>It is the substring "ab" twice</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>s = "aba"</code></p>
<p><b>Output:</b> <code>false</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>s = "abcabcabcabc"</code></p>
<p><b>Output:</b> <code>true</code></p>
<p><b>Explanation:</b> <code>It is the substring "abc" four times or the substring "abcabc" twice</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= s.length <= 10<sup>4</sup></code></li>
    <li><code>s</code> consists of lowercase English letters</li>
</ul>