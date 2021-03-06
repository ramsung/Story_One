package beyonity.story_one.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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
