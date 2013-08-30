package POJ2739;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-31
 * Time: 上午1:01
 */
public class Main
{
	public static void main(String[] args)
	{
		int num;
		int total;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			num = sc.nextInt();
			total=0;
			if (num == 0)
			{
				break;
			}
			ArrayList<Integer> array = initArray(num);

			for (int i = 0; i < array.size(); i++)
			{
				int sum = array.get(i);
				if(sum==num)
				{
					total++;
				}
				for (int j = i+1; j < array.size(); j++)
				{
					sum = sum + array.get(j);
					if (sum > num)
					{
						break;
					}else if (sum == num)
					{
						total++;
					}
				}
			}

			System.out.println(total);
		}
	}

	private static ArrayList<Integer> initArray(int num)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 2; i <= num; i++)
		{
			if (isPrimeNumber(i))
			{
				list.add(i);
			}
		}
		return list;
	}

	private static boolean isPrimeNumber(int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
