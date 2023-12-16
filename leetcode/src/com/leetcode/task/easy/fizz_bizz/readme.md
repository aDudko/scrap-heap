<h4>Given an integer <code>n</code>, return a string array <code>answer</code> (1-indexed) where:</h4>

<ul>
<li><code>answer[i] == "FizzBuzz"</code> if <code>i</code> is divisible by <code>3</code> and <code>5</code>.</li>
<li><code>answer[i] == "Fizz"</code> if <code>i</code> is divisible by <code>3</code>.</li>
<li><code>answer[i] == "Buzz"</code> if <code>i</code> is divisible by <code>5</code>.</li>
<li><code>answer[i] == i</code> (as a string) if none of the above conditions are true.</li>
</ul>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>n = 3</code></p>
<p><b>Output:</b> <code>["1", "2", "Fizz"]</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>n = 5</code></p>
<p><b>Output:</b> <code>["1", "2", "Fizz", "4", "Buzz"]</code></p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>n = 15</code></p>
<p><b>Output:</b> <code>["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= n <= 10<sup>4</sup></code></li>
</ul>