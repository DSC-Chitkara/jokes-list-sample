package xyz.cybersapien.jokes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cybersapien on 15/3/18.
 */

public class JokeRecyclerAdapter extends RecyclerView.Adapter<JokeRecyclerAdapter.ViewHolder> {

    private ArrayList<Joke> jokesList;
    private Context context;

    public JokeRecyclerAdapter(ArrayList<Joke> jokesList, Context context) {
        this.jokesList = jokesList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(context)
                .inflate(R.layout.item_joke, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Joke joke = jokesList.get(position);
        viewHolder.titleView.setText(joke.getTitle());
        viewHolder.contentView.setText(joke.getContent());
        viewHolder.categoryView.setText(joke.getCategory());
    }

    @Override
    public int getItemCount() {
        return jokesList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleView;
        TextView contentView;
        TextView categoryView;

        public ViewHolder(View convertView) {
            super(convertView);
            titleView = convertView.findViewById(R.id.joke_title);
            contentView = convertView.findViewById(R.id.joke_content);
            categoryView = convertView.findViewById(R.id.joke_category);
        }
    }
}
