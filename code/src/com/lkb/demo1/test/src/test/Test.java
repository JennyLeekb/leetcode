package test;

public class Test {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 2, 4 };
		Test test = new Test();
//		 int len = test.removeDepli(a);
		int len = test.removeDepli2(a);
		System.out.println("�Ƴ��ظ�Ԫ�غ�����鳤��Ϊ�� " + len);
		System.out.println("����Ԫ��Ϊ�� ");
		for (int i = 0; i < len; i++)
			System.out.print(a[i]);
	}

	/**
	 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
	 * 
	 * @param a
	 * @return
	 */
	public int removeDepli(int[] a) {
		int len = a.length;
		int i = 0;
		while (i < len - 1) {
			if (a[i + 1] != a[i])
				i++;
			else {
				len--;
				for (int j = i; j < len; j++)
					a[j] = a[j + 1];
			}
		}
		return len;
	}


	/**
	 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³���
	 * 
	 * @param a
	 * @return
	 */
	public int removeDepli2(int[] a) {
		int len = a.length;
		int i = 0;
		int j = i + 1;
		while (i < len-1) {
			while (j < len) {
				if (a[j] != a[i]) { // ���߲����
					if(j != (i+1))
						break;
					i++;
					j++;				
				} else { // �������
					j++;
				}
			}
			int dep = j - i;
			if (dep != 1) {
				len = len - dep + 1;
				int k = i + 1;
				while (k < len) {
					a[k] = a[k + dep - 1];
					k++;
				}
				j = i + 1;
			}
		}
		return len;
	}

}
