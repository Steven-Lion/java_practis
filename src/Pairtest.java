
public class Pairtest {

	public static void main(String[] args) {
		
		double[] random = new double[20];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = 100 * Math.random();
			
		}
	}

}

class A{
	


public static  class pair{
//			����pair(first,snd);
		private  double first;
		private  double second;
//		����getFirsr();
	public  double getFirst(){
		return first;
	}
//		����getSconed();
	public  double getScoend(){
		return second;
	}
	

		
		public  pair(double f,double s){
			
			first = f;
			second = s;
			
		}
//		�����Ƚϵ����鲢����pair���͵�����.
	public static pair maxmin(double[] dex){
//		�Ƚ������е�max and min;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		/*
		 * ������ж�.
		 * for(double m : dex){
			if(min > m)
				return min = m;
			if(max < m)
				return max = m;
		
		}*/
		System.out.println(min+"-----"+max);
		
		return new pair(min,max);
		
		
	}
	
}



}