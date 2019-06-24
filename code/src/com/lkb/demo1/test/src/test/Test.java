package test;

public class Test {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 2, 4 };
		Test test = new Test();
//		 int len = test.removeDepli(a);
		int len = test.removeDepli2(a);
		System.out.println("移除重复元素后的数组长度为： " + len);
		System.out.println("数组元素为： ");
		for (int i = 0; i < len; i++)
			System.out.print(a[i]);
	}

	/**
	 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
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
	 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度
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
				if (a[j] != a[i]) { // 两者不相等
					if(j != (i+1))
						break;
					i++;
					j++;				
				} else { // 两者相等
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
