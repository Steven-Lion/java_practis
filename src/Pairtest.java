
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
//			创建pair(first,snd);
		private  double first;
		private  double second;
//		创建getFirsr();
	public  double getFirst(){
		return first;
	}
//		创建getSconed();
	public  double getScoend(){
		return second;
	}
	

		
		public  pair(double f,double s){
			
			first = f;
			second = s;
			
		}
//		创建比较的数组并返回pair类型的数据.
	public static pair maxmin(double[] dex){
//		比较数组中的max and min;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		/*
		 * 这代码有毒.
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