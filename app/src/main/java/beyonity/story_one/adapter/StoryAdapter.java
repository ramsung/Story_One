package beyonity.story_one.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import beyonity.story_one.R;
import beyonity.story_one.models.stories;

/**
 * Created by mohan on 9/15/17.
 */

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.storyFieldHolder> {
	List<stories> storylist;
	Context context;

	public StoryAdapter(List<stories> storylist, Context context) {
		this.storylist = storylist;
		this.context = context;
	}

	@Override
	public storyFieldHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.stories_list_view,parent,false);
		RecyclerView.ViewHolder viewHolder = new storyFieldHolder(view);
		return (storyFieldHolder) viewHolder;
	}

	@Override
	public void onBindViewHolder(storyFieldHolder holder, int position) {
			stories story = storylist.get(position);
			holder.storyTitle.setText(story.getStoryTitle());
			holder.category.setText(story.getCategory());
			holder.likes.setText(story.getLikes());
			holder.dislikes.setText(story.getDislikes());


	}

	@Override
	public int getItemCount() {
		return storylist.size();
	}

	class storyFieldHolder extends RecyclerView.ViewHolder {
		TextView storyTitle,category,likes,dislikes;
		ImageView storyCover;

		public storyFieldHolder(View itemView) {
			super(itemView);
			storyTitle = (TextView) itemView.findViewById(R.id.Book_Tiltle);
			category = (TextView) itemView.findViewById(R.id.category);
			likes = (TextView) itemView.findViewById(R.id.likes);
			dislikes = (TextView) itemView.findViewById(R.id.dislikes);
			storyCover = (ImageView) itemView.findViewById(R.id.imageView);


		}
	}
}
