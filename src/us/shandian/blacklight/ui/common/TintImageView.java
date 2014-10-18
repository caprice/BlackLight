/* 
 * Copyright (C) 2014 Peter Cai
 *
 * This file is part of BlackLight
 *
 * BlackLight is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BlackLight is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BlackLight.  If not, see <http://www.gnu.org/licenses/>.
 */

package us.shandian.blacklight.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;

import us.shandian.blacklight.R;

/*
 * TintImageView is a hacked ImageView
 * It tints the image with defined in xml
 * e.g. tintColor="?attr/DrawerForeground"
 */

public class TintImageView extends ImageView {

	public TintImageView(Context context) {
		this(context, null);
	}

	public TintImageView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public TintImageView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);

		if (attrs != null) {
			TypedArray arr = context.obtainStyledAttributes(attrs, R.styleable.TintImageView);
			setColorFilter(arr.getColor(R.styleable.TintImageView_tintColor, 0), PorterDuff.Mode.SRC_IN);
			arr.recycle();
		}
	}
}
