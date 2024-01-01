<h3>Keyboard Row</h3>

<p>Given an array of strings <code>words</code>, return <i>the words that can be typed using letters of the alphabet 
on only one row of American keyboard like the image below</i>.</p>
<p>In the American keyboard:</p>
<ul>
    <li>the first row consists of the characters <code>"qwertyuiop"</code></li>
    <li>the second row consists of the characters <code>"asdfghjkl"</code></li>
    <li>the third row consists of the characters <code>"zxcvbnm"</code></li>
</ul>

![img.png](img.png)

<h6>Example 1:</h6>
<p><b>Input:</b> <code>words = ["Hello","Alaska","Dad","Peace"]</code></p>
<p><b>Output:</b> <code>["Alaska","Dad"]</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>words = ["omk"]</code></p>
<p><b>Output:</b> <code>[]</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>words = ["adsdf","sfd"]</code></p>
<p><b>Output:</b> <code>["adsdf","sfd"]</code></p>


<h5>Constraints:</h5>
<ul>
    <li><code>1 <= words.length <= 20</code></li>
    <li><code>1 <= words[i].length <= 100</code></li>
    <li><code>words[i]</code> consists of English letters (both lowercase and uppercase)</li>
</ul>
