package com.momobites.prash.varnamaala.Category06Six;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.momobites.prash.varnamaala.ModelAdapters.MenuAdapter;
import com.momobites.prash.varnamaala.R;

/**
 * Created by prash on 7/1/2017.
 */

public class CatSixActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MenuAdapter adapter;
    View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity
        setContentView(R.layout.activity_fragments);
        // Find and then Set Viewpager
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        // Create Adapter for fragments
        CatSixActivity.PageAdapter pageAdapter = new CatSixActivity.PageAdapter(getSupportFragmentManager(), CatSixActivity.this);
        // Set in the adapter
        viewPager.setAdapter(pageAdapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        // Connect the tab layout with the view pager. This will
        tabLayout.setupWithViewPager(viewPager);

    }




    class PageAdapter extends FragmentPagerAdapter {




        private Context mContext;

        public PageAdapter(FragmentManager fm, CatSixActivity context) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return new DailyFood();
                case 1:
                    return new VegetablesAndSpices();
                case 2:
                    return new FruitAndNuts();
                case 3:
                    return new Drinks();

            }

            return null;
        }

        // Set Tab Titles and the Number of Tabs
        String tabTitles[] = new String[]{
                "Daily",
                "Vegies",
                "Fruits",
                "Drinks"
        };

        @Override
        public int getCount() {
            return tabTitles.length;
        }


        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

    }




}
