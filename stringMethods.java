public class stringMethods {
    public static void main(String[] args) {
        // String ko initialization garne
        String str = "Hello, Java!"; // String cha "Hello, Java!"

        // String ko length paune
        System.out.println("Length: " + str.length()); // Length: 13

        // String lai uppercase ma convert garne
        System.out.println("Uppercase: " + str.toUpperCase()); // Uppercase: HELLO, JAVA!

        // String lai lowercase ma convert garne
        System.out.println("Lowercase: " + str.toLowerCase()); // Lowercase: hello, java!

        // Specific index ko char paune
        System.out.println("Char at index 4: " + str.charAt(4)); // Char at index 4: o

        // Substring ko part nikalne
        System.out.println("Substring (7, 11): " + str.substring(7, 11)); // Substring (7, 11): Java

        // Character ko index khojne
        System.out.println("Index of 'a': " + str.indexOf('a')); // Index of 'a': 7

        // Last index of character khojne
        System.out.println("Last index of 'a': " + str.lastIndexOf('a')); // Last index of 'a': 10

        // Character lai arko character le replace garne
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o')); // Replace 'a' with 'o': Hello, Jovo!

        // String ko aage rako whitespace hataune
        String strWithSpaces = "   Hello, Java!   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); // Trimmed: 'Hello, Java!'

        // String ko starting prefix cha ki chaina check garne
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // Starts with 'Hello': true

        // String ko ending suffix cha ki chaina check garne
        System.out.println("Ends with 'Java!': " + str.endsWith("Java!")); // Ends with 'Java!': true

        // String ko andar "Java" cha ki chaina check garne
        System.out.println("Contains 'Java': " + str.contains("Java")); // Contains 'Java': true

        // String lai space ko base ma split garne
        String[] words = str.split(" ");
        System.out.println("Split by space: ");
        for (String word : words) {
            System.out.println(word); // Split by space: Hello, Java!
        }

        // String ko compare garne case-sensitive
        String str2 = "Hello, Java!";
        System.out.println("Equal to 'Hello, Java!': " + str.equals(str2)); // Equal to 'Hello, Java!': true

        // String ko compare garne case-insensitive
        String str3 = "hello, java!";
        System.out.println("Equal to 'hello, java!' (ignore case): " + str.equalsIgnoreCase(str3)); // Equal to 'hello, java!' (ignore case): true

        // String ko empty cha ki chaina check garne
        String emptyStr = "";
        System.out.println("Is empty string empty? " + emptyStr.isEmpty()); // Is empty string empty? true

        // String ko blank cha ki chaina check garne (only whitespace)
        String blankStr = "   ";
        System.out.println("Is blank string blank? " + blankStr.isBlank()); // Is blank string blank? true

        // String haru lai join garne
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined: " + joined); // Joined: Java, Python, C++

        // String ko formatting garne
        System.out.println("Formatted string: " + String.format("Hello, %s!", "Java")); // Formatted string: Hello, Java!

        // String ko valueOf method ko use garne
        int num = 123;
        System.out.println("String valueOf: " + String.valueOf(num)); // String valueOf: 123

        // Char array ma string ko conversion
        char[] charArray = str.toCharArray();
        System.out.println("String to char array: ");
        for (char c : charArray) {
            System.out.print(c + " "); // String to char array: H e l l o ,   J a v a !
        }
        System.out.println();

        // Char ko specific position ko value paune
        char ch = str.charAt(6); // 'J' character
        System.out.println("Character at position 6: " + ch); // Character at position 6: J

        // Char ko string ma conversion garne
        String charToString = String.valueOf(ch);
        System.out.println("Char to String: " + charToString); // Char to String: J

        // String ko repetition (n bar garne)
        String repeatedStr = "Hello ".repeat(3);
        System.out.println("Repeated string: " + repeatedStr); // Repeated string: Hello Hello Hello

        // String ko content ko equality check garne
        String str4 = "Hello, Java!";
        System.out.println("Content equals: " + str.equals(str4)); // Content equals: true

        // String ko upper case ko comparison (ignore case)
        String str5 = "HELLO, JAVA!";
        System.out.println("Equals ignoring case: " + str.equalsIgnoreCase(str5)); // Equals ignoring case: true

        // String ko hashcode paune
        System.out.println("Hashcode of string: " + str.hashCode()); // Hashcode of string: 69609650

        // String ko reverse garne
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed string: " + sb.reverse().toString()); // Reversed string: !avaJ ,olleH

        // String ko replaceAll garne (regex ko base ma)
        String replacedAllStr = str.replaceAll("Java", "Python");
        System.out.println("Replaced all 'Java' with 'Python': " + replacedAllStr); // Replaced all 'Java' with 'Python': Hello, Python!

        // String ko matches garne (regex ko saath)
        String regex = ".*Java.*";
        System.out.println("Matches regex '.*Java.*': " + str.matches(regex)); // Matches regex '.*Java.*': true

        // String ko lexicographical comparison garne (compareTo)
        System.out.println("CompareTo result: " + str.compareTo(str4)); // CompareTo result: 0

        // String ko lexicographical comparison garne (ignore case) (compareToIgnoreCase)
        System.out.println("CompareToIgnoreCase result: " + str.compareToIgnoreCase(str5)); // CompareToIgnoreCase result: 0

        // String ko lastIndexOf (last occurrence paune)
        System.out.println("Last index of 'a': " + str.lastIndexOf('a')); // Last index of 'a': 10

        // String ko getBytes method (byte array ma conversion)
        byte[] byteArray = str.getBytes();
        System.out.print("Byte array: ");
        for (byte b : byteArray) {
            System.out.print(b + " "); // Byte array: 72 101 108 108 111 44 32 74 97 118 97 33
        }
        System.out.println();

        }
}
