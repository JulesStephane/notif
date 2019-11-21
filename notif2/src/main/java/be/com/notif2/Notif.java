package be.com.notif2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Notif extends AppCompatActivity {

    private final static Notif INSTANCE = new Notif();
    static LayoutInflater inflater;
    static Toast toast;
    static TextView text;


    public static Notif successToast(Activity activity, String message) {

        inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.lib_activity_main,
                (ViewGroup) activity.findViewById(R.id.custom_toast_container));

        layout.setBackgroundColor(activity
                .getResources().getColor(R.color.successMessage));

        text = layout.findViewById(R.id.header1);
        text.setText(message);

        toast = new Toast(activity);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

        return INSTANCE;

    }
}
