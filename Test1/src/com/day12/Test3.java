package com.day12;

// Interface
// �߻�Ŭ������ �������� ���� �ְ� ���ǰ� ����.
// final ������ ���� �Ҽ� �ִ�.
// �������̽��� �����ϱ� ���ؼ��� implements�� ���
// �ϳ��� �������̽��� �����ϸ� �������̽��� ��� �޼ҵ带 ������(�������̵�)�ؾ� �Ѵ�.(����)
// �������̽��� �������̽��� ��ӹ����� ������, �̶��� extends�� ����Ѵ�.
// ���� Ŭ�����ʹ� �ٸ��� ���߻���� �����ϴ�.
// �������̽��� �����.


interface Fruit {

	String Won = "��"; // 'public static final' �� �����Ǿ� �ִ�.

	int getPrice(); // public abstract �� ����
	public String getName(); // ���� abstract �� ����

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems() {
		return "����";
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; // upcast
		
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItem());  �θ�Ŭ������ �ڽ�Ŭ���� �޼ҵ� ���Ұ�
		
	}

}