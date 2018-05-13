import java.math.BigInteger;  


class PlusOne {
    public int[] plusOne(int[] digits) {
       String result = "";
        for(int i : digits){
           result += i;
        }
        BigInteger a= new BigInteger(result);
        BigInteger b= new BigInteger("1");
        a = a.add(b);
        result = a.toString();
        int[] re = new int[result.length()];
        for(int i = 0;i < result.length();i++){
            re[i] = result.charAt(i) - '0';
        }
        return re;
    }
}