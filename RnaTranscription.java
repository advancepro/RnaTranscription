package sample;

public class RnaTranscription {
    public String transcribe(String s) {
            StringBuilder rnaComp = new StringBuilder();
            int i;
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'G') {
                    rnaComp.append('C');
                }

                else if (s.charAt(i) == 'C') {
                    rnaComp.append('G');
                }

                else if (s.charAt(i) == 'T') {
                    rnaComp.append('A');
                }

                else if (s.charAt(i) == 'A') {
                    rnaComp.append('U');
                }
                else {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
            return rnaComp.toString();
        }
    }
