Strings: String Decoding
A person has a string S of length N
The person applied the following list of modifications in the given arder on the string:
1. Shift each character to the right in a cyclic fashion (1.e., changing all a to b, all b to c, ......., all z to a).

2. The entire string is reversed.

You are given the string S after all the modifications
Find the original string i.e. the original string, before the modification.
Function Description
In the provided code snippet, implement the provided stringDecoding() method to find the original string, le, the original string, before the modification. You can write your code in the space below the phrase "URSTE YOUR LOGIC HER
There will be multiple test cases running so the input and Output should match exactly as provided.
The base output variable result is set to a default value of 484 which can be modified. Additionally, you can add or remove these output variables.
Input Format
The first line contains a single integer & denoting the length of string s The second line contains a string S
Sample input
5--denotes N
abcde--denotes S

Constraints
1<=N<=100
String S contains English alphabets only.

Output Format

The output contains a single string denoting the original string. i.e., the original string, before the modification.

Sample Output
dcbaz

Explanation
S=abcde
If we apply modifications 1 and 2 to string 
debaz

'd' changes to 'e'
'c' changes to 'd'
'b' changes to 'c'
'a' changes to 'b'
'z' changes to 'a'