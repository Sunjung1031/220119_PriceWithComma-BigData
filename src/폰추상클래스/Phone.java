package ���߻�Ŭ����;

public abstract class Phone {
	//�������(�ʵ�)
    public String owner; //���� ������ �̸� 
	
    
    //������ => [�߿�]�߻� Ŭ������ �����ڸ� ���� �� �ִ�.
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//�޼ҵ� ���� 
    public void turnOn(){
		
		System.out.println("������ �մϴ�.");
		
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
