1) Students
You are given an array A representing heights of students. All the students are asked to stand in rows. The students arrive by one, sequentially (as their heights appear in A). For the i-th student, if there is a row in which all the students are taller than A[i], the student will stand in one of such rows. If there is no such row, the student will create a new row. Your task is to find the minimum number of rows created.


Write a function that, given a non-empty array A containing N integers, denoting the heights of the students, returns the minimum number of rows created.


For example, given A = [5, 4, 3, 6, 1], the function should return 2.


Students will arrive in sequential order from A[0] to A[N−1]. So, the first student will have height = 5, the second student will have height = 4, and so on.


For the first student, there is no row, so the student will create a new row.


Row1 = [5]

For the second student, all the students in Row1 have height greater than 4. So, the student will stand in Row1.


Row1 = [5, 4]

Similarly, for the third student, all the students in Row1 have height greater than 3. So, the student will stand in Row1.


Row1 = [5, 4, 3]

For the fourth student, there is no row in which all the students have height greater than 6. So, the student will create a new row.


Row1 = [5, 4, 3]

Row2 = [6]

For the fifth student, all the students in Row1 and Row2 have height greater than 1. So, the student can stand in either of the two rows.


Row1 = [5, 4, 3, 1]

Row2 = [6]

Since two rows are created, the function should return 2.


Assume that:


N is an integer within the range [1..1,000]

each element of array A is an integer within the range [1..10,000]


In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment
5,4,3,6,1 out 2

2) Processes

There are some processes that need to be executed. Amount of a load that process causes on a server that runs it, is being represented by a single integer. Total load caused on a server is the sum of the loads of all the processes that run on that server. You have at your disposal two servers, on which mentioned processes can be run. Your goal is to distribute given processes between those two servers in the way that, absolute difference of their loads will be minimized.



Write a function that, given an array A of N integers, of which represents loads caused by successive processes, the function should return the minimum absolute difference of server loads.



For example, given array A such that:

  A[0] = 1

  A[1] = 2

  A[2] = 3

  A[3] = 4

  A[4] = 5

1,2,3,4,5 out 1

your function should return 1. We can distribute the processes with loads 1, 2, 4 to the first server and 3, 5 to the second one, so that their total loads will be 7 and 8, respectively, and the difference of their loads will be equal to 1.



Assume that:

N is an integer within the range [1..1,000]

the sum of the elements of array A does not exceed 100,000


In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.


3)
One string is strictly smaller than another when the frequency of occurrence of the smallest character in the string is less than the frequency of occurrence of the smallest character in the comparison string.


For example, string "abcd" is smaller than string "aaa" because the smallest character (in lexicographical order) in "abcd" is 'a', with a frequency of 1, and the smallest character in "aaa" is also 'a', but with a frequency of 3. In another example, string "a" is smaller than string "bb" because the smallest character in "a" is 'a' with a frequency of 1, and the smallest character in "bb" is 'b' with a frequency of 2.


Write a function that, given string A (which contains M strings delimited by ',') and string B (which contains N strings delimited by ','), returns an array C of N integers. For 0 ≤ J < N, values of C[J] specify the number of strings in A which are strictly smaller than the comparison J-th string in B (starting from 0).


For example, given strings A and B such that:


 A = "abcd,aabc,bd"


 B = "aaa,aa"


the function should return [3, 2], because:


All the strings in the array are strictly smaller than "aaa" on the basis of the given comparison criteria;


Strings "abcd" and "bd" are strictly smaller than "aa".


Assume that:

1 ≤ N, M ≤ 10000

1 ≤ length of any string contained by A or B ≤ 10

All the input strings comprise only lowercase English alphabet letters (a-z)


In your solution, focus on correctness. The performance of your solution will not be the primary focus of the assessment.

4)

Array X is greater than array Y if the first non-matching element in both arrays has a greater value in X than in Y.


For example, for arrays X and Y such that:


X = [1, 2, 4, 3, 5]


Y = [1, 2, 3, 4, 5]


X is greater than Y because the first element that does not match is larger in X (i.e. for X[2] and Y[2], X[2] > Y[2]).


A contiguous subarray is defined by an interval of the indices. In other words, a contiguous subarray is a subarray which has consecutive indexes.


Write a function that, given a zero-indexed array A consisting of N integers and an integer K, returns the largest contiguous subarray of length K from all the contiguous subarrays of length K.


For example, given array A and K = 4 such that:


A = [1, 4, 3, 2, 5]


the function should return [4, 3, 2, 5], because there are two subarrays of size 4:


[1, 4, 3, 2]


[4, 3, 2, 5]


and the largest subarray is [`4, 3, 2, 5`].


Assume that:

1 ≤ K ≤ N ≤ 100;

1 ≤ A[J] ≤ 1000;


given an array A contains N distinct integers.


In your solution, focus on correctness. The performance of your solution will not be the primary focus of the assessment.


