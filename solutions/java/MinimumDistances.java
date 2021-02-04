import java.util.HashMap;

public class MinimumDistances{
	public static int run(int[] a){
		HashMap<Integer, Integer> valuesChecked = new HashMap<Integer, Integer>();
		int minDist = -1;
		int dist = minDist;

		for(int i = 0; i < a.length; i++){
			if(valuesChecked.containsKey(a[i])){
				dist = i - valuesChecked.get(a[i]);
				if(minDist == -1 || minDist > dist){
					minDist = dist;
				}
			}
			valuesChecked.put(a[i], i);
		}
		return minDist;
	}
}