package com.day16;

// wait, notify
// 동기화 블럭에서만 사용가능

class MyThread9 implements Runnable {
	
	private int bank = 10000;
	
	private int getBank() {
		return bank;
	}
	
	private int drawMoney(int m) {
		
		if(getBank() > 0) {
			
			bank -=m;
			
			System.out.println(Thread.currentThread().getName() + ", 인출: " + m + ", 잔액: " + bank);
			
		} else {
			
			 m = 0;
			
			 System.out.println(Thread.currentThread().getName() + "잔액부족!");
			 
			 
			 
		}
		return m;
		
	}
	
	
	@Override
	public void run() {
	
		synchronized (this) {
			
			for(int i=1; i<=10; i++) {
				
				if(getBank() <= 0) {
					this.notifyAll(); // 대기상태(wait)인 스레드를 모두깨움
					break;
				}
				
				drawMoney(1000);
				
				if(getBank()==2000 || getBank()==4000 || getBank()==6000 || getBank()==8000) {
					try {
						
						wait(); // stop
						
					} catch (Exception e) {
						// TODO: handle exception
					}
				} else {
					notify(); // resume 재실행
				}
				
			}
			
		}
	
	}
	
	
}

public class Test9 {

	public static void main(String[] args) {
		
		MyThread9 ob = new MyThread9();
		
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();
		
	}
	
}
