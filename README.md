# 1

ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.

eg:

	validate_pin("1234") == True
	validate_pin("12345") == False
	validate_pin("a234") == False

## Best Solutions :

	def validate_pin(pin):
	    return len(pin) in (4, 6) and pin.isdigit()


# 2

Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

Example:
	create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge. 
Don't forget the space after the closing parentheses!

## Best Solutions :
1)

	public class Kata {
	  public static String createPhoneNumber(int[] numbers) {
	    return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
	  }
	}

2)

	public class Kata {
	  public static String createPhoneNumber(int[] numbers) {
	    return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
	  }
	}


# 3 

Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 integers. No floats or empty arrays will be passed.

For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.

[10, 343445353, 3453445, 3453545353453] should return 3453455.

Hint: Do not modify the original array.

## Best Solutions :
1)

	def sum_two_smallest_numbers(numbers):
	    return numbers.pop(numbers.index(min(numbers))) + numbers.pop(numbers.index(min(numbers)))
2)

	def sum_two_smallest_numbers(numbers):
    first_min = min(numbers)
    numbers.remove(first_min)
    second_min = min(numbers)
    return first_min + second_min


# 4

## Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

	['a','b','c','d','f'] -> 'e'
	['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)

## Best Solutions :
1)

	def find_missing_letter(c):
    return next(chr(ord(c[i])+1) for i in range(len(c)-1) if ord(c[i])+1 != ord(c[i+1]))

2)

	def find_missing_letter(chars):
    n = 0
    while ord(chars[n]) == ord(chars[n+1]) - 1:
        n += 1
    return chr(1+ord(chars[n]))

# 5 

Problem Description: Write a function that takes in a string of one or more words, and returns the 
same string, but with all five or more letter words reversed (Just like the name of this Kata). 
Strings passed in will consist of only letters and spaces. Spaces will be included only when more 
than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"

## Best Solutions :

	def spin_words(sentence):
    return " ".join([x[::-1] if len(x) >= 5 else x for x in sentence.split(" ")])

# 6 

Description:
Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.

Examples:
Input: 21445 Output: 54421

Input: 145263 Output: 654321

Input: 1254859723 Output: 9875543221

## Best Solutions :

	def Descending_Order(num):
    return int("".join(sorted(str(num), reverse=True)))
    
    def Descending_Order(num):
    return int(''.join(sorted(str(num))[::-1]))

# 7 

Description:
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, and u as vowels for this Kata.

The input string will only consist of lower case letters and/or spaces.

## Best Solutions :

	public class Vowels {
    	public static int getCount(String str) {
        	return str.replaceAll("(?i)[^aeiou]", "").length();
    	}
	}

The (?i) at the beginning make the regex case insensitive