package lww.class3;

import java.util.Arrays;

public class Calculator {
	protected int a;
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		/*int total = calculator.calcutatNums(10, 11);
		System.out.println("10��20֮������ֺͣ�" + total);*/
		
//		System.out.println(calculator.calcutatNumsWhileTest());
		calculator.calculateNumsForTest();
	}
	
	/**
	 * �������������������֮���������֮��
	 * 
	 * @param beginNum ��ʼ����
	 * @param endNum  ����������
	 * @return  ��
	 */
	public int calcutatNums(int beginNum, int endNum){
		//�ͱ���
		int sum = 0;
		for(int i = beginNum; i <= endNum; i++){
			sum += i;
		}
		return sum;
	}
	
	public int calcutatNumsWhileTest(){
		//�ͱ���
		int sum = 0;
		//ѭ������
		int i = 1;
		while(sum < 1000){
			sum += i * (i+1);
			i++;
		}
		return i;
	}
	
	public int calculateNumsForTest(){
		int[] nums = {1,2,7,6,5,13,7,35,0,4};
		Arrays.sort(nums);
		int sum = 0;
		for(int i:nums){
//			sum += i;
			System.out.println(i);
		}
		System.out.println(Arrays.binarySearch(nums, 2));
		return 0;
	}
}
