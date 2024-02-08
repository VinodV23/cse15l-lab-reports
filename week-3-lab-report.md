# Week 3 Lab Report
## Bugs
The ```reverseInPlace``` method <br>
Failure Inducing Input: ```int[] input1 = {1,2,3}``` A non-empty array. <br>
Non-Failure Inducing Input: ```int[] input2 = {}``` An empty array. <br>
Symptom: ![Image](Symptom.png) <br>
Bug: <br>
Before - <br>
```
static void reverseInPlace(int[] arr) { 
    for(int i = 0; i < arr.length; i += 1) { 
      arr[i] = arr[arr.length - i - 1]; 
    }
  }
```
After - <br>
```
static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {
      int tp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = tp;
    }
  }
```
The fix addresses the issue as now the array is correctly reversed. Before the fix, the two halves would be mirrors of each other 
as the updated values would be used for the second half. Changing the range of the for loop to half of the length, makes the loop stop after
the elements are swapped. <br>

## Researching Commands
Grep <br>
- v option <br>
Example 1 <br>
```
grep -v "rna" output_file.txt > notRna.txt
```
```
wc notRna.txt 
  481834 3846209 43218779 notRna.txt
```
Example 2 <br>
```
grep -v "I" base-pair.txt > removeI.txt
```
```
wc removeI.txt 
       3      48     412 removeI.txt
```
