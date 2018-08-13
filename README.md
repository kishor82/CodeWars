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
