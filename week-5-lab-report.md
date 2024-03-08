# Week 5 Lab Report
## Part 1
Step 1 (Student Post):  
![Image](PriorOutput.png)
![Image](PriorChange.png)
I am testing my ```ListExamples.java``` file using Junit. One of my tests is failing even though my ```merge``` method looks good. I am guessing that the error has something to do with my Junit test and that it might be the setup or  ```assert``` in the test. \
\
Step 2 (TA Response): 
Take a look at the ```assert``` you are using. Are you trying to see if the expected array and merged array are the same? \
\
Step 3 (Fix): \
![Image](FixOutput.png)
![Image](FixChange.png)
Using the TA comments, I changed the ```assertSame``` to ```assertArrayEquals```. The error was that ```assertSame``` checks to see if both objects point to the same reference, not if the contents are equal. ```assertArrayEquals``` does check to see if the contents of the arrays are equal. \
\
Step 4 (All Information): \
File and Directory: ```lab7``` is the directory. ```ListExamplesTests.java``` is the Junit file. ```ListExamples.java``` is the file holding the ```merge``` method. ```test.sh``` is the bash file that is used to compile and execute the tests. \
File Contents: 
![Image](PriorChange.png)
![Image](FixChange.png) \
Full Command Line:
```bash test.sh``` - Results in compilation and execution of tests.  
Description:
The edit made to fix the bug was to change ```assertSame``` to ```assertArrayEquals```.
## Part 2
Two big things that I learned in the second half was ```vim``` and the  ```jdb``` command. ```vim``` was important for me as I found that whenever I would clone repos to VScode I found it weird because there was no GUI. As a result, I could not edit java files and thought that was weird.  ```vim``` served as a way to address this. ```jdb``` helped me a lot with looking at the steps of a program. I actually did find use in this with my other CSE class and debugging. In terms of tools I learned from this course, these are the two most important to me.
