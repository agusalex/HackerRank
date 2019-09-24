3) Ocurrences

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

4) Subarrays

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


and the largest subarray is [4, 3, 2, 5].


Assume that:

1 ≤ K ≤ N ≤ 100;

1 ≤ A[J] ≤ 1000;


given an array A contains N distinct integers.


In your solution, focus on correctness. The performance of your solution will not be the primary focus of the assessment.


