package POJ2159;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Lorin
 * Date: 13-8-30
 * Time: 下午11:30
 *
 * Description(poj2159)

 Ancient Roman empire had a strong government system with various departments, including a secret service department. Important documents were sent between provinces and the capital in encrypted form to prevent eavesdropping. The most popular ciphers in those times were so called substitution cipher and permutation cipher.
 Substitution cipher changes all occurrences of each letter to some other letter. Substitutes for all letters must be different. For some letters substitute letter may coincide with the original letter. For example, applying substitution cipher that changes all letters from 'A' to 'Y' to the next ones in the alphabet, and changes 'Z' to 'A', to the message "VICTORIOUS" one gets the message "WJDUPSJPVT".
 Permutation cipher applies some permutation to the letters of the message. For example, applying the permutation <2, 1, 5, 4, 3, 7, 6, 10, 9, 8> to the message "VICTORIOUS" one gets the message "IVOTCIRSUO".
 It was quickly noticed that being applied separately, both substitution cipher and permutation cipher were rather weak. But when being combined, they were strong enough for those times. Thus, the most important messages were first encrypted using substitution cipher, and then the result was encrypted using permutation cipher. Encrypting the message "VICTORIOUS" with the combination of the ciphers described above one gets the message "JWPUDJSTVP".
 Archeologists have recently found the message engraved on a stone plate. At the first glance it seemed completely meaningless, so it was suggested that the message was encrypted with some substitution and permutation ciphers. They have conjectured the possible text of the original message that was encrypted, and now they want to check their conjecture. They need a computer program to do it, so you have to write one.
 Input

 Input contains two lines. The first line contains the message engraved on the plate. Before encrypting, all spaces and punctuation marks were removed, so the encrypted message contains only capital letters of the English alphabet. The second line contains the original message that is conjectured to be encrypted in the message on the first line. It also contains only capital letters of the English alphabet.
 The lengths of both lines of the input are equal and do not exceed 100.
 Output

 Output "YES" if the message on the first line of the input file could be the result of encrypting the message on the second line, or "NO" in the other case.
 Sample Input

 JWPUDJSTVP
 VICTORIOUS
 Sample Output

 YES
 */
public class POJ2159
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char ch1[] = sc.nextLine().toCharArray();
		char ch2[] = sc.nextLine().toCharArray();
		if (ch1.length != ch2.length)
		{
			System.out.println("NO");

		}else
		{
			int a1[] = new int[ch1.length];
			int a2[] = new int[ch2.length];

			for (int i = 0; i < ch1.length; i++)
			{
				for (int j = i + 1; j < ch1.length; j++)
				{
					if ((ch1[j]) == (ch1[i]))
					{
						a1[i] = a1[i] + 1;
					}
				}
			}

			for (int i = 0; i < ch2.length; i++)
			{
				for (int j = i + 1; j < ch2.length; j++)
				{
					if (ch2[i] == (ch2[j]))
					{
						a2[i] = a2[i] + 1;
					}
				}
			}

			Arrays.sort(a1);
			Arrays.sort(a2);
			int k = 0;
			for (int i = 0; i < a1.length; i++)
			{
				if (a1[i] != a2[i])
				{
					k = 1;
					break;
				}
			}
			if (k == 1)
			{
				System.out.println("NO");
			}else
			{
				System.out.println("YES");
			}

		}
	}
}
