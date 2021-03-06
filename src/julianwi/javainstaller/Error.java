package julianwi.javainstaller;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

public class Error {
	public Error(String title, String message){
		new AlertDialog.Builder(MainActivity.context)
	    .setTitle(title)
	    .setMessage(message)
	    .setNeutralButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		})
		.show();
	}
	
	public Error(String title, String message, Context context){
		new AlertDialog.Builder(context)
	    .setTitle(title)
	    .setMessage(message)
	    .setNeutralButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
			}
		})
		.show();
	}
}
