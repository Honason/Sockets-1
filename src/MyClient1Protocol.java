import java.util.HashMap;

class MyClient1Protocol {

    public String processInput(String theInput) {
        String theOutput;

        if (theInput.indexOf("UPPER#") == 0) {
            String[] theOutputArray = theInput.split("#", 2);

            theOutput = theOutputArray[1].toUpperCase();

        } else if (theInput.indexOf("LOWER#") == 0) {
            String[] theOutputArray = theInput.split("#", 2);

            theOutput = theOutputArray[1].toLowerCase();

        } else if (theInput.indexOf("REVERSE#") == 0) {
            String[] theOutputArray = theInput.split("#", 2);

            String word = theOutputArray[1];
            String reversed = "";

            for (int i = word.length()-1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            theOutput = reversed;

        } else if (theInput.indexOf("TRANSLATE#") == 0) {
            String[] theInputArray = theInput.split("#", 2);
            String tempInput = theInputArray[1].toLowerCase();

            HashMap words = new HashMap();
            words.put("hunt", "dog");
            words.put("kat", "cat");
            words.put("mand", "man");
            words.put("kvinde", "woman");

            if (words.containsKey(tempInput)) {
                theOutput = words.get(tempInput).toString();
            } else {
                theOutput = "Word '" + tempInput + "' was not found in the dictionary.";
            }

        } else {
            theOutput = "Close";
        }

        return theOutput;
    }
}