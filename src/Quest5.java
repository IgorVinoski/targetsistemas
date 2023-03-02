public class Quest5 {
    public static void main(String[] args) {
        String nome = "Igor";



        int letras = nome.length();
        char[] tempCharArray = new char[letras];
        char[] charArray = new char[letras];

        // put original string in an array of chars
        for (int i = 0; i < letras; i++) {
            tempCharArray[i] = nome.charAt(i);
        }

        // reverse array of chars
        for (int j = 0; j < letras; j++) {
            charArray[j] = tempCharArray[letras - 1 - j];
        }

        String rogi = new String(charArray);
        System.out.println(rogi);
    }

}

