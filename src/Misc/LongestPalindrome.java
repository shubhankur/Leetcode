package Misc;

public class LongestPalindrome {
    public static String findLongestPalindrome(String s) {
        String subStr = "";
        String maxSubstr="";
        int j=0;
        for(int i=0;i<s.length();i++){
            subStr=subStr+s.charAt(i);
            if(subStr.length()>=2){
                boolean isPalindrome = checkPalindrome(subStr);
                if(isPalindrome){
                    if(subStr.length()>maxSubstr.length()){
                        maxSubstr=subStr;
                    }
                }
                else{
                    if(i==s.length()-1) {
                        i=j++;
                        subStr = "";
                    }
                }
            }
        }
        if(maxSubstr.length()==0) return String.valueOf(s.charAt(0));
        return maxSubstr;
    }
    public static boolean checkPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(findLongestPalindrome("bkuadixhrtfehvbjjzojfyhuqyckdeilnftnklylyssbjivhvnplrzwrgcnrciypvacbhdnglflipnlpzgivjfieunhzeaytshrintdwhbvbkhbsqbjxwhqrlneiwkmccdnfcvapmtqihzyyoiaoqgtxkpbqqdboaxmmsdjxvdrwbhdnemqmsikoksfvjjovrbgdtfgmhgryvvpunzrsluqzibsvyubyhqevpnfnszzriljpmoevpqacbvdcsgfzmnkhnshsvynxxncqyjxqazcttkvjnkuvykgdrquybvlpwzladpetocuphzkgfuutqcbnttwjmkkwbmbidcyauopcxmsarodoracqabirbawtlgsytlflsiolxjghjmqrymadpzaetcchyvkaezeavjemubbquclhcjcmbwxphllhfnzfyewpyyiirgnohylfbtfddeohtifrqiiwpdtyqjyemqjlnpcwlsylxjuxtnmcrpdznbzschmnjxnldxpkbrikpfsfwhsarrfjueubvnztlwmognapvxwelyvueheqxtncpxhzwplaxqqrbmfmmqhohucxinxidxzhndvstideuwrisjgpwkgvsdxmlnfgqzzksflmjzckkyutrwptfvcawfbvqxlztstpoitdepexxiqtsdtjmssqbdinalsqkjjqkgilbfxajninuclquszwbmstcdbywfhhnierqsegafyfqzvmqockcowfqwbgfxvdxbqobditvowhtdeptljetgj"));
    }
}
