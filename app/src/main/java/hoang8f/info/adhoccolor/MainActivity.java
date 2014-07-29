package hoang8f.info.adhoccolor;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;


public class MainActivity extends Activity implements View.OnClickListener {

    public static final String KEY_COLOR_CODE = "COLOR_CODE";

    public static final int COLOR_1 = 1;
    public static final int COLOR_2 = 2;
    public static final int COLOR_3 = 3;
    public static final int COLOR_4 = 4;

    public static final int ANIMATION_POP_CENTER = 1;
    public static final int ANIMATION_LEFT_TO_RIGHT = 2;
    public static final int ANIMATION_RIGHT_TO_LEFT = 3;

    Fragment fragment1;
    Fragment fragment2;
    Fragment fragment3;
    Fragment fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        if (savedInstanceState == null) {
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        FragmentTransaction ft;
        switch (v.getId()) {
            case R.id.button1:
                if (fragment1 == null) {
                    fragment1 = new PlaceholderFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt(KEY_COLOR_CODE, COLOR_1);
                    fragment1.setArguments(bundle);
                }
                ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right, 0, 0);
                ft.replace(R.id.container, fragment1).commit();
                break;
            case R.id.button2:
                if (fragment2 == null) {
                    fragment2 = new PlaceholderFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt(KEY_COLOR_CODE, COLOR_2);
                    fragment2.setArguments(bundle);
                }
                ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right, 0, 0);
                ft.replace(R.id.container, fragment2).commit();
                break;
            case R.id.button3:
                if (fragment3 == null) {
                    fragment3 = new PlaceholderFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt(KEY_COLOR_CODE, COLOR_3);
                    fragment3.setArguments(bundle);
                }
                ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right, 0, 0);
                ft.replace(R.id.container, fragment3).commit();
                break;
            case R.id.button4:
                if (fragment4 == null) {
                    fragment4 = new PlaceholderFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt(KEY_COLOR_CODE, COLOR_4);
                    fragment4.setArguments(bundle);
                }
                ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_right, 0, 0);
                ft.replace(R.id.container, fragment4).commit();
                break;
            default:
                break;
        }
    }

    private void showColor(int colorCode, int animationType) {

        switch (colorCode) {
            case COLOR_1:
                break;
            case COLOR_2:
                break;
            case COLOR_3:
                break;
            case COLOR_4:
                break;
        }

        switch (animationType) {
            case ANIMATION_POP_CENTER:
                break;
            case ANIMATION_LEFT_TO_RIGHT:
                break;
            case ANIMATION_RIGHT_TO_LEFT:
                break;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            Bundle bundle = this.getArguments();
            if (bundle != null) {
                int color = bundle.getInt(KEY_COLOR_CODE, COLOR_1);
                switch (color) {
                    case COLOR_1:
                        rootView.setBackgroundColor(getResources().getColor(R.color.fbutton_color_green_sea));
                        break;
                    case COLOR_2:
                        rootView.setBackgroundColor(getResources().getColor(R.color.fbutton_color_peter_river));
                        break;
                    case COLOR_3:
                        rootView.setBackgroundColor(getResources().getColor(R.color.fbutton_color_alizarin));
                        break;
                    case COLOR_4:
                        rootView.setBackgroundColor(getResources().getColor(R.color.fbutton_color_sun_flower));
                        break;
                    default:
                        //Do nothing
                }
            }
            return rootView;
        }
    }
}
