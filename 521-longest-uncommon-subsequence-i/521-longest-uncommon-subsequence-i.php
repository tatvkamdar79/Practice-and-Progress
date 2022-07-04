class Solution {

    /**
     * @param String $a
     * @param String $b
     * @return Integer
     */
    function findLUSlength($a, $b) {
        if($a === $b) {
            return -1;
        }
        
        $lengthA = strlen($a);
        $lengthB = strlen($b);
        
        if($lengthA !== $lengthB) {
            return $lengthA > $lengthB ? $lengthA : $lengthB;
        }
        else {
            return $lengthA;
        }
    }
}