package com.techelevator;

public class Exercises {

	/*
	 Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	 helloName("Bob") → "Hello Bob!"
	 helloName("Alice") → "Hello Alice!"
	 helloName("X") → "Hello X!" 
	 */
	public String helloName(String name) {

		String helloName = "Hello "	+ name + "!";

		return helloName;
	}

	/*
	 Given two strings, a and b, return the result of putting them together in the order abba,
	 e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 makeAbba("Hi", "Bye") → "HiByeByeHi"
	 makeAbba("Yo", "Alice") → "YoAliceAliceYo"
	 makeAbba("What", "Up") → "WhatUpUpWhat"
	 */
	public String makeAbba(String a, String b) {
		
		String abba = a + b + b + a;

		return abba;
	}

	/*
	 The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example,
	 the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the
	 HTML string with tags around the word, e.g. "<i>Yay</i>".
	 makeTags("i", "Yay") → "<i>Yay</i>"
	 makeTags("i", "Hello") → "<i>Hello</i>"
	 makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */
	public String makeTags(String tag, String word) {
		
		String taggedWord = "<" + tag + ">" + word + "</" + tag + ">";

		return taggedWord;
	}

	/*
	 Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the
	 middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting
	 at index i and going up to but not including index j.
	 makeOutWord("<<>>", "Yay") → "<<Yay>>"
	 makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
	 makeOutWord("[[]]", "word") → "[[word]]"
	 */
	public String makeOutWord(String out, String word) {
		
		String splitOutFirst = out.substring(0, 2);
		
		String splitOutSecond = out.substring(2);
		
		String answer = splitOutFirst + word + splitOutSecond;

		return answer;
	}

	/*
	 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
	 length will be at least 2.
	 extraEnd("Hello") → "lololo"
	 extraEnd("ab") → "ababab"
	 extraEnd("Hi") → "HiHiHi"
	 */
	public String extraEnd(String str) {
		
		String last2 = str.substring(str.length() - 2);
		
		return last2 + last2 + last2; 
	}

	/*
	 Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the
	 string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string ""
	 yields the empty string "". Note that str.length() returns the length of a string.
	 firstTwo("Hello") → "He"
	 firstTwo("abcdefg") → "ab"
	 firstTwo("ab") → "ab"
	 */
	public String firstTwo(String str) {
		
		if (str.length() < 0) {
			return " ";
		}
		else if ((str.length() >= 0) && (str.length() <= 2)) {
			return str;
		}
		else {
			String firstTwo = str.substring(0, 2);
			return firstTwo;
			}
	}

	/*
	 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
	 firstHalf("WooHoo") → "Woo"
	 firstHalf("HelloThere") → "Hello"
	 firstHalf("abcdef") → "abc"
	 */
	public String firstHalf(String str) {
		
		int halfStringLength = str.length() / 2; // take the string and divide it by two for an INT
		String halfString = str.substring(0, halfStringLength); // create a new string that is made up of first half of old string by ranging it from 0 to INT halfStringLength

		return halfString; // return new string
	}

