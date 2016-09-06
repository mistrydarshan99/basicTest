package com.example.darshanmistry.camera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.darshanmistry.camera.fragments.FragmentA;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        pushFragments(new FragmentA(), null, true, false, false, false, "", "FragmentA", R.id.lytMain);
    }

    public void pushFragments(Fragment fragment, Fragment oldOne, boolean isReplace, boolean isAdd, boolean isAddToBackStack, boolean isClear, String isClearTag, String tag, int replaceId) {

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (isReplace) {

            fragmentTransaction.replace(replaceId, fragment, tag);

        }

        if (isAdd) {

            fragmentTransaction.hide(oldOne);

            fragmentTransaction.add(replaceId, fragment, tag);
        }

        if (isAddToBackStack) {

            fragmentTransaction.addToBackStack(tag);
        }

        if (isClear) {

            fragmentManager.popBackStackImmediate(isClearTag, FragmentManager.POP_BACK_STACK_INCLUSIVE);
        }

        fragmentTransaction.commit();

    }

    public void popFragments() {

        FragmentManager manager = getSupportFragmentManager();

        int backCount = getSupportFragmentManager().getBackStackEntryCount();

        if (backCount != 0) {

            manager.popBackStack();

        } else {

            finish();

        }

    }

    @Override
    public void onBackPressed() {

        popFragments();
    }
}
