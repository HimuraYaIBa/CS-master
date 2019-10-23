import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * 类功能描述：生成四则运算
 * 
 * @author：蔡奇宏、单政源
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

		// 进行输入条件
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("请输入您需要的题目数量:");
			Number = sc.nextInt();
			System.out.println("算式是否需要乘除法:0.否1.是");
			MaD = sc.nextInt();
			System.out.println("请输入算式操作数值范围:");
			Range = sc.nextInt();
			System.out.println("请输入算式是否需要负数：0.否1.是");
			Negative = sc.nextInt();
		} catch (Exception e) {
			System.out.println("输入错误");
		}
		// 循环条件
		for (int k = 0; k < Number; k++) {

			// 存在乘除法
			if (MaD == 1) {

				// 不存在负数
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
					System.out.println("第" + (k + 1) + "题:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");

					over.println("第" + (k + 1) + "题:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}

				// 存在负数
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
					System.out.println("第" + (k + 1) + "题:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");
					over.println("第" + (k + 1) + "题:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}
			}

			// 不存在乘除法
			else if (MaD == 0) {

				// 不存在负数
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
					System.out.println("第" + (k + 1) + "题:" + num1 + "" + op
							+ "" + num2 + "=" + sum + "");
					over.println("第" + (k + 1) + "题:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}

				// 存在负数
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
					System.out.println("第" + (k + 1) + "题:" + soure1 + "" + op
							+ "" + soure2 + "=" + sum + "");
					over.println("第" + (k + 1) + "题:" + soure1 + "" + op + ""
							+ soure2 + "=" + sum + "");
					over.flush();
				}
			}

		}
		System.out.println("数据已成功导出");
	}
}