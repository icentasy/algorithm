package algorithm;

public class JumpFloorII {
	/**本例使用公式（1）实现
	 * f(n) = f(n-1) + f(n-2) + …… + f(1)         公式（1）
	 * f(n-1) = f(n-2) + f(n-3) + …… + f(1)
	 * 所以f(n) = 2*f(n-1)
	 * 而且f(1) = 1
	 * 所以f(n) = 2^(n-1)                           公式（2）
	 */
	public int JumpFloorII(int target) {
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        int res = 0;
        for(int i = target; i > 1; i--){
            res += JumpFloorII(i - 1);
        }
        return res + 1;
    }
	
	public static void main(String[] args){
		JumpFloorII j = new JumpFloorII();
		System.out.println(j.JumpFloorII(3));
	}
}