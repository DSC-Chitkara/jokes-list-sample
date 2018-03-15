package xyz.cybersapien.jokes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cybersapien on 13/3/18.
 */

public class JokeAdapter extends ArrayAdapter<Joke> {

    public JokeAdapter(Context context, List<Joke> jokeList) {
        super(context, R.layout.item_joke, jokeList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_joke, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Joke joke = getItem(position);

        viewHolder.titleView.setText(joke.getTitle());
        viewHolder.contentView.setText(joke.getContent());
        viewHolder.categoryView.setText(joke.getCategory());
        return convertView;
    }

    private static class ViewHolder {
        TextView titleView;
        TextView contentView;
        TextView categoryView;

        public ViewHolder(View convertView) {
            titleView = convertView.findViewById(R.id.joke_title);
            contentView = convertView.findViewById(R.id.joke_content);
            categoryView = convertView.findViewById(R.id.joke_category);
        }
    }
}
