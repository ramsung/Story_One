package beyonity.story_one;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    ViewPager vg;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                  //  mTextMessage.setText(R.string.title_home);
                    if(vg!=null){
                      vg.setCurrentItem(0);
                    }
                    return true;
                case R.id.navigation_explorer:
                 //   mTextMessage.setText(R.string.title_explore);
                    if(vg!=null){
                        vg.setCurrentItem(1);
                    }
                    return true;
                case R.id.navigation_acc:
                //    mTextMessage.setText(R.string.title_acc);
                    if(vg!=null){
                        vg.setCurrentItem(2);
                    }
                    return true;
                case R.id.navigation_writer:
               //     mTextMessage.setText(R.string.title_writer);
                    if(vg!=null){
                        vg.setCurrentItem(3);
                    }
                    return true;
                case R.id.settings:
//     mTextMessage.setText(R.string.settings);
                    if(vg!=null){
                        vg.setCurrentItem(4);
                    }
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        vg = (ViewPager) findViewById(R.id.main);
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment(),"Home");
        adapter.addFragment(new ExploreFragment(),"Explore");
        adapter.addFragment(new AccountFragment(),"Account");
        adapter.addFragment(new WriterFragment(),"Write");
        adapter.addFragment(new SettingsFragment(),"Settings");

        vg.setAdapter(adapter);
        vg.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    navigation.setSelectedItemId(R.id.navigation_home);
                }else if(position == 1){
                    navigation.setSelectedItemId(R.id.navigation_explorer);
                }else if(position == 2){
                    navigation.setSelectedItemId(R.id.navigation_acc);
                }else if(position == 3){
                    navigation.setSelectedItemId(R.id.navigation_writer);
                }else if(position == 4) {
                    navigation.setSelectedItemId(R.id.settings);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public class PageAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public PageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
}
