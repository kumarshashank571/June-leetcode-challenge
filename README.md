# June-leetcode-challenge
solution to problems of june leetcode challenge (hosted on leetcode in june 2020)


I am attaching the problem statement of each problem here.

Q1.Invert binary tree(june 1)

Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

--------------------------------------------------------------------------------------------------------------------------------

Q2. Delete node in LinkedList(june 2)

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9]

Example 1:

Input: head = [4,5,1,9], node = 5

Output: [4,1,9]

Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

Example 2:

Input: head = [4,5,1,9], node = 1

Output: [4,5,9]

Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
 

Note:

1.The linked list will have at least two elements.
2.All of the nodes' values will be unique.
3.The given node will not be the tail and it will always be a valid node of the linked list.
4.Do not return anything from your function.

-------------------------------------------------------------------------------------------------------------------------------

Q3.Two City Scheduling(june 3)

There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

 Example 1:
 
Input: [[10,20],[30,200],[400,50],[30,20]]

Output: 110

Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 
Note:
1. 1 <= costs.length <= 100
2. It is guaranteed that costs.length is even.
3. 1 <= costs[i][0], costs[i][1] <= 1000

--------------------------------------------------------------------------------------------------------------------------------


Q4.Reverse String(june 4)

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.

 Example 1:
 
Input: ["h","e","l","l","o"]

Output: ["o","l","l","e","h"]

Example 2:

Input: ["H","a","n","n","a","h"]

Output: ["h","a","n","n","a","H"]

----------------------------------------------------------------------------------------------------------------------------------


Q5.Random Pick with Weight(june 5)-

Given an array w of positive integers, where w[i] describes the weight of index i, write a function pickIndex which randomly picks an index in proportion to its weight.

Note:

1. 1 <= w.length <= 10000
2. 1 <= w[i] <= 10^5
3. pickIndex will be called at most 10000 times.

Example 1:

Input: 

["Solution","pickIndex"]

[[[1]],[]]

Output: [null,0]

Example 2:

Input: 

["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]

[[[1,3]],[],[],[],[],[]]

Output: [null,0,1,1,1,0]

--------------------------------------------------------------------------------------------------------------------------------


Q6. Queue Reconstruction by Height(june 6)-

Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:

The number of people is less than 1,100.

 Example
 
Input:

[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:

[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
