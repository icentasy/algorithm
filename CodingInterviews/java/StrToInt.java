package algorithm;

public class StrToInt {
	public int StrToInt(String str) {
		str = str.trim();
		if(str == null || str.isEmpty())
			return 0;
		int isNegative = 1;
		if(str.charAt(0) == '-'){
			isNegative = -1;
			str = str.substring(1);
		}
		else if(str.charAt(0) == '+'){
			str = str.substring(1);
		}
		int number = 0;
		for(int i = 0; i < str.length(); i++){
			int curC = str.charAt(i) - '0';
			if(curC > 9 || curC < 0)
				return 0;
			number = number * 10 + curC;//(number << 1) + (number << 3) + (str[i] & 0xf);
		}
		return number * isNegative;
    }
	
	public static void main(String[] args){
		StrToInt j = new StrToInt();
		System.out.println(j.StrToInt("-01234"));
	}
}