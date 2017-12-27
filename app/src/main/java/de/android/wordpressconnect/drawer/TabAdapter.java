package de.android.wordpressconnect.drawer;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

import java.util.List;

import de.android.wordpressconnect.MainActivity;
import de.android.wordpressconnect.util.Log;


public class TabAdapter extends FragmentStatePagerAdapter {

    List<NavItem> actions;
    Context context;
    private Fragment mCurrentFragment;

    public TabAdapter(FragmentManager fm, List<NavItem> action, Context context) {
        super(fm);
        this.actions = action;
        this.context = context;
    }

    /**
     * Return fragment with respect to Position .
     */
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = fragmentFromAction(actions.get(position));
        return fragment;
    }

    @Override
    public void destroyItem (ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return actions.size();
    }

    @Override
    public void setPrimaryItem(ViewGroup container, int position, Object object) {
        if (getCurrentFragment() != object) {
            mCurrentFragment = ((Fragment) object);
        }
        super.setPrimaryItem(container, position, object);
    }

    public Fragment getCurrentFragment() {
        return mCurrentFragment;
    }

    /**
     * This method returns the title of the tab according to the position.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return actions.get(position).getText(context);
    }

    public static Fragment fragmentFromAction(NavItem action){
        try {
            Fragment fragment = action.getFragment().newInstance();

            Bundle args = new Bundle();
            args.putStringArray(MainActivity.FRAGMENT_DATA, action.getData());

            fragment.setArguments(args);

            return fragment;
        } catch (InstantiationException e) {
            Log.printStackTrace(e);
        } catch (IllegalAccessException e) {
            Log.printStackTrace(e);
        }

        return null;
    }
}
