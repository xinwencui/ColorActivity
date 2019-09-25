package temple.edu.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String color[];

    public ColorAdapter(Context context,String color[]){
        this.context = context;
        this.color =color;

    }

    @Override
    public int getCount() {
        return color.length;
    }

    @Override
    public Object getItem(int i) {
        return color[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String colorValue = color[i];
        textView.setText(colorValue);
        textView.setBackgroundColor(Color.parseColor((colorValue)));

        return textView;
    }
}
