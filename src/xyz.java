import java.util.ArrayList;
import java.util.Scanner;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		// countab("IAmACompetitiveProgrammer");
		/*
		 * int t = scn.nextInt(); for (int i = 1; i <= t; i++) {
		 * 
		 * int num = scn.nextInt(); int a = prime(num); System.out.println(a); }
		 */
		System.out.println(uni(
				"jzrvgnywrcihhmrsdwywuuevbsygjejufdrlqpjjssqbejvjgwiaqmytgwbralmfqdqivarpsiqyrnjzlrcdfaxlyydzlrgbwzjrbbgvlyteoeezwgddgapeyufmnonjnzboajjnierwivvgbakjabqbxvnkjctybwmdgxqodimofhwhiiskjilggasrfmqiiemoeeejoqxuaudievuogiwmkpdpdvyncmcgqipfzpzzlejpzfffnetyvznyunlwzpesywxzlyywcjndotjcxecsdpsyfdwevdwtzvsmvskzdxdrqovpsxjwpbwuhuacxzxywrmsjwrouwfmmdefapdrrznavoevpdtlugdfextavapidtpgiszbtndqdjlsmhdgpjntgiudjjloecuouuspjxgmhtetajcpsrjaafelqrzwuwkqqeibcqnjjtemcgbxymxatdljvkfrgshyypzaholrjqdoyglwtkymojylufccxjdybcaitmbceeqcldbgozuejspfyrhxckvdpwmkkpmoufqhirpytjcccrjcksznfxquteedustqzjzidoiwzlabejfpbfcgeuczbiexdxnciomlcvjbijfmumdythgxcjwdtaayxpbgdpthkdkuorhjemhxunvwytbuwdstuvbzlxgxassombzqniphwmfwgiqcnjxhgbiryqpajjqvksnzacjwrqvzzldowayddgwdxnfiwyfgqsiqwrpphkoixrxwuxzxdxdclikhgrqwlypirgzaqojpfilzfmzkkcpxmzettwrewionooogczwhjhjqwiaimpfyrjtkiloetduktiqvjmeswniuxkclchkvsdhaqxhmcbwvlmqubvozkytikvvmcfjwlqzbognqhlmuyeqbzeamctwoqrbuxkqidplrxzjgkvakaqnbwpnaijpabquaclifctyauiihfjthbjjyyyyhinjldelirvptqovnyeudpplqywoxungeappgtcomxfgqvddt"));
		System.out.println(got(
				"jzrvgnywrcihhmrsdwywuuevbsygjejufdrlqpjjssqbejvjgwiaqmytgwbralmfqdqivarpsiqyrnjzlrcdfaxlyydzlrgbwzjrbbgvlyteoeezwgddgapeyufmnonjnzboajjnierwivvgbakjabqbxvnkjctybwmdgxqodimofhwhiiskjilggasrfmqiiemoeeejoqxuaudievuogiwmkpdpdvyncmcgqipfzpzzlejpzfffnetyvznyunlwzpesywxzlyywcjndotjcxecsdpsyfdwevdwtzvsmvskzdxdrqovpsxjwpbwuhuacxzxywrmsjwrouwfmmdefapdrrznavoevpdtlugdfextavapidtpgiszbtndqdjlsmhdgpjntgiudjjloecuouuspjxgmhtetajcpsrjaafelqrzwuwkqqeibcqnjjtemcgbxymxatdljvkfrgshyypzaholrjqdoyglwtkymojylufccxjdybcaitmbceeqcldbgozuejspfyrhxckvdpwmkkpmoufqhirpytjcccrjcksznfxquteedustqzjzidoiwzlabejfpbfcgeuczbiexdxnciomlcvjbijfmumdythgxcjwdtaayxpbgdpthkdkuorhjemhxunvwytbuwdstuvbzlxgxassombzqniphwmfwgiqcnjxhgbiryqpajjqvksnzacjwrqvzzldowayddgwdxnfiwyfgqsiqwrpphkoixrxwuxzxdxdclikhgrqwlypirgzaqojpfilzfmzkkcpxmzettwrewionooogczwhjhjqwiaimpfyrjtkiloetduktiqvjmeswniuxkclchkvsdhaqxhmcbwvlmqubvozkytikvvmcfjwlqzbognqhlmuyeqbzeamctwoqrbuxkqidplrxzjgkvakaqnbwpnaijpabquaclifctyauiihfjthbjjyyyyhinjldelirvptqovnyeudpplqywoxungeappgtcomxfgqvddt"));
	}

	public static int prime(int n) {
		int ans = 0;
		if (n > 20) {
			int count = 1;
			for (int i = 20; i <= n; i++) {
				if (isprime(i)) {
					count++;
				}
			}
			ans = n - count;
		} else {
			return n - 1;
		}

		return ans;

	}

	public static boolean isprime(int n) {
		int div = 2;
		int var = 0;
		while (div <= n - 1) {

			if (n % div == 0) {
				var = 1;
			}
			div++;
		}
		if (var == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void countab(String str) {

		for (int i = 0; i < str.length(); i++) {
			char cc = str.charAt(i);
			if (cc >= 'A' && cc <= 'Z') {
				if (i != 0) {
					System.out.println();
				}
				System.out.print(cc);
			}
			if (cc >= 'a' && cc <= 'z') {
				System.out.print(cc);
			}
		}
	}

	public static ArrayList<String> uni(String str) {

		String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < str.length(); j++) {
				String rec = str.substring(j, j + 1);
				if (arr[i].equals(rec)) {
					list.add(arr[i]);
					break;
				}
			}
		}
		return list;
	}

	public static String got(String str) {

		ArrayList<String> list = uni(str);

		int var = 0;
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			var = 0;
			for (int j = 0; j < str.length(); j++) {
				String rec = str.substring(j, j + 1);
				if (list.get(i).equals(rec)) {
					var++;
				}
			}
			System.out.print(var + " ");
			if (var % 2 == 1) {
				count++;
			}
		}

		if (count > 1) {
			return "NO";
		} else {
			return "YES";
		}

	}
}
