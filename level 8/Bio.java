public class Bio {

    public static String dnaToRna(String dna) {
        StringBuilder rnaComp = new StringBuilder();
        int i;
        for (i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'G') {
                rnaComp.append('G');
            }

            if (dna.charAt(i) == 'C') {
                rnaComp.append('C');
            }

            if (dna.charAt(i) == 'T') {
                rnaComp.append('A');
            }

            if (dna.charAt(i) == 'A') {
                rnaComp.append('A');
            }

        }
        return rnaComp.toString();
    }
}

