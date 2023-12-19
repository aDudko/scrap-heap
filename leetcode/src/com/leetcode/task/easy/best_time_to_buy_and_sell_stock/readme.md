<h3>Best Time to Buy and Sell Stock</h3>

<p>You are given an array <code>prices</code> where <code>prices[i]</code> is the price of a given stock on the <code>i<sup>th</sup></code> day.</p>
<p>You want to maximize your profit by choosing a <b>single day</b> to buy one stock and choosing a <b>different day in the future</b> to sell that stock.</p>
<p>Return <i>the maximum profit you can achieve from this transaction.</i> If you cannot achieve any profit, return <code>0</code>.</p>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>prices = [7,1,5,3,6,4]</code></p>
<p><b>Output:</b> <code>5</code></p>
<p><b>Explanation:</b> <code>Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.</code></p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>prices = [7,6,4,3,1]</code></p>
<p><b>Output:</b> <code>0</code></p>
<p><b>Explanation:</b> <code>In this case, no transactions are done and the max profit = 0.</code></p>

<h5>Constraints:</h5>
<ul>
    <li><code>1 <= prices.length <= 10<sup>5</sup></code></li>
    <li><code>0 <= prices[i] <= 10<sup>4</sup></code></li>
</ul>