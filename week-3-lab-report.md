# Week 3 Lab Report
## Bugs
The ```reverseInPlace``` method <br>
Failure Inducing Input: ```int[] input1 = {1,2,3}``` A non-empty array. <br>
Non-Failure Inducing Input: ```int[] input2 = {}``` An empty array. <br>
Symptom: <br>
Bug: <br>
The fix addresses the issue as now the array is correctly reversed. Before the fix, the two halves would be mirrors of each other 
as the updated values would be used for the second half. Changing the range of the for loop to half of the length, makes the loop stop after
the elements are swapped. <br>
