
public class ArrayReduction {
	public static void main(String args[]){
	int[] arr={1,2,3,98} ;
	int sum = 0;
	for(int i=0;i<arr.length-1;i++){
		int j=i;
		int next=i+1;
		System.out.println("i is ::::"+i);
		arr[next]=arr[j]+arr[next];
		sum=sum+arr[next];
		System.out.println(sum);
	}
	System.out.println(sum);
}
}