	/*
	 Given a string, return a version without the first and last char, so "Hello" yields "ell".
	 The string length will be at least 2.
	 withoutEnd("Hello") → "ell"
	 withoutEnd("java") → "av"
	 withoutEnd("coding") → "odin"
	 */
	public String withoutEnd(String str) {

		String middle = str.substring(1, str.length() - 1);

		return middle;
	}

	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
	 on the outside and the longer string on the inside. The strings will not be the same length, but
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		
		if (a.length()> b.length()) {
			return b + a + b;
		}
		else {
			return a + b + a;
		}
	}
	/*
	 Given 2 strings, return their concatenation, except omit the first char of each. The strings will
	 be at least length 1.
	 nonStart("Hello", "There") → "ellohere"
	 nonStart("java", "code") → "avaode"
	 nonStart("shotl", "java") → "hotlava"
	 */
	public String nonStart(String a, String b) {
		
		String wordComboMinusFirst = a.substring(1, a.length()) + b.substring(1, b.length());

		return wordComboMinusFirst;
	}

	/*
	 Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
	 The string length will be at least 2.
	 left2("Hello") → "lloHe"
	 left2("java") → "vaja"
	 left2("Hi") → "Hi"
	 */
	public String left2(String str) {
		
		String firstTwo = str.substring(0, 2); // creates new string with first two
		
		String stringMinusFirstTwo = str.substring(2, str.length());// creates new string without first two
		
		String stringCombo = stringMinusFirstTwo + firstTwo; // adds firstTwo after stringMinusFirstTwo

		return stringCombo;
	}

	/*
	 Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
	 The string length will be at least 2.
	 right2("Hello") → "loHel"
	 right2("java") → "vaja"
	 right2("Hi") → "Hi"
	 */
	public String right2(String str) {
		
		String lastTwo = str.substring(str.length() - 2, str.length()); // creates new string with last two
		
		String stringMinusLastTwo = str.substring(0, str.length() - 2);// creates new string without last two
		
		String stringCombo = lastTwo + stringMinusLastTwo; // adds lastTwo after stringMinusLastTwo

		return stringCombo;
	}

	/*
	 Given a string, return a string length 1 from its front, unless front is false, in which case
	 return a string length 1 from its back. The string will be non-empty.
	 theEnd("Hello", true) → "H"
	 theEnd("Hello", false) → "o"
	 theEnd("oh", true) → "o"
	 */
	public String theEnd(String str, boolean front) {

		if (front == true) { // if true statement
			String firstCharacter = str.substring(0, 1); // substring with first character only

			return firstCharacter; // return first character
		}	
		else { // else statement
			String lastCharacter = str.substring(str.length() - 1); // substring with last character only
			
			return lastCharacter;// return last character
		}
	}

	/*
	 Given a string, return a version without both the first and last char of the string. The string
	 may be any length, including 0.
	 withoutEnd2("Hello") → "ell"
	 withoutEnd2("abc") → "b"
	 withoutEnd2("ab") → ""
	 */
	public String withoutEnd2(String str) {
		
		
		if (str.length() <= 2) {
			return "";
		}
		
		else {
		String withoutFirstOrLast = str.substring(1, str.length() - 1); // creates new string without first or last character
		
		return withoutFirstOrLast;
		}
	}

	/*
	 Given a string of even length, return a string made of the middle two chars, so the string "string"
	 yields "ri". The string length will be at least 2.
	 middleTwo("string") → "ri"
	 middleTwo("code") → "od"
	 middleTwo("Practice") → "ct"
	 */
	public String middleTwo(String str) {
		
		int length = str.length(); // find length of string
		
		int halfwayPoint = length / 2; // divide length by two
		
		String newString = str.substring(halfwayPoint - 1, halfwayPoint + 1);// create new string that starts one less than midway point and ends one higher than midway point

		return newString;
	}

	/*
	 Given a string, return true if it ends in "ly".
	 endsLy("oddly") → true
	 endsLy("y") → false
	 endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		
		if (str.length() > 1 && str.substring(str.length() - 2).equals("ly")) {
			return true;
			}
		return false;
	}

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {
		
		String firstN = str.substring(0, n); // creates a string with first n characters
		
		String lastN = str.substring(str.length() - n); // creates a string with last n characters
		
		String newWord = firstN + lastN; // combines first and last n characters

		return newWord;
	}

	/*
	 Given a string and an index, return a string length 2 starting at the given index. If the index is
	 too big or too small to define a string length 2, use the first 2 chars. The string length will be
	 at least 2.
	 twoChar("java", 0) → "ja"
	 twoChar("java", 2) → "va"
	 twoChar("java", 3) → "ja"
	 */
	public String twoChar(String str, int index) {
		
		
		if(index < 0 || index > str.length() - 2) {
			return str.substring (0, 2);
		}
		else {
			return str.substring(index, index + 2);
		}
	}
		
	/*
	 Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
	 The string length will be at least 3.
	 middleThree("Candy") → "and"
	 middleThree("and") → "and"
	 middleThree("solving") → "lvi"
	 */
	public String middleThree(String str) {
		
		int length = str.length(); // find length of string
		
		int halfwayPoint = length / 2; // divide length by two (will automatically round down)
		
		String newString = str.substring(halfwayPoint - 1, halfwayPoint + 2);// create new string that starts one less than midway point and ends one higher than midway point

		return newString;
	}
	
	/*
	 Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with
	 "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals()
	 to compare 2 strings.
	 hasBad("badxx") → true
	 hasBad("xbadxx") → true
	 hasBad("xxbadxx") → false
	 */
	public boolean hasBad(String str) {

		if(str.length() < 3) {
			return false;
		}
		for(int i = 0; i < 2 && i + 2 < str.length(); i++) {
			if(str.substring(i, i + 3).equals("bad")) {
					 return true;
			}
		}
		return false;
	}
	
	/*
	 Given a string and a non-negative int n, return a larger string that is n copies of the original string.
	 stringTimes("Hi", 2) → "HiHi"
	 stringTimes("Hi", 3) → "HiHiHi"
	 stringTimes("Hi", 1) → "Hi"
	 */
	public String stringTimes(String str, int n) {


		if (n == 0) {
			return "";
		}
		if (n == 1) {
			return str;
		}
		
		if (n == 2) {
			return str + str;
		}
		if (n == 3) {
			return str + str + str;
		}
		if (n == 4) {
			return str + str + str + str;
		}
		if (n == 5) {
			return str + str + str + str + str;
		}
		return null;
	}

	/*
	 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or
	 whatever is there if the string is less than length 3. Return n copies of the front;
	 frontTimes("Chocolate", 2) → "ChoCho"
	 frontTimes("Chocolate", 3) → "ChoChoCho"
	 frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	public String frontTimes(String str, int n) {
		
		
		if (str.length() > 2 && n == 0) { // if string is at least 3 long
			return "";
		}
		if (str.length() > 2 && n == 2) {
			return str.substring(0, 3) + str.substring(0, 3);
		}
		if (str.length() > 2 && n == 3) {
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		}
		if (str.length() > 2 && n == 4) {
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		}
		if (str.length() > 2 && n == 5) {
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		}
		if (str.length() > 2 && n == 6) {
			return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
		}
		if (str.length() > 2 && n == 0) { // if string is less than 3 long
			return "";
		}
		if (str.length() <= 2 && n == 2) {
			return str + str;
		}
		if (str.length() <= 2 && n == 3) {
			return str + str + str;
		}
		if (str.length() <= 2 && n == 4) {
			return str + str + str + str;
		}
		if (str.length() <= 2 && n == 5) {
			return str + str + str + str + str;
			}
		if (str.length() <= 2 && n == 6) {
			return str + str + str + str + str + str;
		}
		return "";

	}

	/*
	 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
	 countXX("abcxx") → 1
	 countXX("xxx") → 2
	 countXX("xxxx") → 3
	 */
	public int countXX(String str) {
		
		int count = 0;
		for (int i = 0; i < str.length() -  1; i++) {

			if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
				count = count + 1;
			}
		}
		return count;
	}

	/*
	 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
	 doubleX("axxbb") → true
	 doubleX("axaxax") → false
	 doubleX("xxxxx") → true
	 */
	public boolean doubleX(String str) { 
		
		for (int i = 0; i < str.length() -  1; i++) {

			if (str.substring(i, i + 1).equals ("x")) {
				if (str.substring(i, i + 2).equals ("xx")) {
					return true;
				}
				return false;
			}		
		}
		return false;
	}
	
	/*
	 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
	 stringBits("Hello") → "Hlo"
	 stringBits("Hi") → "H"
	 stringBits("Heeololeo") → "Hello"
	 */
	public String stringBits(String str) {

		String everyOtherString = "";
		
		for (int i = 0; i < str.length(); i =+ 2) {
			everyOtherString = str;
		}
		return everyOtherString;
	}

	/*
	 Given a non-empty string like "Code" return a string like "CCoCodCode".
	 stringSplosion("Code") → "CCoCodCode"
	 stringSplosion("abc") → "aababc"
	 stringSplosion("ab") → "aab"
	 */
	public String stringSplosion(String str) {
		
		if (str.length() == 0) {
			return "";
		}
		if (str.length() == 1) {
			return str;
		}
		
		if (str.length() == 2) {
			return str.substring(0, 1)  + str;
		}
		if (str.length() == 3) {
			return str.substring(0, 1) + str.substring(0, 2)  + str;
			}
		if (str.length() == 4) {
			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3)  + str;
		}
		if (str.length() == 5) {
			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3) + str.substring(0, 4) + str;
		}
		if (str.length() == 6) {
			return str.substring(0, 1) + str.substring(0, 2) + str.substring(0, 3) + str.substring(0, 4) + str.substring(0, 5) + str;
					
		}
		return null;
	}

	/*
	 Given a string, return the count of the number of times that a substring length 2 appears in the string and
	 also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
	 last2("hixxhi") → 1
	 last2("xaxxaxaxx") → 1
	 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {
		
		if (str.length() < 3) {
			return 0;
		}
		
		int answer = 0;
		
		String lastTwo = str.substring( str.length() - 2, str.length());
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 2).equals(lastTwo)) {
				answer++; 
			}
		}
		return answer;
	}

	/*
	 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end
	 should not be removed.
	 stringX("xxHxix") → "xHix"
	 stringX("abxxxcd") → "abcd"
	 stringX("xabxxxcdx") → "xabcdx"
	 */
	public String stringX(String str) {
		
		if (str.length() <= 2) {
			return str;
			}
		
		String firstLetter = str.substring(0, 1);
		String lastLetter = str.substring(str.length() - 1);
		String finalString = "";
		
		for (int i = 1; i < str.length() - 1; i++) {
			if (!str.substring(i, i +1).equals("x")) {				
				
				finalString = finalString + str.substring(i, i +1);
			}
		}
		return firstLetter + finalString + lastLetter;
	}

	/*
	 Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 altPairs("kitten") → "kien"
	 altPairs("Chocolate") → "Chole"
	 altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs(String str) {
		
		String finalString = "";

		for (int i = 0; i < str.length(); i += 4) {
			
			finalString = finalString + str.substring(i, i + 1);
			
			if (i + 1 < str.length()) {
				
				finalString = finalString + str.substring(i + 1, i + 2);	
			}
		}

		return finalString;
	}

	/*
	 Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but
	 the "a" can be any char. The "yak" strings will not overlap.
	 stringYak("yakpak") → "pak"
	 stringYak("pakyak") → "pak"
	 stringYak("yak123ya") → "123ya"
	 */
	public String stringYak(String str) {
		
		String finalString = "";
		
		for (int i = 0; i < str.length(); i++) {

			if (i < str.length() - 2 && str.substring(i, i + 3).equals ("yak")) {
				i += 2;
			}		
			else {
				finalString = finalString + str.substring(i, i + 1);
			}
		}			
		return finalString;
	}
	
}
