package avneet.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

   FloatingActionButton fab3,fab4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab3=(FloatingActionButton) findViewById(R.id.floatingActionButton2);
        fab4=(FloatingActionButton)findViewById(R.id.floatingActionButton4);
        View parentView = getLayoutInflater().inflate(R.layout.dialog,null);
        BottomSheetDialog.setContentView(parentView);
        BottomSheetBehavior bottomSheetBehavior=BottomSheetBehavior.from((View)parentView.getParent());
        BottomSheetBehavior.setPeeknxaskbj

    }
}
