
public class GetPrimeNum {
	
	public GetPrimeNum(int n) {
		boolean[] primnums = new boolean[n];
		primnums[0] = true;
		primnums[1] = true;
		
		
		for(int i = 2; i < primnums.length; ++i) {
			if(primnums[i])
				continue;
			else {
				for(int j = 2 * i; j < primnums.length; j += i)
					primnums[j] = true;
			}
		}
	}
}
