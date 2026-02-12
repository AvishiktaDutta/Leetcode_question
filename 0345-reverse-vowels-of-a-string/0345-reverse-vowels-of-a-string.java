class Solution {
    public static String reverseVowels(String s) {

        // Convert string to character array for in-place modification
        char[] arr = s.toCharArray();

        // Array to store indices of vowels found in the string
        int[] ls = new int[s.length()];

        int count = 0; // Tracks number of vowels
        int index = 0; // Stores total vowel count

        // First pass: identify vowels and store their indices
        for (int i = 0; i < arr.length; i++) {

            // Check if current character is a vowel (uppercase or lowercase)
            if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || 
                arr[i] == 'O' || arr[i] == 'U' ||
                arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || 
                arr[i] == 'o' || arr[i] == 'u') {

                // Store vowel index
                ls[count] = i;
                index++;
                count++;
            }
        }

        // Second pass: reverse vowels using two-pointer swapping
        for (int i = 0; i < index / 2; i++) {

            // Store the first vowel character
            char temp = arr[ls[i]];

            // Get index of corresponding vowel from the end
            int last = ls[index - i - 1];

            // Swap the vowels
            arr[ls[i]] = arr[last];
            arr[last] = temp;
        }

        // Convert modified character array back to string
        return new String(arr);
    }
}