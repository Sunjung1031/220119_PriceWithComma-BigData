package �ݾ׿��޸��ֱ⿹��;

import java.text.DecimalFormat;

/*
 * ��ƿ��Ƽ Ŭ������ ���� Ŭ�������� �����ϰ� "����"�ؼ�
 * ����� �� �ִ� Ŭ������ �ǹ��Ѵ�. 
 * DecimalFormat(String pattern) ������ ����
 */
public class Utils {
	//�Ѱܹ��� �ݾ׿� õ�������� �޸�(,)�� �ִ� �޼ҵ� ���� 
	/*
	 * �޼ҵ� ���� ��� 
	 * ���������� static(����) ��ȯŸ�� �޼ҵ��̸�(�ڷ��� �Ű�����1,...,�ڷ��� �Ű�����n) {
	 *        ������ ���� 
	 *        . . . 
	 * }
	 */
	public static String toNumberFormat(long totalAmount) {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(totalAmount);
	}
}
