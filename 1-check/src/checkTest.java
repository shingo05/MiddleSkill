import java.util.Scanner;
import java.util.logging.Logger;

public class checkTest {
	
private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//「Ctrl + Shift + R」
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//「Ctrl + Alt + R」
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//ブレイクポイントをソース左側の行番号をダブルクリックにて設定。
		//「ムシ」のマークであるデバックの実行
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		//型推論が使えるようになった
		//interfaceにprivateメソッドを導入
		//default処理やstaticの処理でprivateメソッドを活用できる
		//ジェネリクスの宣言が簡潔になった
		//_を変数名に使用できなくなった
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		Scanner m = new Scanner(System.in);
		int x;
		int price = 1000;
		
		System.out.print("人数を入力してください = ");
		 x = m.nextInt();
		
		if(x < 10) {
			int total = x * price;
			System.out.println(total);
		}else if(x >= 10 && x < 20) {
			price = 820;
			int total = x * price;
			System.out.println(total);
		}else if(x >= 20) {
			price = 700;
			int total = x * price;
			System.out.println(total);
		}
		
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//配列の数だけ得点を入力してもらう
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			//得点の合計をsumに取得
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//得点の平均をaveに取得
			ave = sum / (double)score.length;
			//取得した平均値を出力
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを１箇所修正してください
		String message = "Hello World!";
		try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
        	LOGGER.info("The message is: " + message);
        }
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
		String str = "25";
		try {
			int number = Integer.parseInt(str);
			System.out.println(number);
		} catch (NullPointerException e) {
			System.out.println("ヌルポが発生しました");
		} catch (NumberFormatException e) {
			System.out.println("数字フォーマットエラーが発生しました");
		} catch (Exception e) {
		    System.out.println("何らかの例外が発生しました");
		}
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//理解できていないところも多く、問題を作っていただけるのはほんとにありがたいと思った。ありがとうございます。
	}


}
