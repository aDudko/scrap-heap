<h2>Find All Duplicates in an Array</h2>


<p>Given an integer array <code>nums</code> of length <code>n</code> where all the integers of <code>nums</code> 
are in the range <code>[1, n]</code> and each integer appears <b>once</b> or <b>twice</b>, return <i>an array of all 
the integers that appears <b>twice</b></i>.</p>

<p>You must write an algorithm that runs in <code>O(n)</code> time and uses only constant extra space.</p>


<h3>Example 1:</h3>
<p><b>Input:</b> <code>nums = [4, 3, 2, 7, 8, 2, 3, 1]</code></p>
<p><b>Output:</b> <code>[2, 3]</code></p>

<h3>Example 2:</h3>
<p><b>Input:</b> <code>nums = [1, 1, 2]</code></p>
<p><b>Output:</b> <code>[1]</code></p>

<h3>Example 3:</h3>
<p><b>Input:</b> <code>nums = [1]</code></p>
<p><b>Output:</b> <code>[]</code></p>


<h3>Constraints:</h3>
<ul>
    <li><code>n == nums.length</code></li>
    <li><code>1 <= n <= 10<sup>5</sup></code></li>
    <li><code>1 <= nums[i] <= n</code></li>
    <li>Each element in <code>nums</code> appears once or twice.</li>
</ul>

<style>
.line {
    border-bottom: 1px solid #230;
}
</style>
<div class="line"></div>


<h2>Solution</h2>


<p>Given this: <code>[2, 5, 2, 1, 1, 4]</code></p>

<p>Go to index <code>0</code> and flip whatever value index <code>0</code> pointing to 
<code>[if it was not flipped(turned on) before]</code>...</p>

<p>What does that mean?</p>

<p>Index <code>0</code> has value <code>2</code>. Flip whatever <code>2</code> is pointing-to. Since the array is 
<code>0</code> based, so we will flip <code>2 - 1 = 1</code> and that is <code>5</code>.</p>

<p>So, our result will look like: <code>[2, -5, 2, 1, 1, 4]</code></p>

<p>Next, we will go to index <code>1</code>. After modifying the array, value at index <code>1</code> might or might 
not become negative. So, for this, we get the absolute value of that position. So, flip (if it was not flipped before) 
whatever <code>Math.abs(arr[1]) - 1 = 4</code> pointing to.</p>

<p>Since <code>4</code> is pointing to <code>1</code> and it is not negative (not flipped before), so we flip it to 
<code>-1</code>.</p>
<code>[2, -5, 2, 1, -1, 4]</code>

<p>Next index <code>2</code>, value <code>2</code>, and it is pointing <code>-5</code>, which must be flipped by some 
other <code>2</code> in the array. So, we get our first duplicate value. Add <code>2</code> in our result and continue.</p>

<p>In this way, we will be able to find all the elements in the array that are duplicate.</p>
<a href="https://nextswe.com/leetcode-442-find-all-duplicates-in-an-array/">the source of information</a>