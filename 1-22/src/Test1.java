import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		// 改行
		System.out.println("問１");
		// 問題1:現在の時刻を出力してください
		// 改行
        Date date01 = new Date();
        System.out.println(date01.toString());

	
		System.out.println("問２");
		// 問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		// 改行
		try {
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date_shinya = sdFormat.parse(shinyaBirthday);
			Date date_minami = sdFormat.parse(minamiBirthday);
			
			if(date_minami.before(date_shinya)) {
				String str = new SimpleDateFormat("yyyy/MM/dd").format(date_minami);
	            System.out.println(str);
			}else {
				String str = new SimpleDateFormat("yyyy/MM/dd").format(date_shinya);
	            System.out.println(str);
			}
				
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("問３");
		// 問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		try {
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date date_furuyama = sdFormat.parse(furuyamaBirthday);
	        Calendar cl = Calendar.getInstance();
	        cl.setTime(date_furuyama);
	        
	        cl.add(Calendar.YEAR,5);
	        cl.add(Calendar.MONTH,2);
	        
	        date_furuyama = cl.getTime();
	        String str = new SimpleDateFormat("yyyy/MM/dd").format(date_furuyama);
            System.out.println(str);
	        
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
