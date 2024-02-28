<h2>Repeated String Match</h2>


<p>Given two strings <code>a</code> and <code>b</code>, return <i>the minimum number of times you should repeat string
<code>a</code> so that string <code>b</code> is a substring of it</i>. If it is impossible for <code>b</code> to be a
substring of <code>a</code> after repeating it, return <code>-1</code>.</p>

<p><b>Notice:</b> string <code>"abc"</code> repeated 0 times is <code>""</code>, repeated 1 time is <code>"abc"</code>
and repeated 2 times is <code>"abcabc"</code>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>a = "abcd", b = "cdabcdab"</code></p>
<p><b>Output:</b> <code>3</code></p>
<p><b>Explanation:</b> <code>We return 3 because by repeating a three times "ab<b>cdabcdab</b>cd", b is a substring of it</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>a = "a", b = "aa"</code></p>
<p><b>Output:</b> <code>2</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>1 <= a.length, b.length <= 104</code></li>
    <li><code>a</code> and <code>b</code> consist of lowercase English letters.</li>
</ul>
