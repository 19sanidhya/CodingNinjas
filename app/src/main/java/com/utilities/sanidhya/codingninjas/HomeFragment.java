package com.utilities.sanidhya.codingninjas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements BaseSliderView.OnSliderClickListener {

SliderLayout sliderLayout;
    ImageView puzzle;
    ImageView events;
Integer imageResource[]=new Integer[]{R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd};

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout=(SliderLayout)v.findViewById(R.id.home_image_slider);
        puzzle=(ImageView)v.findViewById(R.id.home_puzzle_iv);
        events=(ImageView)v.findViewById(R.id.home_events_iv);

        for(int i=1;i<5;i++)
        {
            TextSliderView textSliderView=new TextSliderView(getActivity());
            textSliderView
                    .description(i+"")
                    .image(imageResource[i-1])
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.RotateDown);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(2000);


        return v;

    }

    @Override
    public void onStop() {
        sliderLayout.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

        Toast.makeText(getActivity(), slider.getDescription(), Toast.LENGTH_SHORT).show();
    }
}
