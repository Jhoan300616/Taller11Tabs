package com.example.taller11tabs.Controlador;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerController extends FragmentPagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                return new Contactos();

            case 1:
                return  new Correos();

            case 2:
                return new Mensajes();

            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
