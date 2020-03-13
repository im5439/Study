package com.quiz5;

public class Q3 {

	public static void main(String[] args) {
/*		
	  1) �ڹٸ� �������ϰ� �����ϴ� ���
         cmd�� ����̵����Ͽ� javac�� �Բ� �ش� ������ �Է��Ѵ�. javac ���ϸ�.java �̷��� �����ϸ� �������� �ǿ� class������ �����ȴ�.
		 �׸��� java ���ϸ��� �Է��ϸ� ����ȴ�. 
		
	  2) �ڹ��� �⺻ �ڷ����� ũ��
		boolean - 1byte 
		char - 2byte
		byte - 1byte
		short - 2byte
		int - 4byte
		long - 8byte
		float - 4byte
		double - 8byte 
*/	 
//	  3) ���׿������� ���Ĺ� ������ ���� �����
//		���� = ���ǹ� ? true : false
		int a = 5;
		int b = a > 0 ? 10 : 5;
		System.out.println(b);
//		print -> 10
//
//	  4) ����� ������ ������ �����ϰ� ����� ������ ���� �ϳ��� �����
//		 if�� - ������ �Է��ϰ� true�� ���� ����ϰ� false�� �Ѿ��.
		 if(a > 0) {
			System.out.println("a�� 0���� ũ��."); 
		 } else
			 System.out.println("0���� �۴�.");
//		 for�� - for(���۰�;�ִ밪;������;) ���۰����� �ִ밪���� �ݺ��Ѵ�.
		 for(int i = 1; i < 10; i++) {
			 System.out.print(i);
		 }
		 System.out.println();
//		 while - while(�ִ밪) �ʱ�ȭ �� ���� �ִ밪���� �ݺ�
		 int t = 1;
		 while(t < 10) {
			 System.out.print(t);
			 t++;
		 }
		 System.out.println();
//		 do while - �ʱⰪ ���� �ִ밪�ݺ� ������ �ѹ��� ����
		 int i =1;
		 do {
			 System.out.print(i);
			 i++;
		 }while(i<10);
		 System.out.println();
//		 switch 
		 int n = 1;
		 switch(n) {
		 case 1 :
			 System.out.println("n�� 1");
			 break;
		 case 2 :
			 System.out.println("n�� 2");
			 break;
		 }
/*	
	  5) �迭�� ����� �迭�� ����,�ʱⰪ�� �ο��ϴ� ���
		 �迭�� ������ �����͸� ��Ƽ� �����ϱ� ���ؼ� ����ϴ� ������ Ÿ��
		 int[] ab = {1 ,2 ,3};
		 
	  6) ������,����Ʈ������ ����
		 ������
		 - ��ü�� ������ ���� �������� �ʱⰪ�� �����ϰ� �ʿ��� �ʱ�ȭ ������ �����ϴ� �޼ҵ�
		 - �ν��Ͻ� ������ �ʱ�ȭ�ϴ°��� �����̴�. �ϳ��� ������ ���ÿ� �������� ������ �ʱ�ȭ�� �� �ִ�.
       
		 ����Ʈ������
		 - �Ű������� ���� ������
		 - Ŭ������ �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻ �����ڸ� �߰��Ѵ�.
		    ( �����ڰ� �ϳ��� ������ �����Ϸ��� �⺻ �����ڸ� �߰����� �ʴ´�.)

	  7) �޼ҵ� �����ε��̶�
		 �̸��� ������ �ñ״�ó�� �ٸ� �޼ҵ带 �ߺ����� ���� �� �� �ִ� ���
		 
	  8) private, protected, public �̶�?
		 ����������  private�� Ŭ���� �ȿ����� ��� ������ �޼ҵ�, protected�� ��Ű�� �ȿ����� ��� ������ �޼ҵ�
		             public�� ��� ��� ������ �޼ҵ�
		 
	  9) import���� ����
		 import ��Ű����.Ŭ������;
		 
	  10) this, super ?
		 this�� �ڱ� �ڽ�(Ŭ����)�� ����, super�� �θ�Ŭ������ ����.
		 
	  11) final,static
		 final�� �ν��Ͻ� ���������� �ʱ�ȭ�� �ѹ��� �����ϰ�, �޼ҵ忡���� �������̵��� �Ұ����ϰ�, Ŭ���������� ����� �Ұ����ϴ�.
		 static�� 
		 
	  12) ����̶� ?
		 �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ������ ��� ���� 
		 
	  13) Object Ŭ���� ?
		 ��� Ŭ������ ����
		 
	  14) �޼ҵ� �������̵� ?
		 �θ�Ŭ������ �޼ҵ���� �ڽ�Ŭ������ �޼ҵ���� ���� �޼ҵ���� �ο��ϰ� �޼ҵ� �� ����� �ڽ�Ŭ������ ���� ����Ѵ�.
       ��Ӱ��迡�� �θ� ������ �ִ� �޼ҵ带 ������ �Ѵ�.
		 
	  15) String�� ���Ͽ� ������ �����ϰ� �߿�޼ҵ� 10���� ���� �Ǵ� ����?
        �����ϴ� �����Ͱ� ũ��, �ѹ� ����Ѱ��� ������ ���Ѵ�.(�Һ��� ��Ģ)
		  split - �迭�� ������, equals - �� �� , equalsIgnoreCase - ��ҹ��� ���оʰ� ��,  indexOf - �տ������� �ε����� ����, lastindexOf - �ڿ������� �ε����� ����
		  replaceAll(a,b) - a�� b�� �ٲ��, trim() - ���� ������ ���ش�. length() - ���� ���� ���, startsWith("") - ���۰��� ""�ΰ�
		 
	  16) StringBuffer�� ���Ͽ� ������ ����
		 StringBuffer�� ����ȭ�� �����ϴ�. ����ȭ�� �Ұ����� StringBuilder�� ���� ����ӵ��� ������.
		 
	  17) Calendar Ŭ������ ���� ������ ����(��ü�������, �ֿ�޼ҵ��)
		 Calendar ���� = Calendar.getInstance(); �� �����Ѵ�.
		 ��ü ���� ����� get, set���� ����
		 YEAR - �⵵  MONTH - ��  DATE - ��  DAY_OF_WEEK - ���� ��
		 
		 
	  18) �߻� Ŭ���� ?
		  �޸��� ���� ���� Ŭ������ �̸� �����ϰ� �޼ҵ带 ������ �ؼ� ���
*/	 
	}

}