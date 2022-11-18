class Solution {
    public String[] splitMessage(String message, int limit) {
        // since message length can be at most 10^4, we cant
        // possibly have more than 10^5-1 parts, or 5 digits in length
        for (int numDigits = 1; numDigits <= 5; numDigits++) {
            int maxParts = (int)Math.pow(10, numDigits) - 1;
            
            // determine if we can reach the end of message with the
            // maximum number of parts, if so we have our answer
            int idx = 0;
            for (int part = 1; part <= maxParts; part++) {
                int suffixLen = String.valueOf(part).length() + numDigits + 3;
                idx += limit - suffixLen;
                
                if (idx >= message.length()) {
                    // System.out.println(part);
                    return createOutput(message, limit, part);
                }
            }
        }
        
        return new String[0];
    }
    
    private String[] createOutput(String message, int limit, int numParts) {
        String[] output = new String[numParts];
        int idx = 0;
        
        for (int i = 1; i <= numParts; i++) {
            String suffix = "<" + i + "/" + numParts + ">";
            int contentLen = limit - suffix.length();
            
            // be sure to handle last part being shorter than limit
            int end = Math.min(idx + contentLen, message.length());
            
            output[i - 1] = message.substring(idx, end) + suffix;
            idx += contentLen;
        }
        
        return output;
    }
}