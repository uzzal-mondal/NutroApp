package com.example.nutroapp.onboarding_01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.nutroapp.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class OnBoardingAdapter extends PagerAdapter {


    Context context;
    DotsIndicator indicator;
    LayoutInflater layoutInflater;

    // create a constructor
    public OnBoardingAdapter(Context context) {
        this.context = context;
    }

    // crate a array for main image
    public int[] slide_images = {

            R.drawable.explorecircle,
            R.drawable.makecircle,
            R.drawable.sharecircle,
            // welcome nutro page
            R.drawable.welcomenutro_rectangle,

    };
    //create a array for sub image.
    public int[] slide_sub_images = {

            R.drawable.exploreimage,
            R.drawable.makeimage,
            R.drawable.shareimage,
            R.drawable.welcome_nutro_square

            // welcome nutro page
            // R.drawable.exploreimage,
    };
    // create a array for headings
    public String[] slide_headings = {

            "Explore",
            "Make",
            "Share",
            "Welcome To Nutro",
    };
    // create a array for desc
    public String[] slide_desc = {
            "Without a doubt there is something\n very relaxing and " +
                    "pleasurable about cooking and eating fresh food.",

            "Without a doubt there is something\n very relaxing and " +
                    "pleasurable about cooking and eating fresh food.",

            "Without a doubt there is something\n very relaxing and " +
                    "pleasurable about cooking and eating fresh food.",

            "Without a doubt there is something\n very relaxing and " +
                    "pleasurable about cooking and eating fresh food."

    };

    // page adapter two method want to override.
    @Override
    public int getCount() {
        return slide_headings.length;
    }

    // I don't understand.
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    // get a position - so, all of the view are generate here.
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = null;

        if (position == 0) {

            layoutInflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.on_boarding_layout,
                    container, false);

            ImageView imageSlide = (ImageView) view.findViewById(R.id.
                    imageSlide_explore_id);
            ImageView imageSubSlide = (ImageView) view.findViewById(R.id.
                    imageSlide_subExplore_id);
            TextView textHeadings = (TextView) view.findViewById(R.id.
                    textExplore_main_id);
            TextView textDesc = (TextView) view.findViewById(R.id.
                    textExplore_sub_id);

            imageSlide.setImageResource(slide_images[position]);
            imageSubSlide.setImageResource(slide_sub_images[position]);

            textHeadings.setText(slide_headings[position]);
            textDesc.setText(slide_desc[position]);

        } else if (position == 1) {

            layoutInflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.on_boarding_layout,
                    container, false);

            ImageView imageSlide = (ImageView) view.findViewById(R.id.
                    imageSlide_explore_id);
            ImageView imageSubSlide = (ImageView) view.findViewById(R.id.
                    imageSlide_subExplore_id);
            TextView textHeadings = (TextView) view.findViewById(R.id.
                    textExplore_main_id);
            TextView textDesc = (TextView) view.findViewById(R.id.
                    textExplore_sub_id);

            imageSlide.setImageResource(slide_images[position]);
            imageSubSlide.setImageResource(slide_sub_images[position]);
            textHeadings.setText(slide_headings[position]);
            textDesc.setText(slide_desc[position]);

        } else if (position == 2) {
            layoutInflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.on_boarding_layout, container, false);

            ImageView imageSlide = (ImageView) view.findViewById(R.
                    id.imageSlide_explore_id);
            ImageView imageSubSlide = (ImageView) view.findViewById(R.id.
                    imageSlide_subExplore_id);
            TextView textHeadings = (TextView) view.findViewById(R.id.
                    textExplore_main_id);
            TextView textDesc = (TextView) view.findViewById(R.id.
                    textExplore_sub_id);

            imageSlide.setImageResource(slide_images[position]);
            imageSubSlide.setImageResource(slide_sub_images[position]);
            textHeadings.setText(slide_headings[position]);
            textDesc.setText(slide_desc[position]);

        } else if (position == 3) {
            layoutInflater = (LayoutInflater) context
                    .getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.on_boarding_welcome_layout,
                    container, false);

           /* ImageView imageRectangle = (ImageView) view.findViewById(R.id.
                    image_rec_nutro_id);*/
           // ImageView imageSquare = (ImageView) view.findViewById(R.id.
                  //  image_square_nutro_id);

            // button find , this is for used to context ... ##
           // Button button = view.findViewById(R.id.buttonNutro_id);
           /* button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context, NutroSignUpActivity.class);
                    context.startActivity(intent);
                }
            });*/

            // just okey to done codding ... ##
            TextView textHeadings = (TextView) view.findViewById(R.id.
                    textHeadding_id);
            TextView textDesc = (TextView) view.findViewById(R.id.
                    textSub_id);
            //imageRectangle.setImageResource(slide_images[position]);
            //imageSquare.setImageResource(slide_sub_images[position]);
            // imageSquare.setImageResource(slide_sub_images[position]);
            // imageSubRec.setImageResource(slide_sub_images[position]);
            textHeadings.setText(slide_headings[position]);
            textDesc.setText(slide_desc[position]);
        }
        container.addView(view);
        return view;

    }

    // I don't understand ..!
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
