<h2>Finding 3-Digit Even Numbers</h2>


<p>You are given an integer array <code>digits</code>, where each element is a digit. The array may contain duplicates.</p>

<p>You need to find <b>all</b> the <b>unique</b> integers that follow the given requirements:</p>
<ul>
    <li>The integer consists of the <b>concatenation</b> of <b>three</b> elements from <code>digits</code> in <b>any</b> 
        arbitrary order.</li>
    <li>The integer does not have <b>leading zeros</b>.</li>
    <li>The integer is <b>even</b>.</li>
</ul>

<p>For example, if the given <code>digits</code> were <code>[1, 2, 3]</code>, integers <code>132</code> and 
<code>312</code> follow the requirements.</p>

<p>Return <i>a <b>sorted</b> array of the unique integers</i>.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>digits = [2, 1, 3, 0]</code></p>
<p><b>Output:</b> <code>[102, 120, 130, 132, 210, 230, 302, 310, 312, 320]</code></p>
<p><b>Explanation:</b> <code>All the possible integers that follow the requirements are in the output array.
Notice that there are no <b>odd</b> integers or integers with <b>leading zeros</b>.</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>digits = [2, 2, 8, 8, 2]</code></p>
<p><b>Output:</b> <code>[222, 228, 282, 288, 822, 828, 882]</code></p>
<p><b>Explanation:</b> <code>The same digit can be used as many times as it appears in digits. In this example, 
the digit 8 is used twice each time in 288, 828, and 882. </code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>digits = [3, 7, 5]</code></p>
<p><b>Output:</b> <code>[]</code></p>
<p><b>Explanation:</b> <code>No <b>even</b> integers can be formed using the given digits.</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>3 <= digits.length <= 100</code></li>
    <li><code>0 <= digits[i] <= 9</code></li>
</ul>