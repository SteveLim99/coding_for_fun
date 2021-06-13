# coding_for_fun
The following explains the structure of this repository. 

## Directories 
### Cracking the Coding Interview - /src/ctci
This directory contains the chapters which are defined by the index appended to the end of the "chp_" flag found in the Cracking the Coding Interview book. Within each class, each functions represents the implementation of each question within each chapter. The functions naming are defined as the following:
```
<Question_Name>_<Chapter_Number>_<Question_Number>{_<Implementation_Version>}?
```
### Leetcode - /src/leetcode
This directory contains the code for questions found on leetcode which are seperated into 3 different classes defined by easy, medium and hard as seen on leetcode. The functions within each classes represent a question found on leetcode and have the following naming convention: 
```
idx_<Index_Number_On_Leetcode>{_<Implementation_Version>}?
```
### Utils - /src/utils
This directory contains implementation of various data structures that are utilized throughout some of the questions found in src/leetcode or src/ctci. 
