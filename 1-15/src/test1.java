import java.util.Arrays;
import java.util.Collections;

public class test1 {

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		//改行
		int number01 = plus(5, 10);
		System.out.println(number01);
		
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		//改行
		String sentence = "しんぶんし";
        if(isPalindrome(sentence)) {
            System.out.println(isPalindrome(sentence));
        } else {
            System.out.println(isPalindrome(sentence));
       }
		
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		//改行
		arr01(i);
		
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		
		arr02(k);
		
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int plus(int a, int b) {
		return a + b;
	}
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
    public static boolean isPalindrome(String sentence) {
        int minIdx = 0;
        int maxIdx = sentence.length() - 1;
         
        while(minIdx < maxIdx) {
            if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
                return false;
            }
        }
        return true;
    }
    
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void arr01(Integer[] i) {
	    Arrays.sort(i,Collections.reverseOrder());     
         System.out.println(Arrays.toString(i));
	
	}
    
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	
	public static void arr02(int[] k) {
	    int minIdx = 0;
         
        for(int j = 0;j < k.length; j++) {
        	minIdx = k[j]<k[minIdx]?j:minIdx;
        }
	    System.out.println(minIdx);
	}

}
