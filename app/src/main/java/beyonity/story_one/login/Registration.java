package beyonity.story_one.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import beyonity.story_one.MainActivity;
import beyonity.story_one.R;

/**
 * Created by mohan on 9/19/17.
 */

public class Registration extends AppCompatActivity{

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
	}

	public void skip(View view){
		Intent intent = new Intent(Registration.this, MainActivity.class);
		startActivity(intent);
		finish();
	}

	public void gotologin(View view){
		Intent intent = new Intent(Registration.this, Login.class);
		startActivity(intent);
		finish();
	}
}
