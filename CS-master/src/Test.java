import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * �๦��������������������
 * 
 * @author������ꡢ����Դ
 * 
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Number = 0, Range = 0, Negative = 0, MaD = 0, Trigger,num1 = 0, num2 = 0, sum = 0;
		char op = ' ';
		String soure1 = "", soure2 = "";

		PrintWriter over;
		try {
			over = new PrintWriter("G:/Test.txt");
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

		// ������������
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("����������Ҫ����Ŀ����:");
			Number = sc.nextInt();
			System.out.println("��ʽ�Ƿ���Ҫ�˳���:0.��1.��");
			MaD = sc.nextInt();
			System.out.println("��������ʽ������ֵ��Χ:");
			Range = sc.nextInt();
			System.out.println("��������ʽ�Ƿ���Ҫ������0.��1.��");
			Negative = sc.nextInt();
		} catch (Exception e) {
			System.out.println("�������");
		}
		// ѭ������
		for (int k = 0; k < Number; k++) {

			// ���ڳ˳���
			if (MaD == 1) {

				// �����ڸ���
				if (Negative == 0) {
					num1 = (int) (Math.random() * Range) + 1;
					num2 = (int) (Math.random() * Range) + 1;
					soure1 = "" + num1;
					soure2 = "" + num2;
					Trigger = (int) (Math.random() * 4);
					if (Trigger == 0) {
						op = '+';
						sum = num1 + num2;
					}
					if (Trigger == 1) {
						op = '-';
						sum = num1 - num2;
					}
					if (Trigger == 2) {
						op = '*';
						sum = num1 * num2;
					}
					if (Trigger == 3) {
						op = '/';
						sum = num1 / num2;
					}
					System.out.println("��" + (k + 1) + "��:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");

					over.println("��" + (k + 1) + "��:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}

				// ���ڸ���
				else if (Negative == 1) {
					num1 = (int) ((Math.random() * (2 * Range) - Range) + 1);
					num2 = (int) ((Math.random() * (2 * Range) - Range) + 1);
					if (num1 < 0) {
						soure1 = "(" + num1 + ")";
					} else {
						soure1 = "" + num1;
					}
					if (num2 < 0) {
						soure2 = "(" + num2 + ")";
					} else {
						soure2 = "" + num2;
					}
					Trigger = (int) (Math.random() % 4);
					if (Trigger == 0) {
						op = '+';
						sum = num1 + num2;
					}
					if (Trigger == 1) {
						op = '-';
						sum = num1 - num2;
					}
					if (Trigger == 2) {
						op = '*';
						sum = num1 * num2;
					}
					if (Trigger == 3) {
						op = '/';
						sum = num1 / num2;
					}
					System.out.println("��" + (k + 1) + "��:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");
					over.println("��" + (k + 1) + "��:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}
			}

			// �����ڳ˳���
			else if (MaD == 0) {

				// �����ڸ���
				if (Negative == 0) {
					num1 = (int) (Math.random() * Range) + 1;
					num2 = (int) (Math.random() * Range) + 1;
					soure1 = "" + num1;
					soure2 = "" + num2;
					Trigger = (int) (Math.random() % 2);
					if (Trigger == 0) {
						op = '+';
						sum = num1 + num2;
					}
					if (Trigger == 1) {
						op = '-';
						sum = num1 - num2;
					}
					System.out.println("��" + (k + 1) + "��:" + num1 + "" + op
							+ "" + num2 + "=" + sum + "");
					over.println("��" + (k + 1) + "��:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}

				// ���ڸ���
				else if (Negative == 1) {
					num1 = (int) ((Math.random() * (2 * Range) - Range) + 1);
					num2 = (int) ((Math.random() * (2 * Range) - Range) + 1);
					if (num1 < 0) {
						soure1 = "(" + num1 + ")";
					} else {
						soure1 = "" + num1;
					}
					if (num2 < 0) {
						soure2 = "(" + num2 + ")";
					} else {
						soure2 = "" + num2;
					}
					Trigger = (int) (Math.random() % 2);
					if (Trigger == 0) {
						op = '+';
						sum = num1 + num2;
					}
					if (Trigger == 1) {
						op = '-';
						sum = num1 - num2;
					}
					System.out.println("��" + (k + 1) + "��:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");
					over.println("��" + (k + 1) + "��:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}
			}

		}
		System.out.println("�����ѳɹ�����");
	}
}