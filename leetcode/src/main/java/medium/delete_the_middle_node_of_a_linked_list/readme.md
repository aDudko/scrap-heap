<h4>You are given the <code>head</code> of a linked list. Delete the middle node, and return <i>the <code>head</code> of 
the modified linked list</i>.</h4>

<p>The <b>middle node</b> of a linked list of size <code>n</code> is the <code>⌊n / 2⌋<sup>th</sup></code> node from the 
<b>start</b> using <b>0-based indexing</b>, where <code>⌊x⌋</code> denotes the largest integer less than or equal to <code>x</code>.</p>

<ul>
    <li>For <code>n</code> = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.</li>
</ul>

<h6>Example 1:</h6>
<p><b>Input:</b> <code>head = [1, 3, 4, 7, 1, 2, 6]</code></p>
<p><b>Output:</b> <code>[1, 3, 4, 1, 2, 6]</code></p>
<p><b>Explanation:</b><br>
The above figure represents the given linked list. The indices of the nodes are written below.
Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
We return the new list after removing this node.</p>

<h6>Example 2:</h6>
<p><b>Input:</b> <code>head = [1, 2, 3, 4]</code></p>
<p><b>Output:</b> <code>[1, 2, 4]</code></p>
<p><b>Explanation:</b><br>
The above figure represents the given linked list.
For n = 4, node 2 with value 3 is the middle node, which is marked in red.</p>

<h6>Example 3:</h6>
<p><b>Input:</b> <code>head = [2, 1]</code></p>
<p><b>Output:</b> <code>[2]</code></p>
<p><b>Explanation:</b><br>
The above figure represents the given linked list.
For n = 2, node 1 with value 1 is the middle node, which is marked in red.
Node 0 with value 2 is the only node remaining after removing node 1.</p>

<h5>Constraints:</h5>
<ul>
    <li>The number of nodes in the list is in the range <code>[1, 10<sup>5</sup>]</code></li>
    <li><code>1 <= Node.val <= 10<sup>5</sup></code></li>
</ul>