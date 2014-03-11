package com.example.fragmenttester;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class DisplayFragment extends Fragment{
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.imagedisplayer,
				container, false);
		
		ImageView displayimage = (ImageView)rootView.findViewById(R.id.displayimage);
		
		Bundle args = getArguments();
		
		Bitmap b = BitmapFactory.decodeByteArray(args.getByteArray("bitmap"),0,args.getByteArray("bitmap").length);        
		displayimage.setImageBitmap(b);
		
		return rootView;
	}
}

