package command.refactorized;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import command.refactorized.Tv.Tv;
import command.refactorized.Tv.TvProgramDown;
import command.refactorized.Tv.TvProgramUp;
import command.refactorized.Tv.TvShowStatus;
import command.refactorized.Tv.TvVolumeDown;
import command.refactorized.Tv.TvVolumeUp;

public class RemoteApp {

	private static String readLine() {
		String text = null;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			text = br.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		
		Map<String, Command> tvRemote = new HashMap<String, Command>();		
		tvRemote.put("p+", new TvProgramUp(tv));
		tvRemote.put("p-", new TvProgramDown(tv));
		tvRemote.put("v+", new TvVolumeUp(tv));
		tvRemote.put("v-", new TvVolumeDown(tv));
		tvRemote.put("showStatus", new TvShowStatus(tv));
		
		String operation = null;
		while(!"exit".equals(operation)) {
			System.out.print("Escribe la operación (p+, p-, v+, v-, exit): ");
			operation = readLine();
			
			if(tvRemote.containsKey(operation)) {
				tvRemote.get(operation).execute();
			}
			
			tvRemote.get("showStatus").execute();
		}
		
	}
}
