package command.undo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import command.undo.tv.Tv;
import command.undo.tv.TvProgramDown;
import command.undo.tv.TvProgramUp;
import command.undo.tv.TvShowStatus;
import command.undo.tv.TvVolumeDown;
import command.undo.tv.TvVolumeUp;

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
		
		Stack<Command> actionStack = new Stack<Command>();
		
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
				Command command = tvRemote.get(operation);
				command.execute();
				actionStack.push(command);
				
				tvRemote.get("showStatus").execute();
			}
		}
		
		System.out.println("Undo all operations");
		
		while(!actionStack.isEmpty()) {
			actionStack.pop().undo();
			
			tvRemote.get("showStatus").execute();
		}
	}
}
